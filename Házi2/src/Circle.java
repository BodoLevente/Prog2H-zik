public class Circle extends GeometricShape {

    private double radius;
    private String korok[];

    public Circle() {
        this.radius = 0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled, String[] kor) {
        super(color,filled);
        this.korok = kor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
    
    public double getPerimeter() {
        return 2*3.14*this.radius;
    }
    
    public double getDiameter() {
        return this.radius * 2;
    } 
}