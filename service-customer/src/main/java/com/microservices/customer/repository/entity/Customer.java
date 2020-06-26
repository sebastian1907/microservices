package com.microservices.customer.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "customers")
@Data
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El número de documento no debe estar vacio")
    @Size(min = 8, max = 8, message = "El número de documento debe ser de 8 caracteres")
    @Column(name = "number_id", unique = true, length = 8, nullable = false)
    private String numberID;

    @NotEmpty(message = "El nombre no debe ser vacio")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotEmpty(message = "El apellido no puede ser vacío.")
    @Column(name = "last_name", nullable = false)
    private String LastName;

    @NotEmpty(message = "El correo no puede ser vacío.")
    @Email(message = "No es una dirección de correo valida.")
    @Column(unique = true, nullable = false)
    private String email;

    @NotNull(message = "La región no puede ser vacio")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Region region;

    private String state;

    @Column(name="photo_url")
    private String PhotoUrl;
}
