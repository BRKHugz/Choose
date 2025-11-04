package com.choose.choose.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.choose.choose.modelos.Carro;

@Service
public class CarroService {
    
    private final List<Carro> carros = new ArrayList<>(); // Lista de carros
    private final Map<String, Double> tabelaFipe = new HashMap<>(); //Simulador de tabela fipe:

    public CarroService(){
        tabelaFipe.put("Gol", 50000.0);
        tabelaFipe.put("Onix", 70000.0);
        tabelaFipe.put("Civic", 120000.0);
        tabelaFipe.put("Corolla", 130000.0);
    }

    public void salvarCarro(Carro carro){
        carros.add(carro);
    }

    public List<Carro> listarCarros(){
        return carros;
    }

    public Carro buscarModelo(String modelo){
        for(Carro altomovel : carros){
            if(altomovel.getModelo().equalsIgnoreCase(modelo)){
                return altomovel;
            }
        }
        return null;
    }
    
    public double retornaValorFipe(String modelo){
        return tabelaFipe.get(modelo);
    }


}
