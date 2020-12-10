package myfirstwebpage.repository.Entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class match_stats {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String mid;
    @Column
    private int pid;
    @Column
    private  Integer tid;
    @Column
    private String loc;
    @Column
    private Integer KI;
    @Column
    private Integer MK;
    @Column
    private Integer HB;
    @Column
    private Integer DI;
    @Column
    private Integer GL;
    @Column
    private Integer BH;
    @Column
    private Integer HO;
    @Column
    private Integer TK;
    @Column
    private Integer RB;
    @Column
    private Integer IF;
    @Column
    private Integer CL;
    @Column
    private Integer CG;
    @Column
    private Integer FF;
    @Column
    private Integer FA;
    @Column
    private Integer BR;
    @Column
    private Integer CP;
    @Column
    private Integer UP;
    @Column
    private Integer CM;
    @Column
    private Integer MI;
    @Column
    private float LP;
    @Column
    private Integer BO;
    @Column
    private Integer GA;
    @Column
    private float PP;

    public match_stats(String mid, int pid, int dob, Integer tid, String loc, Integer KI, Integer MK, Integer HB, Integer DI, Integer GL, Integer BH, Integer HO, Integer TK, Integer RB, Integer IF, Integer CL, Integer CG, Integer FF, Integer FA, Integer BR, Integer CP, Integer UP, Integer CM, Integer MI, float LP, Integer BO, Integer GA, float PP) {
        this.mid = mid;
        this.pid = pid;
        this.tid = tid;
        this.loc = loc;
        this.KI = KI;
        this.MK = MK;
        this.HB = HB;
        this.DI = DI;
        this.GL = GL;
        this.BH = BH;
        this.HO = HO;
        this.TK = TK;
        this.RB = RB;
        this.IF = IF;
        this.CL = CL;
        this.CG = CG;
        this.FF = FF;
        this.FA = FA;
        this.BR = BR;
        this.CP = CP;
        this.UP = UP;
        this.CM = CM;
        this.MI = MI;
        this.LP = LP;
        this.BO = BO;
        this.GA = GA;
        this.PP = PP;
    }
    public match_stats(){}

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }



    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Integer getKI() {
        return KI;
    }

    public void setKI(Integer KI) {
        this.KI = KI;
    }

    public Integer getMK() {
        return MK;
    }

    public void setMK(Integer MK) {
        this.MK = MK;
    }

    public Integer getHB() {
        return HB;
    }

    public void setHB(Integer HB) {
        this.HB = HB;
    }

    public Integer getDI() {
        return DI;
    }

    public void setDI(Integer DI) {
        this.DI = DI;
    }

    public Integer getGL() {
        return GL;
    }

    public void setGL(Integer GL) {
        this.GL = GL;
    }

    public Integer getBH() {
        return BH;
    }

    public void setBH(Integer BH) {
        this.BH = BH;
    }

    public Integer getHO() {
        return HO;
    }

    public void setHO(Integer HO) {
        this.HO = HO;
    }

    public Integer getTK() {
        return TK;
    }

    public void setTK(Integer TK) {
        this.TK = TK;
    }

    public Integer getRB() {
        return RB;
    }

    public void setRB(Integer RB) {
        this.RB = RB;
    }

    public Integer getIF() {
        return IF;
    }

    public void setIF(Integer IF) {
        this.IF = IF;
    }

    public Integer getCL() {
        return CL;
    }

    public void setCL(Integer CL) {
        this.CL = CL;
    }

    public Integer getCG() {
        return CG;
    }

    public void setCG(Integer CG) {
        this.CG = CG;
    }

    public Integer getFF() {
        return FF;
    }

    public void setFF(Integer FF) {
        this.FF = FF;
    }

    public Integer getFA() {
        return FA;
    }

    public void setFA(Integer FA) {
        this.FA = FA;
    }

    public Integer getBR() {
        return BR;
    }

    public void setBR(Integer BR) {
        this.BR = BR;
    }

    public Integer getCP() {
        return CP;
    }

    public void setCP(Integer CP) {
        this.CP = CP;
    }

    public Integer getUP() {
        return UP;
    }

    public void setUP(Integer UP) {
        this.UP = UP;
    }

    public Integer getCM() {
        return CM;
    }

    public void setCM(Integer CM) {
        this.CM = CM;
    }

    public Integer getMI() {
        return MI;
    }

    public void setMI(Integer MI) {
        this.MI = MI;
    }

    public float getLP() {
        return LP;
    }

    public void setLP(float LP) {
        this.LP = LP;
    }

    public Integer getBO() {
        return BO;
    }

    public void setBO(Integer BO) {
        this.BO = BO;
    }

    public Integer getGA() {
        return GA;
    }

    public void setGA(Integer GA) {
        this.GA = GA;
    }

    public float getPP() {
        return PP;
    }

    public void setPP(float PP) {
        this.PP = PP;
    }
}
