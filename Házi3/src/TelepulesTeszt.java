import java.util.Scanner;

public class TelepulesTeszt {

    public static Telepules[] tel;
    
        public static void homereseklet(Telepules[] t,String v){
        for(int i=0;i<t.length;i++){
            if(t[i].getVaros().compareTo(v)==0){
                for(int j=0;j<t.length;j++){
                    if(t[j].getHomerseklet()>t[i].getHomerseklet()){
                        System.out.println(t[j].getVaros()+" ("+t[j].getHomerseklet()+")");
                    }
                }
            }
        else System.out.println("\nMissing Data");
        }
    }
        
    public static void kiir(Telepules[] tel) {
        
        for(int i=0;i<tel.length;i++) {
            System.out.println(tel[i]);
        }
        
    }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String sor = sc.nextLine();
            String[] s = sor.split(" ");
            
            int n = Integer.parseInt(s[0]);
            Telepules[] tel = new Telepules[n];
            tel[0] = new Telepules("",Integer.parseInt(s[1]));
            
            for(int i=0;i<n;i++) {
                sor = sc.nextLine();
                s = sor.split(":");
                int m = Integer.parseInt(s[1]);
                tel[i] = new Telepules(s[0],m);
            }
                        
    }
        
}