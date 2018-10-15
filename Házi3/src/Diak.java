public class Diak {
    
    private String sajatNeve;
    private String elozoNeve;

    public Diak(String sajatNeve, String elozoNeve) {
        this.sajatNeve = sajatNeve;
        this.elozoNeve = elozoNeve;
    }

    public String getSajatNeve() {
        return sajatNeve;
    }

    public String getElozoNeve() {
        return elozoNeve;
    }

    @Override
    public String toString() {
        return "Saját neve : " + sajatNeve + ", előző neve : " + elozoNeve;
    }
}