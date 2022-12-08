package com.example.macnssapp.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Agent extends User {

    @Temporal(TemporalType.DATE)
    private Date passwordTime;

    @OneToMany(mappedBy = "agent")
    private List<Client> clients;

    @OneToMany(mappedBy = "agent")
    private List<Dossier> dossiers;
}
