import java.util.Date;

public class Auto {

    private String rendszam;
    private int motorTeljesitmeny;
    private Date gyartasiDatuma;

    public Auto(String rendszam, int motorTeljesitmeny) {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
        this.gyartasiDatuma = new Date();
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyartasiDatuma() {
        return gyartasiDatuma;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Rendszám: " + rendszam + " Motor Teljesítmény: " + motorTeljesitmeny + " Gyártási Dátuma: " + gyartasiDatuma + "\n";
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if(obj == null || !(obj instanceof Auto))
            return false;
        
        Auto a = (Auto) obj;
        
        return this.rendszam.equals(a.getRendszam()) && this.motorTeljesitmeny == a.getMotorTeljesitmeny();
    } 
}