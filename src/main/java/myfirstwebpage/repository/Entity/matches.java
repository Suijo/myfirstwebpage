package myfirstwebpage.repository.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class matches {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String mid;
    @Column
    private int season;
    @Column
    private String round;
    @Column
    private  Integer tid1;
    @Column
    private Integer tid2;
    @Column
    private String tid1_loc;
    @Column
    private String tid2_loc;
    @Column
    private Date start_dt;
    @Column
    private String venue;
    @Column
    private Integer att;
    @Column
    private Integer margin;
    @Column
    private Integer win_score;
    @Column
    private Integer win_tid;
    @Column
    private String win_loc;
    @Column
    private Integer lose_score;
    @Column
    private String lose_loc;
    @Column
    private Integer lose_tid;
    @Column
    private Integer h_tid;
    @Column
    private Integer h_score;
    @Column
    private Integer h_q1g;
    @Column
    private Integer h_q2g;
    @Column
    private Integer h_q3g;
    @Column
    private Integer h_q4g;
    @Column
    private Integer h_etg;
    @Column
    private Integer h_q1b;
    @Column
    private Integer h_q2b;
    @Column
    private Integer h_q3b;
    @Column
    private Integer h_q4b;
    @Column
    private Integer h_etb;
    @Column
    private Integer a_tid;
    @Column
    private Integer a_score;
    @Column
    private Integer a_q1g;
    @Column
    private Integer a_q2g;
    @Column
    private Integer a_q3g;
    @Column
    private Integer a_q4g;
    @Column
    private Integer a_etg;
    @Column
    private Integer a_q1b;
    @Column
    private Integer a_q2b;
    @Column
    private Integer a_q3b;
    @Column
    private Integer a_q4b;
    @Column
    private Integer a_etb;
    @Column
    private Integer target;

    public matches(String mid, int season, String round, Integer tid1, Integer tid2, String tid1_loc, String tid2_loc, Date start_dt, String venue, Integer att, Integer margin, Integer win_score, Integer win_tid, String win_loc, Integer lose_score, String lose_loc, Integer lose_tid, Integer h_tid, Integer h_score, Integer h_q1g, Integer h_q2g, Integer h_q3g, Integer h_q4g, Integer h_etg, Integer h_q1b, Integer h_q2b, Integer h_q3b, Integer h_q4b, Integer h_etb, Integer a_tid, Integer a_score, Integer a_q1g, Integer a_q2g, Integer a_q3g, Integer a_q4g, Integer a_etg, Integer a_q1b, Integer a_q2b, Integer a_q3b, Integer a_q4b, Integer a_etb, Integer target) {
        this.mid = mid;
        this.season = season;
        this.round = round;
        this.tid1 = tid1;
        this.tid2 = tid2;
        this.tid1_loc = tid1_loc;
        this.tid2_loc = tid2_loc;
        this.start_dt = start_dt;
        this.venue = venue;
        this.att = att;
        this.margin = margin;
        this.win_score = win_score;
        this.win_tid = win_tid;
        this.win_loc = win_loc;
        this.lose_score = lose_score;
        this.lose_loc = lose_loc;
        this.lose_tid = lose_tid;
        this.h_tid = h_tid;
        this.h_score = h_score;
        this.h_q1g = h_q1g;
        this.h_q2g = h_q2g;
        this.h_q3g = h_q3g;
        this.h_q4g = h_q4g;
        this.h_etg = h_etg;
        this.h_q1b = h_q1b;
        this.h_q2b = h_q2b;
        this.h_q3b = h_q3b;
        this.h_q4b = h_q4b;
        this.h_etb = h_etb;
        this.a_tid = a_tid;
        this.a_score = a_score;
        this.a_q1g = a_q1g;
        this.a_q2g = a_q2g;
        this.a_q3g = a_q3g;
        this.a_q4g = a_q4g;
        this.a_etg = a_etg;
        this.a_q1b = a_q1b;
        this.a_q2b = a_q2b;
        this.a_q3b = a_q3b;
        this.a_q4b = a_q4b;
        this.a_etb = a_etb;
        this.target = target;
    }
    public matches(){}

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Integer getTid1() {
        return tid1;
    }

    public void setTid1(Integer tid1) {
        this.tid1 = tid1;
    }

    public Integer getTid2() {
        return tid2;
    }

    public void setTid2(Integer tid2) {
        this.tid2 = tid2;
    }

    public String getTid1_loc() {
        return tid1_loc;
    }

    public void setTid1_loc(String tid1_loc) {
        this.tid1_loc = tid1_loc;
    }

    public String getTid2_loc() {
        return tid2_loc;
    }

    public void setTid2_loc(String tid2_loc) {
        this.tid2_loc = tid2_loc;
    }

    public Date getStart_dt() {
        return start_dt;
    }

    public void setStart_dt(Date start_dt) {
        this.start_dt = start_dt;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Integer getAtt() {
        return att;
    }

    public void setAtt(Integer att) {
        this.att = att;
    }

    public Integer getMargin() {
        return margin;
    }

    public void setMargin(Integer margin) {
        this.margin = margin;
    }

    public Integer getWin_score() {
        return win_score;
    }

    public void setWin_score(Integer win_score) {
        this.win_score = win_score;
    }

    public Integer getWin_tid() {
        return win_tid;
    }

    public void setWin_tid(Integer win_tid) {
        this.win_tid = win_tid;
    }

    public String getWin_loc() {
        return win_loc;
    }

    public void setWin_loc(String win_loc) {
        this.win_loc = win_loc;
    }

    public Integer getLose_score() {
        return lose_score;
    }

    public void setLose_score(Integer lose_score) {
        this.lose_score = lose_score;
    }

    public String getLose_loc() {
        return lose_loc;
    }

    public void setLose_loc(String lose_loc) {
        this.lose_loc = lose_loc;
    }

    public Integer getLose_tid() {
        return lose_tid;
    }

    public void setLose_tid(Integer lose_tid) {
        this.lose_tid = lose_tid;
    }

    public Integer getH_tid() {
        return h_tid;
    }

    public void setH_tid(Integer h_tid) {
        this.h_tid = h_tid;
    }

    public Integer getH_score() {
        return h_score;
    }

    public void setH_score(Integer h_score) {
        this.h_score = h_score;
    }

    public Integer getH_q1g() {
        return h_q1g;
    }

    public void setH_q1g(Integer h_q1g) {
        this.h_q1g = h_q1g;
    }

    public Integer getH_q2g() {
        return h_q2g;
    }

    public void setH_q2g(Integer h_q2g) {
        this.h_q2g = h_q2g;
    }

    public Integer getH_q3g() {
        return h_q3g;
    }

    public void setH_q3g(Integer h_q3g) {
        this.h_q3g = h_q3g;
    }

    public Integer getH_q4g() {
        return h_q4g;
    }

    public void setH_q4g(Integer h_q4g) {
        this.h_q4g = h_q4g;
    }

    public Integer getH_etg() {
        return h_etg;
    }

    public void setH_etg(Integer h_etg) {
        this.h_etg = h_etg;
    }

    public Integer getH_q1b() {
        return h_q1b;
    }

    public void setH_q1b(Integer h_q1b) {
        this.h_q1b = h_q1b;
    }

    public Integer getH_q2b() {
        return h_q2b;
    }

    public void setH_q2b(Integer h_q2b) {
        this.h_q2b = h_q2b;
    }

    public Integer getH_q3b() {
        return h_q3b;
    }

    public void setH_q3b(Integer h_q3b) {
        this.h_q3b = h_q3b;
    }

    public Integer getH_q4b() {
        return h_q4b;
    }

    public void setH_q4b(Integer h_q4b) {
        this.h_q4b = h_q4b;
    }

    public Integer getH_etb() {
        return h_etb;
    }

    public void setH_etb(Integer h_etb) {
        this.h_etb = h_etb;
    }

    public Integer getA_tid() {
        return a_tid;
    }

    public void setA_tid(Integer a_tid) {
        this.a_tid = a_tid;
    }

    public Integer getA_score() {
        return a_score;
    }

    public void setA_score(Integer a_score) {
        this.a_score = a_score;
    }

    public Integer getA_q1g() {
        return a_q1g;
    }

    public void setA_q1g(Integer a_q1g) {
        this.a_q1g = a_q1g;
    }

    public Integer getA_q2g() {
        return a_q2g;
    }

    public void setA_q2g(Integer a_q2g) {
        this.a_q2g = a_q2g;
    }

    public Integer getA_q3g() {
        return a_q3g;
    }

    public void setA_q3g(Integer a_q3g) {
        this.a_q3g = a_q3g;
    }

    public Integer getA_q4g() {
        return a_q4g;
    }

    public void setA_q4g(Integer a_q4g) {
        this.a_q4g = a_q4g;
    }

    public Integer getA_etg() {
        return a_etg;
    }

    public void setA_etg(Integer a_etg) {
        this.a_etg = a_etg;
    }

    public Integer getA_q1b() {
        return a_q1b;
    }

    public void setA_q1b(Integer a_q1b) {
        this.a_q1b = a_q1b;
    }

    public Integer getA_q2b() {
        return a_q2b;
    }

    public void setA_q2b(Integer a_q2b) {
        this.a_q2b = a_q2b;
    }

    public Integer getA_q3b() {
        return a_q3b;
    }

    public void setA_q3b(Integer a_q3b) {
        this.a_q3b = a_q3b;
    }

    public Integer getA_q4b() {
        return a_q4b;
    }

    public void setA_q4b(Integer a_q4b) {
        this.a_q4b = a_q4b;
    }

    public Integer getA_etb() {
        return a_etb;
    }

    public void setA_etb(Integer a_etb) {
        this.a_etb = a_etb;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }
}
