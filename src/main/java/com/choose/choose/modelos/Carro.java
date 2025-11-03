package com.choose.choose.modelos;

import lombok.Data; // serve como um biblioteca para gerar getters e setters, por baixo dos panos

@Data
public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    // construtor
    public Carro(String modelo, String marca, int ano, double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }
}
