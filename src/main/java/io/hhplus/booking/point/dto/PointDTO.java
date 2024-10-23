package io.hhplus.booking.point.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PointDTO {
    private Long pointNo;  // 포인트 번호
    private String userId;  // 사용자 ID
    private String pointType;  // 포인트 유형 (적립, 사용)
    private String requestPoint;  // 요청 포인트
    private String regDt;  // 등록 일시 (LocalDateTime -> String 변환)
    private String updDt;  // 수정 일시 (LocalDateTime -> String 변환)
}
