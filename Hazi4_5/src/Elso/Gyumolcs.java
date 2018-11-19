package Elso;

public class Gyumolcs {
    
    private String fajta;
    private String iz;

    public Gyumolcs(String f, String i) {
        this.fajta = f;
        this.iz = i;
    }

    public String milyenFajtaju() {
        return fajta;
    }

    public String milyenIzu() {
        return iz;
    }

    @Override
    public String toString() {
        return "Fajta: " + fajta + ", íz: " + iz;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }   
}