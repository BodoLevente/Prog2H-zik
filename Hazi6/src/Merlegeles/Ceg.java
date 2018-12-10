package Merlegeles;

public class Ceg implements Comparable<Ceg>{
    private String cegnev;
    private String telephely;
    private int ev;
    private int arbevetel;

    public Ceg(String cegnev, String telephely, int ev, int arbevetel) {
        this.cegnev = cegnev;
        this.telephely = telephely;
        this.ev = ev;
        this.arbevetel = arbevetel;
    }

    public String getCegnev() {
        return cegnev;
    }

    public void setCegnev(String cegnev) {
        this.cegnev = cegnev;
    }

    public String getTelephely() {
        return telephely;
    }

    public void setTelephely(String telephely) {
        this.telephely = telephely;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getArbevetel() {
        return arbevetel;
    }

    public void setArbevetel(int arbevetel) {
        this.arbevetel = arbevetel;
    }

    
    
    @Override
    public String toString() {
        return cegnev + " (" + telephely + ") " + ":" + arbevetel;
    }

    @Override
    public int compareTo(Ceg t) {
        if(this.arbevetel==t.getArbevetel()){
            return this.telephely.compareTo(t.getTelephely());
        }
        else return (-1)*Integer.compare(this.arbevetel,t.getArbevetel());
    } 
}