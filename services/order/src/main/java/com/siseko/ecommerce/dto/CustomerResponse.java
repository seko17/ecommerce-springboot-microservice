package com.siseko.ecommerce.dto;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email
) {
}
