package com.esprit.autoloc.service.impls;
import com.esprit.autoloc.domain.Contrat;
import com.esprit.autoloc.repository.IContratRepository;
import com.esprit.autoloc.service.IContratService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    private final IContratRepository contratRepository;

    @Override public Contrat ajouterContrat(Contrat contrat) { return contratRepository.save(contrat); }
    @Override public List<Contrat> afficherTousLesContrats() { return contratRepository.findAll(); }
    @Override public Contrat afficherContratParId(Long id) { return contratRepository.findById(id).orElse(null); }
    @Override public void supprimerContrat(Long id) { contratRepository.deleteById(id); }
}