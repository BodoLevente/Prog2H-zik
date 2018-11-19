package Tizenegy;

import java.util.Scanner;

public class Main {
    
    public static void kiir(Szemely[] sz) {
        for(int i=0;i<sz.length;i++) {
            System.out.println(sz[i].toString());
        }
    }

    public static void main(String[] args) {
        
//        Szemely sz1 = new Szemely("Mona Liza",20,false);
//        System.out.println(sz1);
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        Szemely[] szemelyek = new Szemely[4];
        
        Hallgato[] ha = new Hallgato[n];
        Oktato[] ok = new Oktato[n];
        
        for(int i=0;i<n;i++) {
            String sor = sc.nextLine();
            String[] s = sor.split(" ");
            
            int t = Integer.parseInt(s[3]);
            int e = Integer.parseInt(s[1]);
            boolean f = Boolean.parseBoolean(s[2]);
            
            ha[i] = new Hallgato(s[0],e,f,t);
            szemelyek[i] = ha[i];
        }
        
        for(int i=0;i<n;i++) {
            String sor = sc.nextLine();
            String[] s = sor.split(" ");
            
            int e = Integer.parseInt(s[1]);
            boolean f = Boolean.parseBoolean(s[2]);
            
            ok[i] = new Oktato(s[0],e,f,s[3]);
            szemelyek[i+2] = ok[i];
        }
        kiir(szemelyek);
    }
    
    
}