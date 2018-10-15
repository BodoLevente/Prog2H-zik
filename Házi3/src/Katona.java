public class Katona {

    private int tamado;
    private int vedo;
    
    public Katona() {
        this.tamado = 5;
        this.vedo = 5;
    }

    public Katona(int tamado, int vedo) {
        this.tamado = tamado;
        this.vedo = vedo;
    }

    public int getTamado() {
        return tamado;
    }

    public void setTamado(int tamado) {
        this.tamado = tamado;
    }

    public int getVedo() {
        return vedo;
    }

    public void setVedo(int vedo) {
        this.vedo = vedo;
    }
    
    @Override
    public String toString() {
        return "TE: " + tamado + ", VE: " + vedo;
    }
    
    @Override
    public boolean equals(Object obj) {
            if(obj == null && !(obj instanceof Katona))
                return false;
    
    Katona k = (Katona) obj;
    
    return this.tamado ==  k.getTamado() && this.vedo == k.getVedo();
    
    } 
}