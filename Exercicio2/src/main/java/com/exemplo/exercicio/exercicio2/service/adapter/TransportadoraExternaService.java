package com.exemplo.exercicio.exercicio2.service.adapter;

import com.exemplo.exercicio.exercicio2.repository.FreteRepository;
import com.exemplo.exercicio.exercicio2.service.strategies.TransportadoraService;
import org.springframework.stereotype.Service;

@Service("transportadoraExterna")
public class TransportadoraExternaService implements FreteRepository {
    private final TransportadoraService transportadoraService;

    public TransportadoraExternaService() {
        transportadoraService = new TransportadoraService();
    }

    @Override
    public double calcular(double peso) {
        System.out.println("Calculando frete com transportadora externa...");
        return transportadoraService.calcular(peso) * 2.5;
    }

    @Override
    public String modalidade() {
        return "transportadoraExterna";
    }
}
