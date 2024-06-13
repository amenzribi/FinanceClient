package com.O2S.FinanceClient.Repositories;

import com.O2S.FinanceClient.Entities.Client;
import com.O2S.FinanceClient.Entities.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,String> {
    List<Client> findAll();

    // Méthode pour récupérer les clients par collaborateur
    List<Client> findByCollaborateur(Collaborateur collaborateur);
}
