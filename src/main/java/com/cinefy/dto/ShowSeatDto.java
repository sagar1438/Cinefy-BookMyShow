package com.cinefy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowSeatDto {
   private Long id;
private String status;
private Double price;

private SeatDto seat;
}