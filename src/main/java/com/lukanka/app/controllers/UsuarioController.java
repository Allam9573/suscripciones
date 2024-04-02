package com.lukanka.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.app.entities.Usuario;
import com.lukanka.app.services.impl.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return this.usuarioServiceImpl.crearUsuario(usuario);
    }

}
