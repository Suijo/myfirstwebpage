package myfirstwebpage.repository.Entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class teams {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int tid;
    @Column
    private String tname;

    public teams(int tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }
    public teams(){}

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
