package io.hhplus.booking.user.service;

import io.hhplus.booking.user.model.UserVO;

public interface UserService {
    UserVO selectUserInfo(String userId);

    UserVO insertUserInfo(UserVO user);

}
