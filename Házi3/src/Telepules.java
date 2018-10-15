public class Telepules {
 
    private String Varos;
    private int Homerseklet;
    
    public Telepules(String Varos, int Homerseklet) {
        this.Varos = Varos;
        this.Homerseklet = Homerseklet;
    }

    public String getVaros() {
        return Varos;
    }

    public void setVaros(String Varos) {
        this.Varos = Varos;
    }

    public int getHomerseklet() {
        return Homerseklet;
    }

    public void setHomerseklet(int Homerseklet) {
        this.Homerseklet = Homerseklet;
    }

    @Override
    public String toString() {
        return Varos + " (" + Homerseklet + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null && !(obj instanceof Telepules))
            return false;
        
        Telepules t = (Telepules)obj;
        
        return this.Varos.equals(t.getVaros());
    }
}