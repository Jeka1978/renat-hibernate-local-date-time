package com.nice.spring.boot.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by Evegeny on 21/03/2017.
 */
@Entity
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue
    private long id;

    private LocalDateTime birthday;

    public Person(LocalDateTime birthday) {
        this.birthday = birthday;
    }
}
