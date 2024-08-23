package com.alvarezmar.movloom_backend.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MovieImagesResponse {

    private List<Images> backdrops;
    private int id;
    private List<Images> logos;
    private List<Images> posters;

}
