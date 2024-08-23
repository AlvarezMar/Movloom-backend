package com.alvarezmar.movloom_backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Images {

    private int aspect_ratio;
    private int height;
    private String iso_639_1;
    private String file_path;
    private double vote_average;
    private int vote_count;
    private int width;
}
