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

    public boolean retornaNick(Usuario usuario){
        for(Usuario usuarioCadastrado : usuarios){
            
            String nickCadastrado = usuarioCadastrado.getNick(); // desse jeito, torna a aplicação mais lenta
            String nickNovo = usuario.getNick();

            if(nickCadastrado.equals(nickNovo)){
                return true; // já existe cadastro com esse email.
            }
        }
        return false; // não encontrou igual
    }

    public String deletarUsuario(String nick, Usuario usuarioDelete){
        for(Usuario pessoa : usuarios){
            // a mesma ideia do método retorna nick
            if(pessoa.getNick().equals(nick)){
                usuarios.remove(pessoa);
                return "Usuário removido com sucesso";
            }
        }
        return "Usuário não encontrado";
    }

    public String atualizarUsuario(String nick, Usuario usuarioAtualize){
        for(Usuario usuarioCadastrado : usuarios){
            if(usuarioCadastrado.getNick().equals(nick)){

                usuarioCadastrado.setNome(usuarioAtualize.getNome());
                usuarioCadastrado.setEmail(usuarioAtualize.getEmail());
                usuarioCadastrado.setSenha(usuarioAtualize.getSenha());

                return "Usuário atualizado com sucesso!";
            }
        }
        return "Usuário não encontrado na lista!";
    }
}
