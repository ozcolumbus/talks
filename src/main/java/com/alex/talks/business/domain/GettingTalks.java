package com.alex.talks.business.domain;

public class GettingTalks {
private Long talksid;
private Long talkstypeid;
private String Name;
private String Description;
private String PresenterName;
private String TalkType;

    public Long getTalksid() {
        return talksid;
    }

    public void setTalksid(Long talksid) {
        this.talksid = talksid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPresenterName() {
        return PresenterName;
    }

    public void setPresenterName(String presenterName) {
        PresenterName = presenterName;
    }

    public String getTalkType() {
        return TalkType;
    }

    public void setTalkType(String talkType) {
        TalkType = talkType;
    }
}
