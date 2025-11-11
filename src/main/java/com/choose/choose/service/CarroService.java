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
        tabelaFipe.put("Nivus", 90000.0);
        tabelaFipe.put("Argo", 80000.0);
        tabelaFipe.put("Polo", 85000.0);
        tabelaFipe.put("T-Cross", 125000.0);
        tabelaFipe.put("HB20", 78000.0);
        tabelaFipe.put("Mobi", 62000.0);
        tabelaFipe.put("Creta", 130000.0);
        tabelaFipe.put("HR-V", 145000.0);
        tabelaFipe.put("Corolla Cross", 165000.0);
        tabelaFipe.put("Saveiro", 90000.0);
        tabelaFipe.put("Tracker", 130000.0);
        tabelaFipe.put("Compass", 175000.0);
        tabelaFipe.put("Kicks", 115000.0);
        tabelaFipe.put("Kwid", 65000.0);
        tabelaFipe.put("Fastback", 140000.0);
        tabelaFipe.put("Toro", 165000.0);
        tabelaFipe.put("Pulse", 110000.0);
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
