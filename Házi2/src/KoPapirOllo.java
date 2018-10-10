import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {
    
    public static void KoPapirOllo(){
        String k;
        Scanner sc= new Scanner(System.in);
        Random rnd = new Random();
        k=sc.nextLine();
        String[] seged=new String[3];
                seged[0]="ko";
                seged[1]="papir";
                seged[2]="ollo";
            while(k.equals("ko") || k.equals("papir") || k.equals("ollo") || k.equals("vege") ){
                int i=rnd.nextInt(3);
                if(k.equals(seged[i])) {
                    System.out.println("\n"+seged[i]);
                    System.out.println("dontetlen");
                    k=sc.nextLine();
                }
                else if(k.equals("ko") && seged[i].equals("papir")){ 
                    System.out.println("\n"+seged[i]);
                    System.out.println("szamitogep nyert");
                    k=sc.nextLine();}
                
                else if(k.equals("papir") && seged[i].equals("ollo")){ 
                        System.out.println("\n"+seged[i]);
                        System.out.println("szamitogep nyert");
                        k=sc.nextLine();}
                else if(k.equals("ollo") && seged[i].equals("ko")){ 
                    System.out.println("\n"+seged[i]);
                    System.out.println("szamitogep nyert");
                    k=sc.nextLine();}
                else if(k.equals("ko") && seged[i].equals("ollo")){ 
                    System.out.println("\n"+seged[i]);
                    System.out.println("nyertel");
                    k=sc.nextLine();}
                else if(k.equals("papir") && seged[i].equals("ko")){ 
                    System.out.println("\n"+seged[i]);
                    System.out.println("nyertel");
                    k=sc.nextLine();}
                else if(k.equals("ollo") && seged[i].equals("papir")){ 
                    System.out.println("\n"+seged[i]);
                    System.out.println("nyertel");
                    k=sc.nextLine();}
                
                else if(k.equals("vege")){
                    System.out.println("vege");
                    break;
                }
            }
    
    }
    
    public static void main(String[] args) {
        KoPapirOllo();
    }
}