package com.great.work.local.dao;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "EmpDetails")
public class EmpDetailsDao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Column(name = "role")
    private String role;

    @Column(name = "DOJ")
    private Date doj;

    public EmpDetailsDao(int id, String name, String role, Date doj) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.doj = doj;
    }
}
