import java.util.Random;

public class Test {
    
    static void printArray(int[] a) {
    
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
        }   
        
        System.out.println();
    }
    
    static void insertionSort(int[] a) {
            
        int temp=0;
        
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i]>a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                }
            }
        }
    }
    
    public static void rendezMaxSzallithatoTeherCsokkenoleg(Teherauto[] teher) {
        
        for(int i=0;i<teher.length-1;i++) {
            for(int j=i+1;j<teher.length;j++) {
                if(teher[i].getMaxSzallithatoTeher()<teher[j].getMaxSzallithatoTeher()) {
                    Teherauto tmp = teher[i];
                    teher[i] = teher[j];
                    teher[j] = tmp;
                }
            }
        }
    }
    
    public static Auto keresMaxMotorTeljesitmeny(Auto[] auto) {
        
        int max = 0;
        int j = 0;
        int index = 0;
        
        for(int i=0;i<auto.length;i++) {
            if(auto[i] instanceof Auto) {
                Auto[] auto1 = new Auto[j];
            }
        }
        for(int k=0;k<auto.length;k++) {
            if(auto[k].getMotorTeljesitmeny()>max)
                max=auto[k].getMotorTeljesitmeny();
        }
        for(int l=0;l<auto.length;l++) {
            if(auto[l].getMotorTeljesitmeny() == max)
                index = l;
        }
        return auto[index];
    }
    
    private static void kiir(Auto[] auto) {
        for(int i=0;i<auto.length;i++)
            System.out.println(auto[i]);
    }
    
    public static void main(String[] args) {
   
        Auto[] a1 = new Auto[] {
        new Auto("KUJ:569", 87),
        new Auto("AJE:229", 103),
        new Auto("NHA:918", 300),
        new Auto("IOL:992", 150),
        new Auto("JJI:417", 78),
        new Teherauto("VBS:167",450,1500),
        new Teherauto("DCX:145",500,2000),
        new Teherauto("CDS:864",550,3000),
        new Teherauto("LAS:775",380,2500),
        new Teherauto("LKS:355",420,4000)
        };
        
        Teherauto[] t1 = new Teherauto[] {
            new Teherauto("JNH:227",500,2600),
            new Teherauto("SBH:153",630,3500),
            new Teherauto("KFS:732",510,4000),
            new Teherauto("NFA:633",480,2900),
            new Teherauto("WUG:724",600,3800),
            new Teherauto("NHS:174",390,3600),
            new Teherauto("TGS:272",570,4400),
            new Teherauto("JDS:186",420,5000),
            new Teherauto("SJD:287",350,3900),
            new Teherauto("KSC:335",550,5000),
        };
        
        
        rendezMaxSzallithatoTeherCsokkenoleg(t1);
        kiir(t1);
        System.out.println("\nLegnagyobb teljesítményű autó : " + keresMaxMotorTeljesitmeny(a1) + "\n");
        
        Random rnd = new Random();
        int[] t = new int[30];
    
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10);
        }

        printArray(t);
        
        long timeStart = System.currentTimeMillis();
        insertionSort(t);
        long timeEnd = System.currentTimeMillis();
        
        printArray(t);
        
        System.out.println(timeEnd - timeStart);
    }  
}