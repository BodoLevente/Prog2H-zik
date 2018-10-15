import java.util.Scanner;
import java.util.Date;

public class Main {
    
    private static Tura[] t;
    
    public static void rendez(Tura[] t) {
        
        for(int i=0;i<t.length-1;i++) {
            for(int j=i+1;i<t.length;j++) {
                if(t[i].getResztav() > t[j].getResztav()) {
                    Tura tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
                
                else if(t[i].getResztav().length == t[j].getResztav().length) {
                    if(t[i].getEv().compareTo(t[j].getEv())>0 && t[i].getHonap().compareTo(t[j].getEv())>0 && t[i].getNap().compareTo(t[j].getNap())>0) {
                        Tura tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                        }
                    
                    else if(t[i].getTura_neve().compareTo(t[j].getTura_neve())>0) {
                            Tura tmp = t[i];
                            t[i] = t[j];
                            t[j]= tmp;
                    }
                }
            }
        
        }
    }
    
    private static void kiir(Tura[] t) {
        for(int i=0;i<t.length;i++)
            System.out.println(t);
    }
    
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        Tura[] t = new Tura[n];
        
        for(int i=0;i<n;i++) {
            
            String sor = sc.nextLine();
            String st[] = sor.split(";");
            
            t[i] = new Tura(new Date(Integer.parseInt(st[0]),0,0), new Date(0,Integer.parseInt(st[1]),0), new Date(0,0,Integer.parseInt(st[2])), st[3]);
               //ArrayList<Integer> resztav = new ArrayList<Integer>();

            for(int j = 4; j < st.length; j++) {
//                resztav.add(Integer.parseInt(st[j]));
//                tura.countResztav(resztav);
                  int[] m = new int[]{Integer.parseInt(st[j])};
                  
            
            }
        
            rendez(t);
            kiir(t);

        
        }
    }
}