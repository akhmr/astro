package com.astro.model;

import java.util.List;

public record NumerologyResponse(List<AstroNumDto> astroDtos) {

    public NumerologyResponse {
        // Ensure the map is non-null; use an empty map if null
        if (astroDtos == null) {
        	astroDtos = List.of(); // Create an immutable empty map
        }
    }

    @Override
    public String toString() {
        return "NumerologyResponse [astroDtos=" + astroDtos + "]";
    }
}