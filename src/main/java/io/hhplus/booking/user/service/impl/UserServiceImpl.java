package io.hhplus.booking.user.service.impl;

import io.hhplus.booking.user.model.UserVO;
import io.hhplus.booking.user.repository.UserRepository;
import io.hhplus.booking.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserVO selectUserInfo(String userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public UserVO insertUserInfo(UserVO user) {
        return null;
    }
}
