package com.esprit.autoloc.service;
import com.esprit.autoloc.domain.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    List<Contrat> afficherTousLesContrats();
    Contrat afficherContratParId(Long id);
    void supprimerContrat(Long id);
}