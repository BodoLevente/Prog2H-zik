package Masodik;

public class Dolgozat {
    
    public static void legmagasabb3 (SzeszesItal[] ital) {
        int db=0;
        
        for(int i=0;i<ital.length-1;i++){
                for(int j=i+1;j<ital.length;j++){
                    if(ital[i].getAlkoholTartalom()<ital[j].getAlkoholTartalom()){
                        SzeszesItal tmp=ital[i];
                        ital[i]=ital[j];
                        ital[j]=tmp;
                    }
                }
        }
        if(ital.length<3) {
        }
        else for(int i=0;i<ital.length;i++){
            System.out.println(ital[i]);
        }
        
    }
          
    public static void main(String[] args) {
        
      SzeszesItal[] italok={ new SzeszesItal("La Fiesta","1 l",450,5),
                              new SzeszesItal("Dorombor","1 l",500,4.5),
                              new SzeszesItal("Cimbora","2 l",600,4),
                                new SzeszesItal("Cuvée","0,75 l",2500,6)};
        legmagasabb3(italok);
    }
}