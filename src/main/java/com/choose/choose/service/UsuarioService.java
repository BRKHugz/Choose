package com.choose.choose.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.choose.choose.modelos.Usuario;

@Service
public class UsuarioService {

    private final List<Usuario> usuarios = new ArrayList<>();

    public void salvarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public List<Usuario> listarUsuario(){
        return usuarios;
    }

}
