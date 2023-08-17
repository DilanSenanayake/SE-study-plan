package com.example.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int custid;
    private String custname;
    private String coursename;
    @Autowired
    private Technologies techDetail;

    public Technologies getTechDetail() {
        return techDetail;
    }

    public void setTechDetail(Technologies techDetail) {
        this.techDetail = techDetail;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void display() {
        System.out.println("Object Returned Successfully");
        techDetail.tech();
    }
}
