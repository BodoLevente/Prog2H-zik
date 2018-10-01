public class Main {

    public static void main(String[] args) {    
        
    //1-es feladat
      Pont p1 = new Pont(1.4, 4.5);
      Pont p2 = new Pont(3.7, 7.3);
      Pont p3 = new Pont(5.2, 1.5);
      Pont p4 = new Pont(9.7, 11.3);
          p1.setY(p1.getY()+5);
          p2.setY(p2.getY()+5);
          p3.setX(p3.getX()-3.4);
          p4.setX(p4.getX()-3.4);
              System.out.println("p1 y koordinátája: "+p1.getY());
              System.out.println("p2 y koordinátája: "+p2.getY());
              System.out.println("p3 x koordinátája: "+p3.getX());
              System.out.println("p4 x koordinátája: "+p4.getX());

    //3-as feladat
      Rectangle re1 = new Rectangle(4, 40);
      Rectangle re2 = new Rectangle(3.5, 35.9);
          System.out.println(re1);
          System.out.println("A téglalap kerülete="+re1.getArea());
          System.out.println("A téglalap területe="+re1.getPerimeter());
          System.out.println(re2);
          System.out.println("A téglalap kerülete="+re2.getArea());
          System.out.println("A téglalap területe="+re2.getPerimeter());


    //4-es feladat
      Ital i = new Ital("Pepsi", "5dl");
          System.out.println(i);
          System.out.println("Az ára euróban : " + i.getArEuroban());

    //6-os feladat
        LinearEquation le1 = new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation le2 = new LinearEquation(3, 6, 2, 4, 9, 6);
        LinearEquation le3 = new LinearEquation(9, 5, 14, 16, 10, 7);
            if(le1.isSolvable()) {
                System.out.println("x értéke : " + le1.getX());
                System.out.println("y értéke : " + le1.getY());
            }
            else {
                System.out.printf("The equation has no solution\n");
            }
            if(le2.isSolvable()) {
                System.out.println("x értéke : " + le2.getX());
                System.out.println("y értéke : " + le2.getY());
            }
            else {
                System.out.printf("\nThe equation has no solution\n");
            }
            if(le3.isSolvable()) {
                System.out.println("\nx értéke : " + le3.getX());
                System.out.println("y értéke : " + le3.getY());
            }
            else {
                System.out.printf("\nThe equation has no solution\n");
            }


    }
      
}