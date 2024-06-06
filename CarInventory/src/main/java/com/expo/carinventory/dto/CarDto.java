package com.expo.carinventory.dto;

import java.util.UUID;

public record CarDto(
        UUID id,
        String model,
        String maker,
        Boolean available
) {
}
