package com.lukanka.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.app.entities.Usuario;
import com.lukanka.app.respositories.UsuarioRepository;
import com.lukanka.app.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarPorId(int id) {
        return this.usuarioRepository.findById(id).get();
    }

}
