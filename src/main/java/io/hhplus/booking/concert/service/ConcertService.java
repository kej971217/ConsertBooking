package io.hhplus.booking.concert.service;

import io.hhplus.booking.concert.domain.Concert;
import io.hhplus.booking.concert.dto.ConcertDTO;
import io.hhplus.booking.concert.dto.ConcertSeatDTO;
import io.hhplus.booking.point.dto.PointDTO;
import io.hhplus.booking.repository.ConcertRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ConcertService {

    @Autowired
    private ConcertRepository concertRepository;

    @Autowired
    private ModelMapper modelMapper;

    // 콘서트 목록 조회
    public List<ConcertDTO> getAllConcerts(Map<String, Object> requestConcertInfo) {
        return concertRepository.findAll();
    }

    // 콘서트 단일 조회
    public ConcertDTO getConcertById(Map<String, Object> requestConcertInfo) {
        Concert concert = concertRepository.selectConcert(requestConcertInfo); // Concert 객체 목록 가져오기
        return null;  // 실제 구현에 맞게 수정
    }

    // 좌석 조회
    public List<ConcertSeatDTO> getAvailableSeats(Map<String, Object> requestConcertInfo) {
        /*List<ConcertSeat> concertSeatList = concertRepository.selectConcertList(requestConcertInfo);*/

        return null;  // 실제 구현에 맞게 수정
    }

    // 콘서트 좌석 예약
    public ConcertDTO reserveSeat(Map<String, Object> requestConcertInfo) {
        // concertId와 seatId, userId를 사용하여 좌석을 예약하는 로직
        // 예: 좌석이 예약 가능 상태인지 확인한 후 예약 처리
        return null;  // 실제 구현에 맞게 수정
    }

    // 콘서트 좌석 결제
    public PointDTO makePayment(Map<String, Object> requestConcertInfo) {
        // reservationId와 결제 정보를 기반으로 결제를 처리하는 로직
        // 예: 결제 시스템과 연동하여 결제 처리 후 결과 반환
        return null;  // 실제 구현에 맞게 수정
    }


    // ModelMapper를 사용해 변환
    private Concert convertToEntity(ConcertDTO concertDto) {
        return modelMapper.map(concertDto, Concert.class);
    }

    private ConcertDTO convertToDto(Concert concert) {
        return modelMapper.map(concert, ConcertDTO.class);
    }
}
