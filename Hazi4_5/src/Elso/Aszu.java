package Elso;

public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(String iz, double alkoholTartalom, String szoloFajta, String termoTerulet,int puttonySzam) {
        super(iz, alkoholTartalom, szoloFajta, termoTerulet);
        this.puttonySzam= puttonySzam;
    }
    
    public int hanyPuttonyos(){
        return this.puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}';
    }
}