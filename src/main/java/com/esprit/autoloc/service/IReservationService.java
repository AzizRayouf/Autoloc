package com.esprit.autoloc.service;
import com.esprit.autoloc.domain.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    List<Reservation> afficherToutesLesReservations();
    Reservation afficherReservationParId(Long id);
    void supprimerReservation(Long id);
}