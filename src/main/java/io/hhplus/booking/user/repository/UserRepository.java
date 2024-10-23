package io.hhplus.booking.user.repository;

import io.hhplus.booking.user.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO, Long> {

    UserDTO findByUserId(String userId);
}
