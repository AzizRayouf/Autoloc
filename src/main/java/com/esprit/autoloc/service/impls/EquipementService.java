package com.esprit.autoloc.service.impls;
import com.esprit.autoloc.domain.Equipement;
import com.esprit.autoloc.repository.IEquipementRepository;
import com.esprit.autoloc.service.IEquipementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {
    private final IEquipementRepository equipementRepository;

    @Override public Equipement ajouterEquipement(Equipement equipement) { return equipementRepository.save(equipement); }
    @Override public List<Equipement> afficherTousLesEquipements() { return equipementRepository.findAll(); }
    @Override public Equipement afficherEquipementParId(Long id) { return equipementRepository.findById(id).orElse(null); }
    @Override public void supprimerEquipement(Long id) { equipementRepository.deleteById(id); }
}