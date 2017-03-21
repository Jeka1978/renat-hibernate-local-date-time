package com.nice.spring.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by Evegeny on 21/03/2017.
 */
@Service
@EnableScheduling
public class PersonService {
    @Autowired
    private PersonDao personDao;
    @Scheduled(cron = "1/1 * * * * ?")
    public void savePerson() {
        personDao.save(new Person(LocalDateTime.now()));
    }
}
