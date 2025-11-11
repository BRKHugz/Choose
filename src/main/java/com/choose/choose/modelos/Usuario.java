package com.choose.choose.modelos;

import lombok.Data;

@Data
public class Usuario {
    private String nick;
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String nick, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nick = nick;
    }
}
