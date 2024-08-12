package com.alvarezmar.movloom_backend.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alvarezmar.movloom_backend.models.NowPlayingResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MovieService {

    @Value("${api.themoviedb.key}")
    private String apiKey;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public MovieService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    public NowPlayingResponse getNowPlayingMovies() throws Exception {
        String url = "https://api.themoviedb.org/3/movie/now_playing?api_key=" + apiKey;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        return objectMapper.readValue(response.getBody(), NowPlayingResponse.class);
    }

}

/*
 * @Value: Inyecta el valor de la propiedad 'api.themoviedb.key' desde
 * application.properties.
 * 
 * RestTemplate: La instacncia de RestTemplate se utilizará para realizar la
 * llamada a la API externa.
 * 
 * ObjectMapper: Deserializa la respuesta JSON de la API en un objeto Java.
 * 
 * throws Exception: Indica que el método puede lanzar excepciones que deben ser
 * manejadas por el código que llama al método (Por el controlador en este
 * caso).
 * 
 * getForEntity: Método utilizado para realizar una solicitud HTTP GET a una URL
 * específica y obtener la respuesta como un objeto ResponseEntity
 * 
 * readTree: Convierte un JSON en un JsonNode que representa un árbol de nodos
 * JSON y permite manupular y acceder a los datos JSON de manera estructural.
 */