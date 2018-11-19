package Harmadik;

public class Tea implements Rendezheto <Tea>{
    public String nev; 
    public int ar; 
    
    public Tea(String s,int j){ 
        this.nev=s;
        this.ar=j;
    }

    public int getAr(){
        return this.ar;
    }
    
    public boolean egyenlo(Tea o) {
        if(this.ar == o.getAr()) return true;
        else return false;
    }

  
    public boolean nagyobbMint(Tea o) {
        if(this.ar > o.getAr()) return true;
        else return false;
    }

  
    public boolean kisebbMint(Tea o) {
        if(this.ar > o.getAr()) return true;
        else return false;
    }
}