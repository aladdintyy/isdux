package com.isdux.model.datasource;

public class UserScore {
    private String id;

    private String userInfoId;

    private Integer score;

    private String description;

    private Integer status;

    public UserScore(String id, String userInfoId, Integer score, String description, Integer status) {
        this.id = id;
        this.userInfoId = userInfoId;
        this.score = score;
        this.description = description;
        this.status = status;
    }

    public UserScore() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId == null ? null : userInfoId.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}