package com.esprit.autoloc.repository;
import com.esprit.autoloc.domain.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContratRepository extends JpaRepository<Contrat, Long> {}