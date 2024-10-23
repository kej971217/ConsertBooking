package io.hhplus.booking.point.repository;


import io.hhplus.booking.concert.dto.ConcertDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<ConcertDTO, Long> {

}