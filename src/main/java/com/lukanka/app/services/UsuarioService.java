package com.lukanka.app.services;

import java.util.List;

import com.lukanka.app.entities.Usuario;

public interface UsuarioService {

    public Usuario crearUsuario(Usuario usuario);

    public List<Usuario> listarUsuarios();

    public Usuario buscarPorId(int id);

    public Usuario actualizarUsuario(int id, Usuario usuario);

    public Usuario eliminarUsuario(int id);

    public Usuario buscarPorNombre(String nombre);

}
