package com.esprit.autoloc.service;
import com.esprit.autoloc.domain.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    List<Paiement> afficherTousLesPaiements();
    Paiement afficherPaiementParId(Long id);
    void supprimerPaiement(Long id);
}