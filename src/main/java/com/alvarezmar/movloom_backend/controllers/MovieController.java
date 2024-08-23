package com.alvarezmar.movloom_backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarezmar.movloom_backend.models.MovieImagesResponse;
import com.alvarezmar.movloom_backend.models.NowPlayingResponse;
import com.alvarezmar.movloom_backend.services.MovieService;

@RestController
@RequestMapping("api/movies")
public class MovieController {

    // * Inyección de constructor: */
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    /*
     * Inyección de campos:
     * 
     * @Autowired
     * private MovieService movieService;
     */

    @GetMapping("/now-playing")
    public NowPlayingResponse getNowPlayingMovies() {
        try {
            return movieService.getNowPlayingMovies();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/movie-images/{id}")
    public MovieImagesResponse getMovieImages(@PathVariable Number id) {
        try {
            return movieService.getMovieImages(id);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

/*
 * @RestController: Combinación de @Controller y @ResponseBody. Los métodos de
 * esta clase devolverám datos que serán directamente serializados en el formato
 * de respuesta (JSON).
 * 
 * @RequestMapping: Define la ruta base para todas las solicitudes manejadas por
 * el controlador. Todas las solicitudes que comiencen con lo que esta en
 * parentesis serán dirigidas a este controlador.
 * 
 * final: Declara que una variable, método o clase no puede ser modificada o
 * extendida.
 * En este caso movieService no se puede modificar después de que el
 * MovieController haya sido creado, proporcionando una mayor seguridad en la
 * integridad del objeto.
 * 
 * JsonNode: Estructura de datos de Jackson para representar un JSON.
 * Se utiliza cuando los datos que se reciben tienen una estructura variable o
 * no se conoce de antemano.
 * Al trabajar con una API externa el formato JSON de respuesta puede cambiar o
 * no ser consistente. JsonNode permite manejar la respuesta sin estar atado a
 * una estructura de datos fija.
 * 
 * 
 */