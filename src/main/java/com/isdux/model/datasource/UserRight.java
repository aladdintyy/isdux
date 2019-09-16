package com.isdux.model.datasource;

public class UserRight {
    private String id;

    private String name;

    private String description;

    private Integer status;

    public UserRight(String id, String name, String description, Integer status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public UserRight() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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