package com.esprit.autoloc.repository;
import com.esprit.autoloc.domain.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAgenceRepository extends JpaRepository<Agence, Long> {
}