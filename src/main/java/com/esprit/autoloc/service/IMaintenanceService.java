package com.esprit.autoloc.service;
import com.esprit.autoloc.domain.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    List<Maintenance> afficherToutesLesMaintenances();
    Maintenance afficherMaintenanceParId(Long id);
    void supprimerMaintenance(Long id);
}