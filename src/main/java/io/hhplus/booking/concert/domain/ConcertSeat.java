package io.hhplus.booking.concert.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_CONCERT_SEAT")
public class ConcertSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONCERT_SEAT_NO")
    private Long concertSeatNo;  // 콘서트 좌석 번호 (기본 키)

    @Column(name = "CONCERT_SEAT_ID")
    private String concertSeatId;  // 콘서트 좌석 ID

    @Column(name = "CONCERT_PLACE_ID")
    private String concertPlaceId;  // 콘서트 장소 ID (외래 키)

    @Column(name = "CONCERT_SEAT_GRADE")
    private String concertSeatGrade;  // 콘서트 좌석 등급

    @Column(name = "CONCERT_SEAT_PRICE")
    private int concertSeatPrice;  // 콘서트 좌석 가격

    @Column(name = "USE_YN")
    private String useYn;  // 사용 여부

    @Column(name = "REG_DT")
    private LocalDateTime regDt;  // 등록 일시

    @Column(name = "UPD_DT")
    private LocalDateTime updDt;  // 수정 일시
}