package com.esprit.autoloc.service;
import com.esprit.autoloc.domain.Employe;
import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);
    List<Employe> afficherTousLesEmployes();
    Employe afficherEmployeParId(Long id);
    void supprimerEmploye(Long id);
}