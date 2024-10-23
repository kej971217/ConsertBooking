package io.hhplus.booking.repository;

import io.hhplus.booking.concert.domain.Concert;
import io.hhplus.booking.concert.dto.ConcertDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface ConcertRepository extends JpaRepository<ConcertDTO, Long> {

    List<Concert> selectConcertList(Map<String, Object> requestConcertInfo);

}