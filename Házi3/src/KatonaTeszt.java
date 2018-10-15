public class KatonaTeszt {

    public static Katona megkuzd(Katona kat1, Katona kat2) {
        System.out.println(kat1.toString() + " VS " + kat2.toString());
        System.out.println("A nyertes: ");
        if(kat1.getTamado() > kat2.getVedo()) {
            return kat1;
        } else if (kat1.getTamado() == kat2.getVedo()) {
            return kat1;
        } 
        else
            return kat2;
    }
    
    
    public static void main(String[] args) {
        
       Katona[] k = new Katona[] {
           new Nyilas(10,5,3),
           new Nyilas(12,6,2),
           new Landzsas(7,15),
       };
       
        System.out.println(megkuzd(k[0],k[1]));
        System.out.println(megkuzd(k[0],k[2]));
        System.out.println("Az életben maradt katona : " + k[0]);
    }
}