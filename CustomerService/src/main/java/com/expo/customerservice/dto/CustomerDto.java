package com.expo.customerservice.dto;

import java.util.UUID;

public record CustomerDto(
        UUID id,
        String fullName
) {
}
