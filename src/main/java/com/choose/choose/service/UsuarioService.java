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

    public boolean retornaEmail(Usuario usuario){
        for(Usuario usuarioCadastrado : usuarios){
            if(usuarioCadastrado.getEmail().equals(usuario.getEmail())){
                return true; // já existe cadastro com esse email.
            }
        }
        return false; // não encontrou igual
    }

    public String deletarUsuario(Usuario usuarioDelete){
        for(Usuario pessoa : usuarios){
            if(pessoa.getEmail().equals(usuarioDelete.getEmail())){
                usuarios.remove(pessoa);
                return "Usuário removido com sucesso";
            }
        }
        return "Usuário não encontrado";
    }
}
