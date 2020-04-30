package com.alex.talks.data.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CONFERENCES",schema = "reserves")
public class Conferences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CONF")
    Long id;

    @Column(name="NAME")
    String name;

    @Column(name="TOPIC")
    String topic;

    @Column(name="ROOM_NUMBER")
    String roomNumber;

    @Column(name="PARTICIPANTS_NUM")
    int partNum;

    @Column(name="CONF_DATE_FROM")
    Date confDateFrom;

    @Column(name="CONF_DATE_TO")
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
