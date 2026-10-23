package com.esprit.autoloc.service;
import com.esprit.autoloc.domain.Agence;
import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    List<Agence> afficherToutesLesAgences();
    Agence afficherAgenceParId(Long id);
    void supprimerAgence(Long id);
}