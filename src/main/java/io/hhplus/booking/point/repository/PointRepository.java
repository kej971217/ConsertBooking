package io.hhplus.booking.point.repository;


import io.hhplus.booking.concert.model.ConcertVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<ConcertVO, Long> {

}