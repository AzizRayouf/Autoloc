package com.esprit.autoloc.Web.Controller;

import com.esprit.autoloc.domain.Vehicule;
import com.esprit.autoloc.service.IVehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indique à Spring que c'est un Controller API REST
@RequestMapping("/api/vehicules") // L'URL de base pour ce controller
@AllArgsConstructor // Pour l'injection du service
public class VehiculeRestController {

    private final IVehiculeService vehiculeService;

    // 1. Ajouter un véhicule
    @PostMapping("/ajouter")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    // 2. Afficher tous les véhicules
    @GetMapping("/afficher")
    public List<Vehicule> afficherTousLesVehicules() {
        return vehiculeService.afficherTousLesVehicules();
    }

    // 3. Afficher un véhicule par son ID
    @GetMapping("/afficher/{id}")
    public Vehicule afficherVehiculeParId(@PathVariable Long id) {
        return vehiculeService.afficherVehiculeParId(id);
    }

    // 4. Supprimer un véhicule
    @DeleteMapping("/supprimer/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }
}
