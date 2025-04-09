package com.exemplo.exercicio.exercicio2.controller;

import com.exemplo.exercicio.exercicio2.repository.FreteRepository;
import com.exemplo.exercicio.exercicio2.service.FreteService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fretes")
public class FreteController {

    private final FreteService freteService;
    private final FreteRepository freteRepository;

    public FreteController(@Qualifier("transportadoraExterna") FreteRepository freteRepository, FreteService freteService){
        this.freteService = freteService;
        this.freteRepository = freteRepository;
    }

    @GetMapping
    public String calcularFrete(@RequestParam String modalidade,@RequestParam double peso){
        double valor = freteService.calcular(modalidade, peso);
        return "Frete da modalidade: (" + modalidade +"), com o peso de: " + peso + "Kg:, e o valor de: R$ " + valor;
    }

    @GetMapping("/transportadoraExterna")
    public String calcularFreteTransportadoraExterna(@RequestParam double peso){
        double valor = freteRepository.calcular(peso);
        return "Frete (transportadoraExterna) para " + peso + "Kg:, com o valor de: R$ " + valor;
    }

}
