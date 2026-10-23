package com.esprit.autoloc.service.impls;
import com.esprit.autoloc.domain.Client;
import com.esprit.autoloc.repository.IClientRepository;
import com.esprit.autoloc.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {
    private final IClientRepository clientRepository;

    @Override public Client ajouterClient(Client client) { return clientRepository.save(client); }
    @Override public List<Client> afficherTousLesClients() { return clientRepository.findAll(); }
    @Override public Client afficherClientParId(Long id) { return clientRepository.findById(id).orElse(null); }
    @Override public void supprimerClient(Long id) { clientRepository.deleteById(id); }
}