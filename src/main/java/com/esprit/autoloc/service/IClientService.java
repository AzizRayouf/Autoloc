package com.esprit.autoloc.service;
import com.esprit.autoloc.domain.Client;
import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    List<Client> afficherTousLesClients();
    Client afficherClientParId(Long id);
    void supprimerClient(Long id);
}