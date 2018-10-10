import java.util.Random;

public class Main {
    
    public static boolean isConsecutiveFour(int[] values) {
        
        int szam = values[0];
        int darab =0;
        
        if(values.length<4) {
            return false;
        }
        for(int i=1;i<values.length;i++) {
            if(values[i] == szam) {
                darab++;
            }
                else {
                    darab = 1;
                    szam = values[i];
                }
            if(darab == 4)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
   
        Triangle t1 = new Triangle(1, 1.5, 1);
        System.out.println(t1);
        System.out.println("Területe : " + t1.getArea() + "\nKerülete : " + t1.getPerimeter());
        t1.setColor("Yellow");
        t1.setFilled(true);
        System.out.println("Színe : " + t1.getColor());
        System.out.println("Filled : " + t1.isFilled());

        int szamok[] = {1,5,8,7,7,7,7};
        System.out.println(isConsecutiveFour(szamok));
        
        
   
    }   
}