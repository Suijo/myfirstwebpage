package myfirstwebpage.repository.Entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Table(name = "players")
public class players {

    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int pid;
    @Column
    private Date dob;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private Integer height;
    @Column
    private Integer weight;



    public players(int pid, Date dob, String first_name, String last_name, Integer height, Integer weight) {
        this.pid = pid;
        this.dob = dob;
        this.first_name = first_name;
        this.last_name = last_name;
        this.height = height;
        this.weight = weight;
    }

    public players(){}

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
