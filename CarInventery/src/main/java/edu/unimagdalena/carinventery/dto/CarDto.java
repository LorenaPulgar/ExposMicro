package edu.unimagdalena.carinventery.dto;

import java.util.UUID;

public record CarDto(
        UUID id,
        String model,
        String maker,
        String available
) {
}
