package Elso;

public class Bor extends AlkoholosItal{
    
    public String szoloFajta;
    public String termoTerulet;

    public Bor(String iz, double alkoholTartalom, String szoloFajta, String termoTerulet ) {
        super(iz, alkoholTartalom);
        this.szoloFajta= szoloFajta;
        this.termoTerulet= termoTerulet;
    }
    
    public String milyenSzolobolKeszult(){
        return this.szoloFajta;
    }
    
    public String mibolKeszult(){
        return this.szoloFajta;
 }
    
    public String holTermett(){
        return this.termoTerulet;
    }
}