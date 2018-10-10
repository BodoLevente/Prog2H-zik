public class Rectangle extends GeometricShape {
    
    private String[] teglalap;
    private double width;
    private double height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height, String color, Boolean filled, String[] tegla){
        super(color,filled);
        this.teglalap=tegla;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea() {
        return this.width * this.height;
    }
    
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }  
}