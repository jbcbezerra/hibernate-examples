package com.example.hibernatespring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

@Entity
public class TimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    private LocalTime localTime = LocalTime.of(15,30,30);
    private OffsetTime offsetTime = OffsetTime.of(15,30,30,0,ZoneOffset.of("+02:00"));
    private OffsetDateTime offsetDateTime = OffsetDateTime.of(2023,1,1,15,30,30,0, ZoneOffset.of("+02:00"));

    public TimeEntity(){}
    public TimeEntity(Long id){
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public OffsetTime getOffsetTime() {
        return offsetTime;
    }

    public void setOffsetTime(OffsetTime offsetTime) {
        this.offsetTime = offsetTime;
    }

    public OffsetDateTime getOffsetDateTime() {
        return offsetDateTime;
    }

    public void setOffsetDateTime(OffsetDateTime offsetDateTime) {
        this.offsetDateTime = offsetDateTime;
    }

    public TimeEntity(Long id, LocalTime localTime, OffsetTime offsetTime, OffsetDateTime offsetDateTime) {
        this.id = id;
        this.localTime = localTime;
        this.offsetTime = offsetTime;
        this.offsetDateTime = offsetDateTime;
    }
}
