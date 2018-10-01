public class Rectangle {
    public double width;
    private double height;
    
    public Rectangle() {
        this.width=1.0;
        this.height=1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        
        return this.width*this.height;
    }
    
    public double getPerimeter() {
        
        return 2*(this.width+this.height);
    }

    @Override
    public String toString() {
        return "szélesség : " + width + "\nmagasság : " + height;
    }
  
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double h) {
        this.height=h;
    }
}