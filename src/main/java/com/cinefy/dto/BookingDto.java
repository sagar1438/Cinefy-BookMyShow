package com.cinefy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingDto {
    private Long id;
    private String bookingNumber;
    private LocalDateTime bookingTime;
    private Long userId;
    private Long showId;
    private String status;
    private Double totalAmount;
    private List<Long> showSeatIds;
    private Long paymentId;
}