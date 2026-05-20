package com.cinefy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingRequestDto {
    private Long userId;
    private Long showId;
    private List<Long> seatIds;
    private String paymentMethod;
}