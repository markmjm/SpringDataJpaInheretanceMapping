package com.mjm.hibernateinheritance.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "bankcheck")
@PrimaryKeyJoinColumn(name = "id")
public class Check  extends Payment {

    private String Checknumber;

    public String getChecknumber() {
        return Checknumber;
    }

    public void setChecknumber(String checknumber) {
        Checknumber = checknumber;
    }
}
