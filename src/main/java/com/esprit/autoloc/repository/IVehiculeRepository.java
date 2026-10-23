package com.esprit.autoloc.repository;
import com.esprit.autoloc.domain.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {}