public class VendeglatoipariEgyseg {

    private String nev;
    private int ferohelyekSzama;
    private boolean dohanyzo;

    public VendeglatoipariEgyseg(String nev, int ferohelyekSzama, boolean dohanyzo) {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    public void setDohanyzo(Boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }

    @Override
    public String toString() {
        return "Név : " + nev + ", ferohelyekSzama=" + ferohelyekSzama + ", dohanyzo=" + dohanyzo + " ";
    }  
}