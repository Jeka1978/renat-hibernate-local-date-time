package com.nice.spring.boot.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Evegeny on 21/03/2017.
 */
public interface PersonDao extends CrudRepository<Person,Long> {
}
