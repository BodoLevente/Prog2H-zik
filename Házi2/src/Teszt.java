public class Teszt {
 
    public static Kocsma[] adottItaltKinaloKocsmak(String ital,VendeglatoipariEgyseg[] kocs){
        int count=0;
            for(int i=0;i<kocs.length;i++){
                if(kocs[i] instanceof Kocsma){
                    Kocsma k=(Kocsma) kocs[i];
                    
                    for(int j=0;j<k.getSorlap().length;j++){
                        if(k.getSorlap()[j].equals(ital)){
                           count++;
                        }
                    }
                }
            }
        Kocsma[] Kocsma=new Kocsma[count];
        
        int k=0;
        
            for(int i=0;i<kocs.length;i++){
                if(kocs[i] instanceof Kocsma){
                    Kocsma p=(Kocsma) kocs[i];
                    
                    for(int j=0;j<p.getSorlap().length;j++){
                        if(p.getSorlap()[j].equals(ital)){
                           Kocsma[k]=p;
                           k++;
                        }
                    }
                }
            }
        return Kocsma;
    }
    
    public static void main(String[] args) {
        VendeglatoipariEgyseg[] kocs = new VendeglatoipariEgyseg[]{
            new Etterem("McDonalds",1,false,new String[]{"Sajtburger","McNuggets","Big Mac"}),
            new Etterem("Burger King",1,false,new String[]{"Whopper","Cheeseburger","Big King"}),
            new Etterem("Csokonai",1,false,new String[]{"Gulyásleves","Rántott hús","Pörkölt"}), 
            new Etterem("Meteor",1,false,new String[]{"Hot Dog","Hamburger","Gyros"}),
            new Etterem("Hüse",1,false,new String[]{"Húsleves","Rostélyos","Pisztráng"}),
            new Kocsma("Valhalla",1,true,new String[]{"Váza","Heineken","Dinó"}),
            new Kocsma("Picolo",1,true,new String[]{"Vorosbor","Heineken","Stampó"}),
            new Kocsma("Ibolya",1,true,new String[]{"Tátra tea","Kobanyai","Barack palinka"}),
            new Kocsma("Mob",1,true,new String[]{"Whiskey","Heineken","Borsodi"}),
            new Kocsma("Kolkáv",1,true,new String[]{"Vodka","Tequila","Jagermeister"}) 
        };
        
        Kocsma[] ko = adottItaltKinaloKocsmak("Heineken",kocs);
        
            for(Kocsma k:ko)
        System.out.println(k);
        
    }
}