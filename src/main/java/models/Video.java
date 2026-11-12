package com.example.NutreApp.models;

import java.util.UUID;
import com.example.NutreApp.models.helpers.CategoriaVideo;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Video {
 
    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @Column(name = "titulo", nullable = false, unique = false)
    private String titulo;

    @Column (name = "descripcion", nullable = false, unique = false)
    private String descripcion;

    @Column (name = "url",nullable = false, unique = false )
    private String url;

    @Column (name = "categoria", nullable = false, unique = false)
    private Categoria categoria;
    
    @ManyToOne(mappedBy="video")
    @JoinColumn (name="id")
    private Video video 

    private List<Visualizacion> visualizaciones;

    public Video() {
        
    }

    public Video(UUID id, String titulo, String descripcion, String url, CategoriaVideo categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.categoria = categoria;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public CategoriaVideo getCategoria() { return categoria; }
    public void setCategoria(CategoriaVideo categoria) { this.categoria = categoria; }
}
