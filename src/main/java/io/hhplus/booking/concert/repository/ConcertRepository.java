package io.hhplus.booking.concert.repository;

import io.hhplus.booking.concert.model.ConcertVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<ConcertVO, Long> {

}