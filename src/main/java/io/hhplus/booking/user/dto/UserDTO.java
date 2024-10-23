package io.hhplus.booking.user.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long userNo;  // 사용자 번호
    private String userId;  // 사용자 ID
    private String userNm;  // 사용자 이름
    private String roleId;  // 역할 ID (학생, 강사)
    private String regDt;  // 등록 일시 (LocalDateTime -> String 변환)
    private String updDt;  // 수정 일시 (LocalDateTime -> String 변환)
}