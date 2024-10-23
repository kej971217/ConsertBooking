package io.hhplus.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EntityScan(basePackages = {
        "io.hhplus.booking.domain"  // domain에 위치한 엔티티 스캔
})
@ComponentScan(basePackages = {
        "io.hhplus.booking.controller",
        "io.hhplus.booking.service",
        "io.hhplus.booking.repository",
        "io.hhplus.booking.exception"
})
public class ConcertBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConcertBookingApplication.class, args);
    }
}