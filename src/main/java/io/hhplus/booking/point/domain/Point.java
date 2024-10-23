package io.hhplus.booking.point.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_POINT_HISTORY")
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POINT_HISTORY_NO")
    private Long pointHistoryNo;  // 포인트 번호 (기본 키)

    @Column(name = "USER_ID")
    private String userId;  // 사용자 ID

    @Column(name = "POINT_TYPE")
    private String pointType;  // 포인트 유형 (적립, 사용)

    @Column(name = "REQUEST_POINT")
    private int pointBalance;  // 요청 포인트

    @Column(name = "REG_DT")
    private LocalDateTime regDt;  // 등록 일시

    @Column(name = "UPD_DT")
    private LocalDateTime updDt;  // 수정 일시
}
