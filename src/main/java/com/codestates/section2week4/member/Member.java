package com.codestates.section2week4.member;

public class Member {
    private Long memberID;
    private String email;
    private String name;
    private String phone;

    public Member(Long memberID, String email, String name, String phone) {
        this.memberID = memberID;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public Long getMemberId() {
        return memberID;
    }

    public void setMemberId(Long memberID) {
        this.memberID = memberID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
