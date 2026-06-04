package com.cinefy.controller;

import com.cinefy.dto.BookingDto;
import com.cinefy.dto.BookingRequestDto;
import com.cinefy.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<BookingDto> createBooking(
            @RequestBody BookingRequestDto request) {

        return ResponseEntity.ok(
                bookingService.createBooking(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingDto> getBooking(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                bookingService.getBookingById(id));
    }

    @PutMapping("/{id}/cancel")
    public ResponseEntity<BookingDto> cancelBooking(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                bookingService.cancelBooking(id));
    }
}