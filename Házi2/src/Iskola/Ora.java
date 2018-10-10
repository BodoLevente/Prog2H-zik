package Iskola;

public class Ora{
   
    private int kod;
    private String nev;
    private int kezdet;

    public Ora(int kod, String nev, int kezdet) {
        this.kod = kod;
        this.nev = nev;
        this.kezdet = kezdet;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "Kód : " + kod + "\nNév : " + nev + "\nKezdet : " + kezdet;
    }  
}