package com.esprit.autoloc.repository;
import com.esprit.autoloc.domain.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMaintenanceRepository extends JpaRepository<Maintenance, Long> {}