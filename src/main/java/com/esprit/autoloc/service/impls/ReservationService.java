package com.esprit.autoloc.service.impls;
import com.esprit.autoloc.domain.Reservation;
import com.esprit.autoloc.repository.IReservationRepository;
import com.esprit.autoloc.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    private final IReservationRepository reservationRepository;

    @Override public Reservation ajouterReservation(Reservation reservation) { return reservationRepository.save(reservation); }
    @Override public List<Reservation> afficherToutesLesReservations() { return reservationRepository.findAll(); }
    @Override public Reservation afficherReservationParId(Long id) { return reservationRepository.findById(id).orElse(null); }
    @Override public void supprimerReservation(Long id) { reservationRepository.deleteById(id); }
}