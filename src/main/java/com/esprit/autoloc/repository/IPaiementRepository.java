package com.esprit.autoloc.repository;
import com.esprit.autoloc.domain.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaiementRepository extends JpaRepository<Paiement, Long> {}