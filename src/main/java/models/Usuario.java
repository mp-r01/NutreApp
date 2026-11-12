package com.example.NutreApp.models;

import java.util.UUID;

import com.example.NutreApp.models.helpers.Rol;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import models.helpers.Departamento;


@Entity 
@Table (name="usuarios")

public class Usuario {

    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;

    @Column (name="titulo", nulleble = false , unique = false, length = 100)
    private String nombre;

    @Column(name =)"correcto",nullable = false, unique = true, length = 80)
    private String correo;

    @Enumerated(EnumType.STRING)
    @Column (name="rol", nullable = false, unique = false)
    private String Rol;

    @Enumerated (EnumType.STRING)
    @Column(name="departamento", nullable = false, unique = false)
    private Departamento departamento;
    
    @Column(name="contraseña_hash", nullable = false, unique = false)
    private String contrasena_hash;

    //CREANDO RELACIONES //
    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference(value = "usuario-visualizacion")
    private List <Visualizacion> visualizaciones;



    public Usuario() {
    }
    public Usuario(UUID id, String nombre, String correo, String rol, Departamento departamento,
            String contrasenia_hash) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        Rol = rol;
        this.departamento = departamento;
        this.contrasenia_hash = contrasenia_hash;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getRol() {
        return Rol;
    }
    public void setRol(String rol) {
        Rol = rol;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getContrasenia_hash() {
        return contrasenia_hash;
    }
    public void setContrasenia_hash(String contrasenia_hash) {
        this.contrasenia_hash = contrasenia_hash;
    }
    
}
