package Tiz;

public class Teherauto extends Auto{

    private int teherbiras;

    public Teherauto(String rendszam, int teljesitmeny, boolean automata, int t) {
        super(rendszam, teljesitmeny, automata);
        this.teherbiras = t;
    }

    @Override
    public String toString() {
        return super.toString() + ", teherbiras: " + teherbiras;
    }
}