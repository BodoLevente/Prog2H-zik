package Elso;

public abstract class AlkoholosItal implements Alkoholos{
    
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }
    
    public double mennyiAlkoholtTartalmaz(){
        return this.alkoholTartalom;
    }
    
    public String milyenIzu(){
        return this.iz;
    }
}
