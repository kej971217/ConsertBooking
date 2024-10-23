package io.hhplus.booking.queue.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_QUEUE")
public class Queue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUEUE_NO")
    private Long queueNo;  // 대기열 번호 (기본 키)

    @Column(name = "USER_ID")
    private String userId;  // 사용자 ID

    @Column(name = "USER_QUEUE_TOKEN")
    private String userQueueToken;  // 사용자 대기열 토큰

    @Column(name = "QUEUE_STATUS")
    private String queueStatus;  // 대기열 상태 (대기, 차례)

    @Column(name = "REG_DT")
    private LocalDateTime regDt;  // 등록 일시

    @Column(name = "UPD_DT")
    private LocalDateTime updDt;  // 수정 일시
}