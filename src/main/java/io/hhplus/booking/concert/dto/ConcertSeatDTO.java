package io.hhplus.booking.concert.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConcertSeatDTO {

    private Long concertSeatNo;  // 콘서트 좌석 번호
    private String concertSeatId;  // 콘서트 좌석 ID
    private String concertPlaceId;  // 콘서트 장소 ID
    private String concertSeatGrade;  // 콘서트 좌석 등급
    private int concertSeatPrice;  // 콘서트 좌석 가격
    private String useYn;  // 사용 여부
    private String regDt;  // 등록 일시
    private String updDt;  // 수정 일시
}