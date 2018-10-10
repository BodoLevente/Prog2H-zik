import java.util.Date;

public class GeometricShape {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricShape() {
        this.color = "White";
        this.filled = false;
        this.dateCreated = new Date();
    }
    
    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public boolean isFilled() {
        return filled;
    }    

    @Override
    public String toString() {
        return dateCreated + "\n" + "color: " + color + " and filled: " + filled;
    }
}