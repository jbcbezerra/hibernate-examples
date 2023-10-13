package com.example.hibernatespring;

import com.example.hibernatespring.temporal.DateTimeEntity;
import com.example.hibernatespring.temporal.SimpleTemporalEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.TimeZone;

@Component
public class Preloader implements CommandLineRunner {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        entityManager.persist(new TimeEntity());
        entityManager.flush();
    }

}
