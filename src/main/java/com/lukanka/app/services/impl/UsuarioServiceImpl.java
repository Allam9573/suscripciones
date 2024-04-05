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

    @Override
    public Usuario actualizarUsuario(int id, Usuario usuario) {
        Usuario usuarioActualizar = this.usuarioRepository.findById(id).get();
        if (null != usuarioActualizar) {
            usuarioActualizar.setNombre(usuario.getNombre());
            usuarioActualizar.setApellido(usuario.getApellido());
            usuarioActualizar.setDireccionFacturacion(usuario.getDireccionFacturacion());
            this.usuarioRepository.save(usuarioActualizar);
        }
        return usuarioActualizar;
    }

    @Override
    public Usuario eliminarUsuario(int id) {
        Usuario usuarioEliminar = this.usuarioRepository.findById(id).get();
        if (usuarioEliminar != null) {
            this.usuarioRepository.delete(usuarioEliminar);
            return usuarioEliminar;
        } else {
            return null;
        }
    }

    @Override
    public Usuario buscarPorNombre(String nombre) {
        return this.usuarioRepository.findByNombre(nombre);
    }

}
