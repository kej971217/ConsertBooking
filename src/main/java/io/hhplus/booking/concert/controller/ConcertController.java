package io.hhplus.booking.concert.controller;

import io.hhplus.booking.concert.dto.ConcertDTO;
import io.hhplus.booking.concert.service.ConcertService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@Controller
@RequestMapping("/concert")
public class ConcertController {

    @Resource
    private ConcertService concertService;

    /**
     * 콘서트 목록 조회
     */
    @PostMapping("/selectConcertList")
    public List<ConcertDTO> selectConcertList(@RequestParam Map<String, Object> requestConcertInfo) {
        return concertService.selectConcertList(requestConcertInfo);
    }


    /**
     * 콘서트 좌석 목록 조회
     * useYn (예약이 된 경우, 사용할 수 없는 경우 N)
     */
    @PostMapping("/selectConcertSeatList")
    public List<Map<String, Object>> selectConcertSeatList(@RequestParam Map<String, Object> requestConcertInfo) {
        List<Map<String, Object>> concertSeatList = new ArrayList<>();

        // 좌석 1
        Map<String, Object> seat1 = new HashMap<>();
        seat1.put("concertSeatNo", 1);
        seat1.put("concertSeatId", "S001");
        seat1.put("concertPlaceId", requestConcertInfo.get("concertPlaceId"));
        seat1.put("concertSeatGrade", "VIP");
        seat1.put("concertSeatPrice", "100000");  // 가격
        seat1.put("useYn", "Y");  // 사용 가능 여부

        // 좌석 2
        Map<String, Object> seat2 = new HashMap<>();
        seat2.put("concertSeatNo", 2);
        seat2.put("concertSeatId", "S002");
        seat2.put("concertPlaceId", requestConcertInfo.get("concertPlaceId"));
        seat2.put("concertSeatGrade", "R");
        seat2.put("concertSeatPrice", "80000");
        seat2.put("useYn", "Y");

        // 좌석 3
        Map<String, Object> seat3 = new HashMap<>();
        seat3.put("concertSeatNo", 3);
        seat3.put("concertSeatId", "S003");
        seat3.put("concertPlaceId", requestConcertInfo.get("concertPlaceId"));
        seat3.put("concertSeatGrade", "S");
        seat3.put("concertSeatPrice", "60000");
        seat3.put("useYn", "N");

        // 좌석 정보를 리스트에 추가
        concertSeatList.add(seat1);
        concertSeatList.add(seat2);
        concertSeatList.add(seat3);

        return concertSeatList;
    }

    @PostMapping("/bookingConcert")
    public Map<String, Object> bookingConcert(@RequestParam Map<String, Object> requestConcertInfo) {
        Map<String, Object> bookingInfo = new HashMap<>();

        // MOCK 데이터를 사용하여 임시 콘서트 예약 처리
        bookingInfo.put("userId", requestConcertInfo.get("userId"));
        bookingInfo.put("concertId", requestConcertInfo.get("concertId"));
        bookingInfo.put("concertSeatId", requestConcertInfo.get("concertSeatId"));
        bookingInfo.put("concertStatus", "BOOKING_SUCCESS");
        bookingInfo.put("regDt", LocalDateTime.now());

        return bookingInfo;
    }

    @PostMapping("/cancelConcert")
    public Map<String, Object> cancelConcert(@RequestParam Map<String, Object> requestConcertInfo) {
        Map<String, Object> cancelInfo = new HashMap<>();

        // MOCK 데이터를 사용하여 임시 콘서트 예약 취소 처리
        cancelInfo.put("concertBookingId", requestConcertInfo.get("concertBookingId"));
        cancelInfo.put("cancelStatus", "BOOKING_CANCEL");
        cancelInfo.put("updDt", LocalDateTime.now());

        return cancelInfo;
    }

}

