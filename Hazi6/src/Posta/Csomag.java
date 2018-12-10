package Posta;

public class Csomag implements Comparable<Csomag>{

    private String cimzett_neve;
    private int iranyitoszam;
    private String telepules;
    private String utca;
    private int hazszam;
    private int csomag_erteke;

    public Csomag(String cimzett_neve, int iranyitoszam, String telepules, String utca, int hazszam, int csomag_erteke) {
        this.cimzett_neve = cimzett_neve;
        this.iranyitoszam = iranyitoszam;
        this.telepules = telepules;
        this.utca = utca;
        this.hazszam = hazszam;
        this.csomag_erteke = csomag_erteke;
    }

    public String getCimzett_neve() {
        return cimzett_neve;
    }

    public void setCimzett_neve(String cimzett_neve) {
        this.cimzett_neve = cimzett_neve;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public String getTelepules() {
        return telepules;
    }

    public void setTelepules(String telepules) {
        this.telepules = telepules;
    }

    public String getUtca() {
        return utca;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public int getHazszam() {
        return hazszam;
    }

    public void setHazszam(int hazszam) {
        this.hazszam = hazszam;
    }

    public int getCsomag_erteke() {
        return csomag_erteke;
    }

    public void setCsomag_erteke(int csomag_erteke) {
        this.csomag_erteke = csomag_erteke;
    }

    

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Csomag))
            return false;
        
        Csomag c = (Csomag) obj;
        
        return this.iranyitoszam==c.getIranyitoszam();
    }

    @Override
    public int compareTo(Csomag o) {
        if(this.telepules.equals(o.getTelepules())) {
            if(this.utca.equals(o.getUtca())) {
                if(this.hazszam==o.getHazszam()) {
                    if(this.cimzett_neve.equals(o.getCimzett_neve())) {
                            return Integer.compare(csomag_erteke, o.getCsomag_erteke());
                    }else {
                            return this.cimzett_neve.compareTo(o.getCimzett_neve());
                        }         
                    }else {
                        return Integer.compare(hazszam, o.getHazszam());
                    }
                }else {
                 return this.utca.compareTo(o.getUtca());
                }
            }else {
                return this.telepules.compareTo(o.getTelepules());
            }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(this.telepules).append(", ").append(this.utca).append(" ").append(this.hazszam);
            sb.append(", ").append(this.cimzett_neve).append(", ").append(this.csomag_erteke);
        return sb.toString();
    } 
}