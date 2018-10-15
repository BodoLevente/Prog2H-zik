import java.util.Scanner;

public class HullamvasutTeszt {

    private static Hullamvasut[] hul;
    
    public static void rendez(Hullamvasut[] h) {
        
        for(int i=0;i<h.length-1;i++) {
            for(int j=i+1;j<h.length;j++){
                if(h[i].getVarakozasi_ido() < h[j].getVarakozasi_ido()) {
                    Hullamvasut tmp = h[i];
                    h[i] = h[j];
                    h[j] = tmp;
                }
                
                else if(h[i].getVarakozasi_ido() == h[j].getVarakozasi_ido()) {
                    if(h[i].getLegkisebb_magassag() < h[j].getLegkisebb_magassag()) {
                        Hullamvasut tmp = h[i];
                        h[i] = h[j];
                        h[j] = tmp;
                    }
                
                    else if(h[i].getVilag_neve().compareTo(h[j].getVilag_neve())>0) {
                        Hullamvasut tmp = h[i];
                        h[i] = h[j];
                        h[j] = tmp;
                    }
                }
            }
        }
    }
    
    private static void kiir(Hullamvasut[] h) {
        for(int i=0;i<h.length;i++)
            System.out.println(h[i]);
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        hul  = new Hullamvasut[n];
        
        for(int i=0;i<n;i++) {
            
            String sor = sc.nextLine();
            String st[] =sor.split(";");
            
            String s = st[0];
            String d = st[1];
            int c = Integer.parseInt(st[2]);
            int v = Integer.parseInt(st[3]);
            hul[i] = new Hullamvasut(s,d,c,v);
            rendez(hul);
            kiir(hul);
            }
        }    
    }   