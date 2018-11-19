package Masodik;

import java.util.Objects;

public class Ital implements Comparable<Ital>{
    protected String név; 
    protected String kiszerelés; 
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return this.név;
    }

    public String getKiszerelés() {
        return this.kiszerelés;
    }

    public int getÁr() {
        return this.ár;
    }

    @Override
    public String toString() {
        return this.név+", "+this.kiszerelés+", "+this.ár+" Ft";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Ital)) 
            return false;
        
        Ital i= (Ital) obj;
        
        return this.név.equals(név) && this.kiszerelés.equals(kiszerelés);
    }

    @Override
    public int compareTo(Ital t) {
        return Integer.compare(this.ár,t.getÁr());
    }   
}