package io.hhplus.booking.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskScheduler {
    @Scheduled(cron = "0 0/1 * * * *") // 매 시간 정각마다 실행
    public void executeTask() {
        System.out.println("---<<SCHEDULER_START>>---");
    }

}
