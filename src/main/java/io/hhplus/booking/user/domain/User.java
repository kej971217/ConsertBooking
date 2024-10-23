package io.hhplus.booking.user.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TB_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_NO")
    private Long userNo;  // 사용자 번호 (기본 키)

    @Column(name = "USER_ID")
    private String userId;  // 사용자 ID

    @Column(name = "USER_NM")
    private String userNm;  // 사용자 이름

    @Column(name = "ROLE_CD")
    private String roleCd;  // 역할CD (관리자, 회원)

    @Column(name = "USE_YN")
    private String useYn;  // 사용여부

    @Column(name = "REG_DT")
    private LocalDateTime regDt;  // 등록 일시

    @Column(name = "UPD_DT")
    private LocalDateTime updDt;  // 수정 일시
}