package com.esprit.autoloc.repository;
import com.esprit.autoloc.domain.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeRepository extends JpaRepository<Employe, Long> {}