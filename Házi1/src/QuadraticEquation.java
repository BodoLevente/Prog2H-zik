public class QuadraticEquation {
    
    private double a;
    private double b;
    private double c;
    
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
        
    public double getA() {
        return this.a;
    }
    
    public double getB() {
        return this.b;
    }
    
    public double getC() {
        return this.c;
    }
    
    public double getDiscriminal() {
        return this.b*this.b-4*this.a*this.c;
    }
    
    public double getRoot1() {
        if(this.getDiscriminal()>0) {
            return (-this.b+Math.sqrt(this.getDiscriminal()))/2*this.a;
        }
        else
            return 0;
    }
    
    public double getRoot2() {
        if(this.getDiscriminal()>0) {
            return (-this.b-Math.sqrt(this.getDiscriminal()))/2*this.a;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        return "a: " + a + " b: " + b + " c: " + c;
    }
    
    
    
    
}