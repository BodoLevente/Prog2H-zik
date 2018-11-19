package Elso;

public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{
    
    private double alkoholTartalom;
    
    public ErjedtGyumolcs(String fajta, String iz, double alkoholTartalom) {
        super(fajta, iz);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }

    @Override
    public String toString() {
        return "Alkohol tartalom: " + alkoholTartalom;
    } 
}