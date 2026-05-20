package com.cinefy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDto {
    private Long id;
    private String transactionId;
    private Double amount;
    private LocalDateTime paymentTime;
    private String paymentMethod;
    private String status;
}