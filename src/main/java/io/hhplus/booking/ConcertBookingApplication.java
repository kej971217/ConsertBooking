package io.hhplus.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"io.hhplus.booking.concert.model", "io.hhplus.booking.user.model"})
public class ConcertBookingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConcertBookingApplication.class, args);
    }
}