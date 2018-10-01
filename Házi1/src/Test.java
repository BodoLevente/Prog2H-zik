public class Test {

    public static void main(String[] args) {
   
      QuadraticEquation qe1 = new QuadraticEquation(1, 4, 3);
      QuadraticEquation qe2 = new QuadraticEquation(5, 7, 11);
      QuadraticEquation qe3 = new QuadraticEquation(7, 12, 13);
        if(qe1.getDiscriminal()>0) {
            System.out.println("x1 = "+qe1.getRoot1()+" "+"\nx2 = "+qe1.getRoot2());
        }   else if(qe1.getDiscriminal()==0) {
            System.out.println(qe1.getRoot1());
            }
                else {
                System.out.println("The equation has no roots");
            }
        if(qe2.getDiscriminal()>0) {
            System.out.println("x1 = "+qe2.getRoot1()+" "+"\nx2 = "+qe2.getRoot2());
        }   else if(qe2.getDiscriminal()==0) {
            System.out.println(qe2.getRoot1());
            }
                else {
                System.out.println("The equation has no roots");
            }
        if(qe3.getDiscriminal()>0) {
            System.out.println("x1 = "+qe3.getRoot1()+" "+"\nx2 = "+qe3.getRoot2());
        }   else if(qe3.getDiscriminal()==0) {
            System.out.println(qe3.getRoot1());
            }
                else {
                System.out.println("The equation has no roots");
            }   
    }
}