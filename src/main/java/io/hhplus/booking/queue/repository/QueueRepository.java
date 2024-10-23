package io.hhplus.booking.queue.repository;

import io.hhplus.booking.queue.dto.QueueDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueueRepository extends JpaRepository<QueueDTO, Long> {


}