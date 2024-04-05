package com.lukanka.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.app.entities.Usuario;
import com.lukanka.app.services.impl.UsuarioServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping({ "", "/" })
    public List<Usuario> listarUsuarios() {
        return this.usuarioServiceImpl.listarUsuarios();
    }

    @GetMapping("/buscar")
    public Usuario buscarUsuario(@RequestParam(defaultValue = "4") int id) {
        return this.usuarioServiceImpl.buscarPorId(id);
    }

    @PutMapping("/actualizar/{id}")
    public Usuario actualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        return this.usuarioServiceImpl.actualizarUsuario(id, usuario);
    }

    @DeleteMapping("/eliminar/{id}")
    public Usuario eliminarUsuario(@PathVariable int id) {
        return this.usuarioServiceImpl.eliminarUsuario(id);
    }

    @GetMapping("/buscar/nombre")
    public Usuario buscarPorNombre(@RequestParam String q) {
        return this.usuarioServiceImpl.buscarPorNombre(q);
    }
}
