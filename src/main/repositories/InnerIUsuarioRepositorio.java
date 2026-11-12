    package com.example.NutreApp.repositories;

    import java.util.Optional;
import java.util.UUID;

import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreApp.models.Usuario;

import models.helpers.Departamento;

    
    @Repository 
    public interface InnerIUsuarioRepositorio extends JpaRepository<Usuario,UUID>{


        //conultas prefabricadas(solo sirve para BUSCAR)//

        //1. NUSCAR UN USUARIO ASOCIADO A UNN DEPARTAMENTO Y UN ROL ESPECIFICO

        list<Usuario> findByDepartamentoAndRol(String departamento, String rol);

        Optional<Usuario> findByCorreo(String correo);

        List<Usuario> findByRolOrderByNombreAsc(String rol);

        boolean existsByCorreo(String correo);
    }



