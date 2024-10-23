package io.hhplus.booking.concert.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_CONCERT_PLACE")
public class ConcertPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONCERT_PLACE_NO")
    private Long concertPlaceNo;  // 콘서트 장소 번호 (기본 키)

    @Column(name = "CONCERT_PLACE_ID")
    private String concertPlaceId;  // 콘서트 장소 ID

    @Column(name = "CONCERT_PLACE_NM")
    private String concertPlaceName;  // 콘서트 장소 이름

    @Column(name = "CONCERT_PLACE_LOCATION")
    private String concertPlaceLocation;  // 콘서트 장소 위치

    @Column(name = "USE_YN")
    private String useYn;  // 사용 여부

    @Column(name = "REG_DT")
    private LocalDateTime regDt;  // 등록 일시

    @Column(name = "UPD_DT")
    private LocalDateTime updDt;  // 수정 일시
}