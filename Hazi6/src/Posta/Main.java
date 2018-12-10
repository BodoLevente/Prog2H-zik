package Posta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       
        List<Csomag> li = new ArrayList<>();
    
        try {
            FileReader fr = new FileReader(new File("post.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;
            
            while((sor=br.readLine())!=null) {
                String[] tmp = sor.split(":");
                Csomag cs = new Csomag(tmp[0],Integer.parseInt(tmp[1]),tmp[2],tmp[3],Integer.parseInt(tmp[4]),Integer.parseInt(tmp[5]));
                li.add(cs);
            }
            br.close();
        }catch(IOException e){
            System.out.println("hee");
        }
        
        Collections.sort(li);
        
        try {
            FileWriter fw = new FileWriter(new File("postKi.txt"));
            BufferedWriter bw = new BufferedWriter(fw); 
            
            int sum=0;
            for(int i=0;i<li.size()-1;i++){
                for(int l=i+1;l<li.size();l++) {
                    if(li.get(i).getIranyitoszam()==li.get(l).getIranyitoszam()){
                        sum+=li.get(i).getCsomag_erteke()+li.get(l).getCsomag_erteke();
                    }
                }
                bw.write(li.get(i).getIranyitoszam()+":"+sum+" Ft");
                bw.newLine();
                    for(int j=0;j<li.size();j++){
                        if(li.get(i).getIranyitoszam()==li.get(j).getIranyitoszam())
                             bw.write(li.get(j).toString()+"\n");
                    }
            }
            
            bw.close();
        }catch(IOException e) {
            System.out.println("mmm");
        }
    }
}  