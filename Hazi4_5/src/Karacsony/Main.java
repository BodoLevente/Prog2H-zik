package Karacsony;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        List<Hozzavalok> hoz = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        
        while(sor.length() >0) {
            String[] s = sor.split(";");
                
            int m = Integer.parseInt(s[1]);
            
            Hozzavalok ho = new Hozzavalok(s[0],m);
            
            hoz.add(ho);
            
            sor = sc.nextLine();
            
            if(hoz.contains(ho)) {
                hoz.get
            }
        }
    
        Collections.sort(hoz);
        for(Hozzavalok i:hoz)
    System.out.println(i);
    }
}