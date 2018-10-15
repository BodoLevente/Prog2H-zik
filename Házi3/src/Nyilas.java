public class Nyilas extends Katona{

    private int lotav;

    public Nyilas(int lotav) {
        this.lotav = lotav;
    }

    public Nyilas(int lotav, int tamado, int vedo) {
        super(tamado, vedo);
        this.lotav = lotav;
        super.setTamado(tamado + lotav);
        
    }

    @Override
    public String toString() {
        return "Nyilas "+ super.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null && !(obj instanceof Katona))
            return false;
        
        Katona k = (Katona) obj;
        
        return super.equals(k);
    }
}