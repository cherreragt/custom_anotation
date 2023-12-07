package com.example.demo.dto;

import com.example.demo.exceptions.CustomAnotation;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Test {
    @CustomAnotation
    private Boolean error;
    @NotNull(message = "Message is required0")
    private String message;
}
