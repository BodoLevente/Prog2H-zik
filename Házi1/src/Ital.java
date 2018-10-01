import java.util.Date;

public class Ital {
    
    protected String nev;
    protected String kiszereles;
    private static int ar = 10;
    protected Date gyartasiDatum;
    
    public Ital(String nev, String kiszereles) {
        
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.gyartasiDatum = new Date();
    }

    public String getNev() {
        return nev;
    }

    public static int getAr() {
        return ar;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public void setKiszereles(String kiszereles) {
        this.kiszereles = kiszereles;
    }
    
    public static double getArEuroban() {
        return ar*0.0031;
    }

    @Override
    public String toString() {
        return nev + ", " + kiszereles + ", " + ar+ "Ft";
    }
    
        @Override
    public boolean equals(Object obj) {
        
        if(obj == null || !(obj instanceof Ital))
            return false;
        
        Ital i = (Ital) obj;
        
        return this.nev.equals(i.getNev()) && this.kiszereles.equals(i.getKiszereles());
        
    }
    
    
    
    
    
}
