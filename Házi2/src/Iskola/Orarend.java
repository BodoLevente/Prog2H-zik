package Iskola;

public class Orarend{

    private String nap;
    private Ora[] ora;
    private int szamlalo;

    public Orarend(String nap) {
        this.nap = nap;
        this.ora = new Ora[12];
        this.szamlalo = 0;
    }   

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getOra() {
        return ora;
    }

    public void setOra(Ora[] ora) {
        this.ora = ora;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }
    
    public void oratHozzaad(Ora or) {
        if(this.szamlalo >= 12){
        }
        else {
            
             
        } 
            
    }   
}