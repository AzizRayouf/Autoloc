package com.esprit.autoloc.service.impls;
import com.esprit.autoloc.domain.Agence;
import com.esprit.autoloc.repository.IAgenceRepository;
import com.esprit.autoloc.service.IAgenceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    private final IAgenceRepository agenceRepository;

    @Override public Agence ajouterAgence(Agence agence) { return agenceRepository.save(agence); }
    @Override public List<Agence> afficherToutesLesAgences() { return agenceRepository.findAll(); }
    @Override public Agence afficherAgenceParId(Long id) { return agenceRepository.findById(id).orElse(null); }
    @Override public void supprimerAgence(Long id) { agenceRepository.deleteById(id); }
}