package Antikvar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teszt {

    public static void main(String[] args) {
        
        List<Konyv> li = new ArrayList<>();
        
        try {
            FileReader fr = new FileReader(new File("sample.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;
            
            while((sor=br.readLine())!=null) {
                String[] tmp = sor.split(";");
                Konyv k = new Konyv(tmp[tmp.length-2],Integer.parseInt(tmp[tmp.length-1]));
                
                for(int i=0;i<tmp.length-2;i++)
                    k.getSzerzok().add(tmp[i]);
                
                li.add(k);
            }     
            br.close();
        }catch(IOException e) {
            System.out.println("File hiba!");
        }
        
        Collections.sort(li);
        
        try {
            FileWriter fw = new FileWriter(new File("ki.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            
            List<Konyv> li2 = new ArrayList<>();
            for(int i=0;i<li.size()-1;i++) {
                li2.add(li.get(i));
                for(int j=i+1;j<li.size();j++) {
                    if(li.get(i).equals(li.get(j)))
                            li.remove(j);
                }
            }
            li2.add(li.get(li.size()-1));
            
            for(Konyv i:li2) {
                
                bw.write(i.toString());
                bw.newLine();
            }
            bw.close();
        }catch(IOException e) {
            
        }        
    }
}