package io.hhplus.booking.concert.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConcertDTO {

    private String concertNo;  // 콘서트 번호 (기본 키)
    private String concertId;  // 콘서트 ID
    private String concertNm;  // 콘서트 이름
    private String concertPlaceId;  // 콘서트 장소 ID
    private String concertDt;  // 콘서트 일시
    private String concertBookingOpenDt;  // 예약 시작 일시
    private String concertBookingEndDt;  // 예약 종료 일시
    private String useYn;  // 사용 여부

}
