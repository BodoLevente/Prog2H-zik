package OroszlanUvoltes;

import java.util.ArrayList;
import java.util.List;

public class Allomas {
    
    private String azonosító;
    private String felvétel;

    public Allomas(String azonosító, String felvétel) {
        this.azonosító = azonosító;
        this.felvétel = felvétel;
    }

    public String getAzonosító() {
        return azonosító;
    }

    public String getFelvétel() {
        return felvétel;
    }
    
    public List<Integer> oroszanÜvöltésPoz()
    {
          List<Integer> l= new ArrayList<>();
        for (int i=0;i<this.felvétel.length();i++)
        {
        if(this.felvétel.charAt(i)=='O')
            l.add(i);        
        }
    return l;
    } 
}