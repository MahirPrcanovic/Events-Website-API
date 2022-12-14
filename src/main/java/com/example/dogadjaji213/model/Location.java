package com.example.dogadjaji213.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.UUID;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    public Location(String name,String description,String pictureUrl){
        this.name=name;
        this.description=description;
        this.pictureUrl=pictureUrl;
    }
    @Id
    @GeneratedValue()
    private UUID id;
    private String name;
    @Column(columnDefinition="TEXT")
    private String description;
    private String pictureUrl;

    @OneToMany(
            mappedBy = "location",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<Event> events;
}
