import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Tura {

    private Date Ev;
    private Date Honap;
    private Date Nap;
    private String tura_neve;
    private int[] resztav;

    public Tura(Date Ev, Date honap, Date Nap, String tura_neve) {
        this.Ev = Ev;
        this.Honap = Honap;
        this.Nap = Nap;
        this.tura_neve = tura_neve;
        this.resztav = resztav;
    }

    public Date getEv() {
        return this.Ev;
    }

    public void setEv(Date Ev) {
        this.Ev = Ev;
    }

    public Date getHonap() {
        return Honap;
    }

    public void setHonap(Date Honap) {
        this.Honap = Honap;
    }

    public Date getNap() {
        return Nap;
    }

    public void setNap(Date Nap) {
        this.Nap = Nap;
    }

    public String getTura_neve() {
        return this.tura_neve;
    }

    public void setTura_neve(String tura_neve) {
        this.tura_neve = tura_neve;
    }

    public int[] getResztav() {
        return this.resztav;
    }

    public void setResztav(int[] resztav) {
        this.resztav = resztav;
    }

//    public int countResztav() {
//        int sum = 0;
//        for (int n: this.resztav) {
//            sum += n;
//        }
//        return sum;
//    }

    @Override
    public String toString() {
        return tura_neve + " " + resztav;
    }
}