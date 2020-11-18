package io.github.raphaeldecm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MainConfiguration {
    
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO CONFIGURAÇÃO DE DESENVOLVIMENTO.");
        };
    }

}
