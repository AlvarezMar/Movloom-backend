package com.alvarezmar.movloom_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

/*
 * RestTemplate: Clase de Spring que permite realizar operaciones HTTP de manera
 * sencilla y manejar las respuestas de estos servicios.
 * Es una herramienta clave para interactuar con APIs externas.
 * 
 * Bean: Un bean en Spring es un objeto que el contenedor de Spring crea,
 * configura y gestiona. Esto incluye la instanciación del objeto, la inyección
 * de dependencias y la gestión de su ciclo de vida. El uso de beans permite una
 * arquitectura desacoplada y flexible en aplicaciones Spring.
 */
