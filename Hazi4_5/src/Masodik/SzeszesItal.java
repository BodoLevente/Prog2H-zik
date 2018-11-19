package Masodik;

public class SzeszesItal extends Ital {
    
    private double alkoholTartalom;

    public SzeszesItal(String név, String kiszerelés, int ár, double alkoholTartalom) {
        super(név, kiszerelés, ár);
        this.alkoholTartalom=alkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return this.alkoholTartalom;
    }

    public void setAlkoholTartalom(double alkoholTartalom) {
        this.alkoholTartalom = alkoholTartalom;
    }
 
    @Override
    public String toString() {
        return this.alkoholTartalom+"% alholtartalmu ," + super.toString();
    }
}