package Tizenegy;

public class Hallgato extends Szemely{
    
    private double atlagTulajdonsag;

    public Hallgato(String nev, int eletkor, boolean ferfi,double atlagTulajdonsag) {
        super(nev, eletkor, ferfi);
        this.atlagTulajdonsag = atlagTulajdonsag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.nev).append("\n");
        sb.append(super.eletkor).append("\n");
        sb.append(super.isFerfi()).append("\n");
        sb.append(this.atlagTulajdonsag);
        return sb.toString();
    }
    
    public boolean joKepesseguE() {
        if(this.atlagTulajdonsag>=4) return true;
        else return false;
    }
    
}
