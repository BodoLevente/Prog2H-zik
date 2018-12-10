package Antikvar;

import java.util.ArrayList;
import java.util.List;

public class Konyv implements Comparable<Konyv>{

    private String cim;
    private List<String> szerzok;
    private int ev;

    public Konyv(String cim, int ev) {
        this.cim = cim;
        this.ev = ev;
        this.szerzok = new ArrayList<>();
    }

    public String getCim() {
        return cim;
    }

    public List<String> getSzerzok() {
        return szerzok;
    }

    public int getEv() {
        return ev;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Konyv))
            return false;
        
    Konyv k = (Konyv) obj;
        
    return this.cim.equals(k.getCim()) && this.szerzok.equals(k.getSzerzok());  
    }

    @Override
    public int compareTo(Konyv o) {
        if(this.ev==o.getEv()) {
            if(this.szerzok.size()==o.getSzerzok().size()) {
                return this.cim.compareTo(o.getCim());
            }else {
                return (-1)*(Integer.compare(this.szerzok.size(),o.getSzerzok().size()));
            }
        }else {
            return Integer.compare(this.ev, o.getEv());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<this.szerzok.size();i++) {
            if(i<this.szerzok.size()-1) {
            sb.append(this.szerzok.get(i)).append(", ");
            }else {
                sb.append(this.szerzok.get(i));
            }
        }
        if(!this.szerzok.isEmpty()) {
            sb.append(": ");
        }
        sb.append(this.cim);
        sb.append("(").append(this.ev).append(")");
        
        return sb.toString();
    }
    
    
}