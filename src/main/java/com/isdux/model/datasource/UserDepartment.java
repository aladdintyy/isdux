package com.isdux.model.datasource;

public class UserDepartment {
    private String id;

    private String name;

    private String description;

    private Integer degree;

    private String parentId;

    private Integer status;

    public UserDepartment(String id, String name, String description, Integer degree, String parentId, Integer status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.degree = degree;
        this.parentId = parentId;
        this.status = status;
    }

    public UserDepartment() {
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

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}