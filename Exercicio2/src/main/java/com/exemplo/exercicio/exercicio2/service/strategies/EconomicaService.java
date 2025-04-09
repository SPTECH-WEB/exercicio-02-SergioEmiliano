package com.exemplo.exercicio.exercicio2.service.strategies;

import com.exemplo.exercicio.exercicio2.repository.FreteRepository;
import org.springframework.stereotype.Component;

@Component
public class EconomicaService implements FreteRepository {
    @Override
    public double calcular(double peso){
        return peso * 3.0;
    }

    @Override
    public String modalidade(){
        return "economica";
    }
}
