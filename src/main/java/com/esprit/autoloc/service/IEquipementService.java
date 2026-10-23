package com.esprit.autoloc.service;
import com.esprit.autoloc.domain.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    List<Equipement> afficherTousLesEquipements();
    Equipement afficherEquipementParId(Long id);
    void supprimerEquipement(Long id);
}