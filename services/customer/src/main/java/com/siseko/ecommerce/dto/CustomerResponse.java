package com.siseko.ecommerce.dto;

import com.siseko.ecommerce.model.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {
}
