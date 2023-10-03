package com.example.webclientandfeignclientapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulerConfig {
    @Scheduled(cron = "10 * * * * ?")
    public void scheduleTask(){
        System.out.println("fixed delay task -> " + System.currentTimeMillis()/1000);
    }
}
