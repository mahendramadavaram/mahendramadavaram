package com.ts.interview.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class MyEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date date;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public MyEntity() {  }

    public MyEntity(String name, Date date,String msg) {
        this.name = name;
        this.date=date;
        this.msg = msg;
    }

    public MyEntity(int id, String name, Date date,String msg) {
        this(name, date,msg);
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "MyEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date.toString() + '\'' +
                '}';
    }
}
