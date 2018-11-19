package Tiz;

import java.util.Objects;

public class Auto{

    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }
    
//    public boolean joRendszam() {
//        if(this.rendszam.length()== 6) {
//            for(int i=0;i<this.rendszam.length()-3;i++) {
//                this.rendszam.charAt(i);
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Rendszam: " + rendszam + ", teljesitmeny: " + teljesitmeny + ", automata: " + automata;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Auto))
            return false;
        
            Auto a = (Auto) obj;
            
            return this.rendszam.equals(a.getRendszam());
    }   
}