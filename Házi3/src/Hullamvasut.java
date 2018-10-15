public class Hullamvasut {

    private String hullamvasut_neve;
    private String vilag_neve;
    private int legkisebb_magassag;
    private int varakozasi_ido;

    public Hullamvasut(String hullamvasut_neve, String vilag_neve, int legkisebb_magassag, int varakozasi_ido) {
        this.hullamvasut_neve = hullamvasut_neve;
        this.vilag_neve = vilag_neve;
        this.legkisebb_magassag = legkisebb_magassag;
        this.varakozasi_ido = varakozasi_ido;
    }

    public String getHullamvasut_neve() {
        return hullamvasut_neve;
    }

    public void setHullamvasut_neve(String hullamvasut_neve) {
        this.hullamvasut_neve = hullamvasut_neve;
    }

    public String getVilag_neve() {
        return vilag_neve;
    }

    public void setVilag_neve(String vilag_neve) {
        this.vilag_neve = vilag_neve;
    }

    public int getLegkisebb_magassag() {
        return legkisebb_magassag;
    }

    public void setLegkisebb_magassag(int legkisebb_magassag) {
        this.legkisebb_magassag = legkisebb_magassag;
    }

    public int getVarakozasi_ido() {
        return varakozasi_ido;
    }

    public void setVarakozasi_ido(int varakozasi_ido) {
        this.varakozasi_ido = varakozasi_ido;
    }
    
    @Override
    public String toString() {
        return hullamvasut_neve + " (" + vilag_neve + "): " + varakozasi_ido;
    }
}