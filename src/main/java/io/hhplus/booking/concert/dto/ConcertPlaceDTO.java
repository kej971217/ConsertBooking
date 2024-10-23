package io.hhplus.booking.concert.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConcertPlaceDTO {

    private Long concertPlaceNo;  // 콘서트 장소 번호
    private String concertPlaceId;  // 콘서트 장소 ID
    private String concertPlaceName;  // 콘서트 장소 이름
    private String concertPlaceLocation;  // 콘서트 장소 위치
    private String useYn;  // 사용 여부
    private String regDt;  // 등록 일시
    private String updDt;  // 수정 일시
}