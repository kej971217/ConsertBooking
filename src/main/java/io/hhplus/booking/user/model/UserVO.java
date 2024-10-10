package io.hhplus.booking.user.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // 엔티티 어노테이션 추가
@Table(name = "TB_USER") // 테이블 명시
public class UserVO {

    @Id // 기본 키 어노테이션 추가
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userNo; // 사용자번호

    private String userId; // 사용자ID
    
    private String userNm; // 사용자명

    private String roleId; // 역할ID

    private String roleNm; // 역할명
}