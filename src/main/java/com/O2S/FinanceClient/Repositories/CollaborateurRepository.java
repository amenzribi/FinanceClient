package com.O2S.FinanceClient.Repositories;

import com.O2S.FinanceClient.Entities.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollaborateurRepository extends JpaRepository<Collaborateur,Integer > {
    List<Collaborateur> findAll();
}
