package io.hhplus.booking.queue.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueueDTO {

    private Long queueNo;  // 대기열 번호
    private String userId;  // 사용자 ID
    private String userQueueToken;  // 사용자 대기열 토큰
    private String queueStatus;  // 대기열 상태 (대기, 차례)
    private String regDt;  // 등록 일시 (LocalDateTime -> String 변환)
    private String updDt;  // 수정 일시 (LocalDateTime -> String 변환)
}