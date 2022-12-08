package com.example.macnssapp.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Dossier implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ref;
    @Length(max = 10)
    private String status;
    private String description;

    @ManyToOne
    private Agent agent;

    @ManyToOne
    private Client client;
}
