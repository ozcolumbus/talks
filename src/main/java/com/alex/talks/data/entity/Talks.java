package com.alex.talks.data.entity;

import javax.persistence.*;

@Entity
@Table(name="TALKS",schema ="reserves")
public class Talks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_TALK")
    Long id;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPresenter_name() {
        return presenter_name;
    }

    public void setPresenter_name(String presenter_name) {
        this.presenter_name = presenter_name;
    }

    public Long getTalkTypesId() {
        return talkTypesId;
    }

    public void setTalkTypesId(Long talkTypesId) {
        this.talkTypesId = talkTypesId;
    }

    @Column(name="NAME")
    String name;

    @Column(name="DESCRIPTION")
    String description;

    @Column(name="PRESENTER_NAME")
    String presenter_name;

    @Column(name="ID_TALK_TYPE")
    Long talkTypesId;
}
