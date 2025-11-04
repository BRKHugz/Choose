package com.choose.choose.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choose.choose.modelos.Usuario;
import com.choose.choose.service.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired // usado para injetar o service no controller
    private UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public String cadastrarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
        return "Usuário cadastrado!";
    }

    @GetMapping("/lista")
    public List<Usuario> listarUsuario(){
        return usuarioService.listarUsuario();
    }
}
