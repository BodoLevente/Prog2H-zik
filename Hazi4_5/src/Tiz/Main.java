package Tiz;

import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void kiir(Auto[] au) {
        for(int i=0;i<au.length;i++) {
            System.out.println(au[i].toString());
        }
    }

    public static void main(String[] args) {
        
//        Scanner sc = new Scanner(System.in);
//        String rendsz = sc.nextLine();
//        Auto a1 = new Auto(rendsz,100,true);
//        System.out.println(a1);
        
        Auto[] autok = new Auto[4];

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        Auto[] au = new Auto[n];
        Teherauto[] tau = new Teherauto[n];
        
        for(int i=0;i<n;i++) {
            String sor = sc.nextLine();
            String[] st = sor.split(" ");
            
            int t = Integer.parseInt(st[1]);
            boolean a = Boolean.parseBoolean(st[2]);
            
            au[i] = new Auto(st[0],t,a);
            autok[i]= au[i];
        }
        
        for(int i=0;i<n;i++) {
            String sor = sc.nextLine();
            String[] st = sor.split(" ");
            
            int t = Integer.parseInt(st[1]);
            boolean a = Boolean.parseBoolean(st[2]);
            int k = Integer.parseInt(st[3]);
            
            tau[i] = new Teherauto(st[0],t,a,k);
            autok[i+2] = tau[i];
        }
        
        kiir(au);
        kiir(tau);
        kiir(autok);
    }  
}