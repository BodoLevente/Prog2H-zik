package Karacsony;

public class Hozzavalok {
   
    private String nev;
    private int mennyiseg;

    public Hozzavalok(String nev, int mennyiseg) {
        this.nev = nev;
        this.mennyiseg = mennyiseg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
}