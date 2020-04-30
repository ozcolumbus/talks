package com.alex.talks.business.domain;


import java.util.Date;

public class ConferencesReservation {
Long id;
String name;
String topic;
String roomNumber;
int partNum;
Date confDateFrom;
Date confDateTo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getPartNum() {
        return partNum;
    }

    public void setPartNum(int partNum) {
        this.partNum = partNum;
    }

    public Date getConfDateFrom() {
        return confDateFrom;
    }

    public void setConfDateFrom(Date confDateFrom) {
        this.confDateFrom = confDateFrom;
    }

    public Date getConfDateTo() {
        return confDateTo;
    }

    public void setConfDateTo(Date confDateTo) {
        this.confDateTo = confDateTo;
    }
}
