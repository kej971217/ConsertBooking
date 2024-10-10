package io.hhplus.booking.user.repository;

import io.hhplus.booking.user.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserVO, Long> {

    UserVO findByUserId(String userId);
}
