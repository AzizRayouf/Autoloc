package com.esprit.autoloc.service.impls;

import com.esprit.autoloc.domain.Vehicule;
import com.esprit.autoloc.repository.IVehiculeRepository;
import com.esprit.autoloc.service.IVehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Très important pour que Spring reconnaisse ce service
@AllArgsConstructor // Lombok va créer le constructeur pour l'injection de dépendances
public class VehiculeService implements IVehiculeService {

    // Injection du repository
    private final IVehiculeRepository vehiculeRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule); // save() est fourni gratuitement par JpaRepository !
    }

    @Override
    public List<Vehicule> afficherTousLesVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule afficherVehiculeParId(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public void supprimerVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }
}