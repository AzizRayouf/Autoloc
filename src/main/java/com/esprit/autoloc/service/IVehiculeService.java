package com.esprit.autoloc.service;
import com.esprit.autoloc.domain.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    List<Vehicule> afficherTousLesVehicules();
    Vehicule afficherVehiculeParId(Long id);
    void supprimerVehicule(Long id);
}