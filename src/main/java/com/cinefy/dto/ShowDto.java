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
public class ShowDto {
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long movieId;
    private Long screenId;
}