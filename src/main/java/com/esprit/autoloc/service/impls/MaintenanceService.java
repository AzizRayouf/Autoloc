package com.esprit.autoloc.service.impls;
import com.esprit.autoloc.domain.Maintenance;
import com.esprit.autoloc.repository.IMaintenanceRepository;
import com.esprit.autoloc.service.IMaintenanceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {
    private final IMaintenanceRepository maintenanceRepository;

    @Override public Maintenance ajouterMaintenance(Maintenance maintenance) { return maintenanceRepository.save(maintenance); }
    @Override public List<Maintenance> afficherToutesLesMaintenances() { return maintenanceRepository.findAll(); }
    @Override public Maintenance afficherMaintenanceParId(Long id) { return maintenanceRepository.findById(id).orElse(null); }
    @Override public void supprimerMaintenance(Long id) { maintenanceRepository.deleteById(id); }
}