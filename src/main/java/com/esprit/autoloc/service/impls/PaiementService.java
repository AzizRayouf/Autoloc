package com.esprit.autoloc.service.impls;
import com.esprit.autoloc.domain.Paiement;
import com.esprit.autoloc.repository.IPaiementRepository;
import com.esprit.autoloc.service.IPaiementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService {
    private final IPaiementRepository paiementRepository;

    @Override public Paiement ajouterPaiement(Paiement paiement) { return paiementRepository.save(paiement); }
    @Override public List<Paiement> afficherTousLesPaiements() { return paiementRepository.findAll(); }
    @Override public Paiement afficherPaiementParId(Long id) { return paiementRepository.findById(id).orElse(null); }
    @Override public void supprimerPaiement(Long id) { paiementRepository.deleteById(id); }
}