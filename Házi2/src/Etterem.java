import java.util.Arrays;

public class Etterem extends VendeglatoipariEgyseg {
    
    String [] etlap;
    
    public Etterem(String nev, int ferohelyekSzama, Boolean dohanyzo, String[] etl) {
        super(nev,ferohelyekSzama,false);
        this.etlap=etl;        
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return super.toString() + "Étlap : " + Arrays.toString(etlap);
    }
}