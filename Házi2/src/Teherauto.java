import java.util.Arrays;
import java.util.Date;

public class Teherauto extends Auto {
    
    private int maxSzallithatoTeher;

    public Teherauto(String rendszam, int motorTeljesitmeny, int mszt) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = mszt;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return super.toString() +  "Max szállítható teher : " + maxSzallithatoTeher;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if(obj == null || !(obj instanceof Auto))
            return false;
        
        Auto a = (Auto) obj;
        
        return super.equals(a);
    }
}