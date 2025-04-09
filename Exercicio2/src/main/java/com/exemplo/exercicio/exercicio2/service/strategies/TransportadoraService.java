package com.exemplo.exercicio.exercicio2.service.strategies;

import com.exemplo.exercicio.exercicio2.repository.FreteRepository;
import org.springframework.stereotype.Component;

@Component
public class TransportadoraService implements FreteRepository {
    @Override
    public double calcular(double peso) {
        return peso * 10.5;
    }

    @Override
    public String modalidade() {
        return "transportadora";
    }
}
