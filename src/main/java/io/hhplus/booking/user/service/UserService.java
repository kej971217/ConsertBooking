package io.hhplus.booking.user.service;

import io.hhplus.booking.dto.UserVO;

public interface UserService {
    UserVO selectUserInfo(String userId);

    UserVO insertUserInfo(UserVO user);

    // user ConcertList

    // user Point history 조회
}
