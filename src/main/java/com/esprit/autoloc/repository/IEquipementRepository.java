package com.esprit.autoloc.repository;
import com.esprit.autoloc.domain.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipementRepository extends JpaRepository<Equipement, Long> {}