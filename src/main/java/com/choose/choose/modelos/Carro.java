package com.choose.choose.modelos;

import lombok.Data; // serve como um biblioteca para gerar getters e setters, por baixo dos panos

@Data
public class Carro {
    private String modelo;
    private String marca;
    private String versao;
    private String cor;
    private int quilometragem;
    private int ano;
    private double preco;
    private String cambio;
    private int quantidadeDePortas;
    private String potenciaMotor;

    // construtor
    public Carro(
        String modelo, String marca, String versao, int ano, double preco, String cambio, 
        int quantidadeDePortas, String potenciaMotor, String cor, int quilometragem
    ){   
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.modelo = modelo;
        this.marca = marca;
        this.versao = versao;
        this.ano = ano;
        this.preco = preco;
        this.cambio = cambio;
        this.quantidadeDePortas = quantidadeDePortas;
    }
}
