package com.esprit.autoloc.service.impls;
import com.esprit.autoloc.domain.Employe;
import com.esprit.autoloc.repository.IEmployeRepository;
import com.esprit.autoloc.service.IEmployeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {
    private final IEmployeRepository employeRepository;

    @Override public Employe ajouterEmploye(Employe employe) { return employeRepository.save(employe); }
    @Override public List<Employe> afficherTousLesEmployes() { return employeRepository.findAll(); }
    @Override public Employe afficherEmployeParId(Long id) { return employeRepository.findById(id).orElse(null); }
    @Override public void supprimerEmploye(Long id) { employeRepository.deleteById(id); }
}