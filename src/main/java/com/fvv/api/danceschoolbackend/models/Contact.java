package com.fvv.api.danceschoolbackend.models;

public class Contact {

    private String name;

    private String email;

    private String address;

    private String cellphone;

    private String danceType;

    private String schedule;

    private Integer age;

    private String level;

    private String comment;

    public Contact() {
    }

    public Contact(String name, String email, String address, String cellphone, String danceType, String schedule, Integer age, String level, String comment) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.cellphone = cellphone;
        this.danceType = danceType;
        this.schedule = schedule;
        this.age = age;
        this.level = level;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getDanceType() {
        return danceType;
    }

    public void setDanceType(String danceType) {
        this.danceType = danceType;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
