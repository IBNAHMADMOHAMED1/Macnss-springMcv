package com.example.macnssapp.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Client extends User{
    private String ref;

    @ManyToOne
    private Agent agent;

    @OneToMany(mappedBy = "client")
    private List<Dossier> dossier;
}
