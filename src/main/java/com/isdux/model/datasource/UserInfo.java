package com.isdux.model.datasource;

import java.util.Date;

public class UserInfo {
    private String id;

    private String name;

    private String nation;

    private Date birth;

    private String gender;

    private String noCertificate;

    private String itemCertificate;

    private String hobby;

    private String marriage;

    private String source;

    private String degreeCustomer;

    private String income;

    private String degreeImportant;

    private Integer phone;

    private Integer tel;

    private Integer tencent;

    private String degreeEducation;

    private String mail;

    private String provence;

    private String city;

    private String address;

    private Date createDate;

    private String roleId;

    private Integer status;

    public UserInfo(String id, String name, String nation, Date birth, String gender, String noCertificate, String itemCertificate, String hobby, String marriage, String source, String degreeCustomer, String income, String degreeImportant, Integer phone, Integer tel, Integer tencent, String degreeEducation, String mail, String provence, String city, String address, Date createDate, String roleId, Integer status) {
        this.id = id;
        this.name = name;
        this.nation = nation;
        this.birth = birth;
        this.gender = gender;
        this.noCertificate = noCertificate;
        this.itemCertificate = itemCertificate;
        this.hobby = hobby;
        this.marriage = marriage;
        this.source = source;
        this.degreeCustomer = degreeCustomer;
        this.income = income;
        this.degreeImportant = degreeImportant;
        this.phone = phone;
        this.tel = tel;
        this.tencent = tencent;
        this.degreeEducation = degreeEducation;
        this.mail = mail;
        this.provence = provence;
        this.city = city;
        this.address = address;
        this.createDate = createDate;
        this.roleId = roleId;
        this.status = status;
    }

    public UserInfo() {
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

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getNoCertificate() {
        return noCertificate;
    }

    public void setNoCertificate(String noCertificate) {
        this.noCertificate = noCertificate == null ? null : noCertificate.trim();
    }

    public String getItemCertificate() {
        return itemCertificate;
    }

    public void setItemCertificate(String itemCertificate) {
        this.itemCertificate = itemCertificate == null ? null : itemCertificate.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getDegreeCustomer() {
        return degreeCustomer;
    }

    public void setDegreeCustomer(String degreeCustomer) {
        this.degreeCustomer = degreeCustomer == null ? null : degreeCustomer.trim();
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income == null ? null : income.trim();
    }

    public String getDegreeImportant() {
        return degreeImportant;
    }

    public void setDegreeImportant(String degreeImportant) {
        this.degreeImportant = degreeImportant == null ? null : degreeImportant.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public Integer getTencent() {
        return tencent;
    }

    public void setTencent(Integer tencent) {
        this.tencent = tencent;
    }

    public String getDegreeEducation() {
        return degreeEducation;
    }

    public void setDegreeEducation(String degreeEducation) {
        this.degreeEducation = degreeEducation == null ? null : degreeEducation.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getProvence() {
        return provence;
    }

    public void setProvence(String provence) {
        this.provence = provence == null ? null : provence.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}