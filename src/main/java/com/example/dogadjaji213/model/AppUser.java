package com.example.dogadjaji213.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    public AppUser(String firstName,String lastName,String email,String password){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.isBanned=false;
    }
    public AppUser(UUID id,String firstName,String lastName,String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }
    @Id
    @GeneratedValue(

    )
    private UUID id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @JsonIgnore
    private String password;
    private Boolean isBanned;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="role_id")
    private Role role;
}
