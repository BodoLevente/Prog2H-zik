package zh;

import java.util.Random;

public class Hallgato extends Dolgozat{

    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int pontszam, int men, boolean sok) {
        super(pontszam);
        this.mennyitKeszult= men;
        this.sokatTanul = sok;
    }    
    
    public Dolgozat dolgozatotIr(Dolgozat d) {
        if(sokatTanul==true) {
            Random r = new Random();
            int szam = r.nextInt(7-4) + 4;
            d.pontszam = szam * this.mennyitKeszult;
        }
        else if(sokatTanul==false) {
            Random r = new Random();
            int szam = r.nextInt(5-0) + 0;
            d.pontszam = szam * this.mennyitKeszult;
        }
        else{
            d.pontszam = -1;
        }
        return d;
    }
}