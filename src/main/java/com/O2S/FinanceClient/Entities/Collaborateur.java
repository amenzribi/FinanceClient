package com.O2S.FinanceClient.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Collaborateur")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Collaborateur {

    @Id
    @Column(name = "CO_No")
    private Integer CO_No;

    @Column(name = "CO_Nom")
    private String CoNom ;
    @Column(name = "CO_Prenom")
    private String CoPrenom;

    @Column(name = "CO_Adresse")
    private String CoAdresse ;





    @OneToMany//(mappedBy = "collaborateur" ,cascade = CascadeType.ALL)
    private List<Client> clients;



    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }


}
