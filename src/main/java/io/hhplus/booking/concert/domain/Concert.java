package io.hhplus.booking.concert.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_CONCERT")
public class Concert {

    @Id
    @Column(name = "CONCERT_NO")
    private String concertNo;  // 콘서트 번호 (기본 키)

    @Column(name = "CONCERT_ID")
    private String concertId;  // 콘서트 ID

    @Column(name = "CONCERT_NM")
    private String concertNm;  // 콘서트 이름

    @Column(name = "CONCERT_PLACE_ID")
    private String concertPlaceId;  // 콘서트 장소 ID

    @Column(name = "CONCERT_DT")
    private String concertDt;  // 콘서트 일시

    @Column(name = "CONCERT_BOOKING_OPEN_DT")
    private String concertBookingOpenDt;  // 예약 시작 일시

    @Column(name = "CONCERT_BOOKING_END_DT")
    private String concertBookingEndDt;  // 예약 종료 일시

    @Column(name = "USE_YN")
    private String useYn;  // 사용 여부

    @Column(name = "REG_DT")
    private String regDt;  // 등록 일시 (LocalDateTime 사용)

    @Column(name = "UPD_DT")
    private String updDt;  // 수정 일시 (LocalDateTime 사용)

}
