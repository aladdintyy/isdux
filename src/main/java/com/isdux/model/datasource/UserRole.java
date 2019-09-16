package com.isdux.model.datasource;

public class UserRole {
    private String id;

    private String name;

    private String description;

    private String rightIds;

    private Integer status;

    public UserRole(String id, String name, String description, String rightIds, Integer status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rightIds = rightIds;
        this.status = status;
    }

    public UserRole() {
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

    public String getRightIds() {
        return rightIds;
    }

    public void setRightIds(String rightIds) {
        this.rightIds = rightIds == null ? null : rightIds.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}