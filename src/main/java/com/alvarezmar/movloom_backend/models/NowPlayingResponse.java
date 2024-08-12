package com.alvarezmar.movloom_backend.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class NowPlayingResponse {
    private Dates dates;
    private int page;
    private List<Movie> results;
    private int total_pages;
    private int total_results;

}
