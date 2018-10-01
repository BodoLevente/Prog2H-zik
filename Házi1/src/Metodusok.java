public class Metodusok {

    public static void novekvo(int a, int b, int c) {
        
        int r = 0;
        
            if (b < a){
                r = b;
                b = a;
                a = r;
            }
            if (c < a){
                r = c;
                c = a;
                a = r;
            
            }
            if (c < b){
                r = c;
                c = b;
                b = r;
            }
        System.out.println(a+" "+b+" "+c);
    }
    
    public static void minmax(double a, double b, double c) {
        
        double r = 0;
        
        if (a < 0){
            a = a*(-1);
        }
        if (b < 0){
            b = b*(-1);
        }
        if (c < 0){
            c = c*(-1);
        }
        
        if (b < a){
            r = b;
            b = a;
            a = r;
        }
        if (c < a){
            r = c;
            c = a;
            a = r;
            
        }
        if (c < b){
            r = c;
            c = b;
            b = r;
        }
         System.out.println(a+" "+c);
     }
    
    public static void abcd(double a, double b, double c, double d) {
        if(d >= 0){
            System.out.println(a+" "+c+" "+b+" "+d);
        }
        else {
            System.out.println(a+" "+b+" "+d+" "+c);
        }
    }
    
    public static boolean haromszog (double a, double b, double c) {
        if(a+b>c && b+c>a && c+a>b) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void szokoev (int a,int b) {
        int db=0;
        for(int i=a;i<=b;i++){
            if(i%4==0 && i%100!=0 || i%400==0){
                db++;
            }
        }
        System.out.println(db);
    }
    
    public static void erdemjegy(int a) {
        switch(a){
            case 1: System.out.println("Elégtelen");break;
            case 2: System.out.println("Elégséges");break;
            case 3: System.out.println("Közepes");break;
            case 4: System.out.println("Jó");break;
            case 5: System.out.println("Kitűnő");break;
        }
    }
    
    public static void hanyados (int a,int b){
        
        int h=0;
        
        while (a>=b){
            h++;
            a = a-b;
        }
        System.out.println(h);
        
    }
    
    public static void prim (int a) {
        
        int i;
        int db=0;
        
        for(i=1;i<=a;i++){
           if(a%i==0){
               db++;
           }   
        }
        if(db==2){
            System.out.println("Prímszám!");
        }
        else{
            System.out.println("Nem prím!");
        }
    }
    
    public static void fibonacci (int n) {
           
        int a=0;
        int b=1;
        int i=0;
        
        if(n==1){
            System.out.println(a);
            
        }    
        if(n==2){
            System.out.println(a+" "+b);
        }
        else{
        int osszeg;
            
            while (i<n){
                
                osszeg=a+b;
                System.out.println(osszeg);
                b=a;
                a=osszeg;
                osszeg=b;
                
                i++;
    
            }
        }
    }
    
    public static void fordit (int n) {
       int uj=0;
       int maradek;
       
       while (n!=0) {
           maradek=n%10;
           uj=uj*10+maradek;
           n=n/10;
           
       }
       System.out.println(uj);
       
   }
    
       public static void faktorialis (int szam) {
           int i=1;
           int szorzat=1;
           while (i!=szam+1) {
               szorzat=i*szorzat;
               i++;
           }
           System.out.println(szorzat);
           
       }
       
       public static void kozott (int n1,int n2,int k ) {
           int i=n1;
           while(i!=n2){
               if(i%k==0){
                   System.out.println(i);
               }
               i++;
           }
       }
              
    
    
    public static void main(String[] args) {
   
    System.out.println("1.feladat");
        novekvo(4, 12, 3);
    System.out.println("2.feladat");
        minmax(-5,-8, 5);
    System.out.println("3.feladat");
        abcd(5, 8, 3, 6);
    System.out.println("4.feladat");
        System.out.println(haromszog(3,6,8));
    System.out.println("5.feladat");
        szokoev(2015, 2030);
    System.out.println("6.feladat");
        erdemjegy(4);
    System.out.println("7.feladat");
        hanyados(150,15);
    System.out.println("8.feladat");
        prim(9);
    System.out.println("9.feladat");
        fibonacci(10);
    System.out.println("10.feladat");
        fordit(123);
    System.out.println("11.feladat");
        faktorialis(4);
    System.out.println("12.feladat");
        kozott(5,25,5);
    System.out.println("13.feladat");
    
    System.out.println("14.feladat");
    
    
    }  
}