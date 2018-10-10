import java.util.Arrays;

public class Kocsma extends VendeglatoipariEgyseg {

    String [] sorlap;
    
    public Kocsma(String nev, int ferohelyekSzama, Boolean dohanyzo, String[] sor) {
        super(nev,ferohelyekSzama,true);
        this.sorlap=sor;
        
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return super.toString() + "Sörlap : " + Arrays.toString(sorlap);
    }  
}