package com.nalbam.spring.demo.task;

import com.nalbam.spring.demo.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloTask {

    @Autowired
    private HelloService helloService;

    @Scheduled(fixedRate = 100)
    public void send100() {
        log.info("Task : " + helloService.hello("Task100", 100));
    }

    @Scheduled(fixedRate = 200)
    public void send80() {
        log.info("Task : " + helloService.hello80("Task-80"));
    }

    @Scheduled(fixedRate = 300)
    public void send60() {
        log.info("Task : " + helloService.hello60("Task-60"));
    }

    @Scheduled(fixedRate = 400)
    public void send40() {
        log.info("Task : " + helloService.hello40("Task-40"));
    }

    @Scheduled(fixedRate = 500)
    public void send20() {
        log.info("Task : " + helloService.hello20("Task-20"));
    }

}
