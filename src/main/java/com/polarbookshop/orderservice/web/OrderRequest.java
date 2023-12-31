package com.polarbookshop.orderservice.web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record OrderRequest(
        @NotBlank(message = "the book ISBN must be defined")
        String isbn,

        @NotNull(message = "The book quantity must be defined")
        @Min(value = 1, message = "You  must order at least 1 item")
        @Max(value = 5, message = "you cannot order more than 5")
        Integer quantity
) {
}
