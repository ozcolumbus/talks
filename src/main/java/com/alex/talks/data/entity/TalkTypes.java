package com.alex.talks.data.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;


@Entity
@Table(name="DICT_TALK_TYPES",schema="reserves")
public class TalkTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TALK_TYPE")
    private Long id;

    private String talk_type_name;

    public Long getId_talk_type() {
        return id;
    }

    public void setId_talk_type(Long id_talk_type) {
        this.id = id_talk_type;
    }

    public String getTalk_type_name() {
        return talk_type_name;
    }

    public void setTalk_type_name(String talk_type_name) {
        this.talk_type_name = talk_type_name;
    }
}
