package Elso;

public class Main {
    
    public static Bor[] otputtonyosAszuk(Aszu[] b){
        
        int j=b.length;
        int k=0;
        Aszu[] A = new Aszu[j+1];
        if(b instanceof Aszu[]){
         for(int i=0;i<b.length;i++){
                 if(b[i].hanyPuttonyos()==5){
                     A[k]=b[i];
                     k++;
                 }
             }
         }
    return A;     
            
}
    
    
    public static void main(String[] args) {
       Bor[] b1 = new Bor[]{
            new Bor("bor",5,"piros","Tokaj"),
            new Bor("bor",5,"nagyszemu","Tokaj"),
            new Bor("bor",5,"feher","Tokaj"),
            new Aszu("bor",3,"feher","Tokaj",6),
            new Aszu("bor",3.5,"piros","Tokaj",5)
       };
        System.out.println(otputtonyosAszuk(b1));
    }
}