package com.O2S.FinanceClient.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Client")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @Column(name = "CT_Num")
    private String ctNum;

    @Column(name = "CT_Intitule")
    private String ctIntitule;

    @Column(name = "CT_Adresse")
    private String ctAdresse;

    @Column(name = "CT_Ville")
    private String ctVille;

    @Column(name = "CT_Pays")
    private String ctPays;

    @Column(name = "CT_EMail")
    private String ctEmail;

    @Column(name = "CT_ControlEnc")
    private Integer blocage ;

    @Column(name = "CT_Telephone")
    private String ctTelephone;

    @Column(name = "CT_Encours")
    private Double ctEncours;


    @ManyToOne
    @JoinColumn(name = "CO_No", referencedColumnName = "CO_No")
    private Collaborateur collaborateur;



    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
}

