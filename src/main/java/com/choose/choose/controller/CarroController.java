package com.choose.choose.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choose.choose.modelos.Carro;
import com.choose.choose.service.CarroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService serviceCarro; // Composição com atributo de uma outra classe

    @PostMapping("/cadastrar")
    public String cadastrarCarro(@RequestBody Carro carro){
        serviceCarro.salvarCarro(carro);
        return "Carro cadastrado com sucesso!";
    }
    
    @GetMapping("/listar")
    public List<Carro> listarCarros(){
        return serviceCarro.listarCarros();
    }

    @GetMapping("/comparar/{modelo}")
    public String comparaPreco(@PathVariable String modelo){
        Carro carro = serviceCarro.buscarModelo(modelo);
        Double precoFipe = serviceCarro.retornaValorFipe(modelo);

        if(carro == null) return "Carro não encontrado";
        
        if(precoFipe == null) return "Modelo não encontrado na tabela fipe";
        

        double diferenca = carro.getPreco() - precoFipe;

        if (carro.getPreco() >= precoFipe){
            return "| Preço do anuncio: "+carro.getPreco()+"\n| Preço desse carro na tabela FIPE: "+precoFipe+"\n| Diferença de preço: "+diferenca+"\n| Alerta: não recomendamos a compra desse carro, pois está acima do preço!";
        } else{
            return "| Preço do anuncio: "+carro.getPreco()+"\n| Preço desse carro na tabela FIPE: "+precoFipe+"\n| Diferença de preço: "+diferenca+"\n| Alerta: recomendamos a compra desse carro, pois está abaxido do preço da tabela fipe!";
        }
    }
}
