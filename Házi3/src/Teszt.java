import java.util.Scanner;

public class Teszt {

    private static void rendez(Diak[] d) {

        for (int i = 0; i < d.length - 1; i++) {   //A híres dupla for: így csináltam, hogy szokjátok. De remélem mindenki utána nézett tavalyi dolog ;)
            for (int j = i + 1; j < d.length; j++) {
                //megkeressük azt a diákot aki előtt az i-edik gyerek áll
                // ha j==i+1, akkor a keresett diák jó helyen áll(épp az i után), nem kell cserélni
                // ellenkező esetben a keresett diák valahol i+2, i+3, i+4,...,d.length helyen van épp, ezért:
                // helyezzük őt az i-edik diák mellé, azaz az i+1-edik pozícióra
                //Megjegyzem: szerencsére a d[0] pozíción jó diák áll, hisz azt tudjuk, hogy legelső lépésben az első diákot raktuk a tömbbe, csak aztán jöttek véletlenszerűen a többiek
                if (d[j].getElozoNeve().equals(d[i].getSajatNeve()) && j > i + 1) {
                    Diak tmp = d[i + 1];
                    d[i + 1] = d[j];
                    d[j] = tmp;

                }

            }
        }

    }

    private static void pirosKek(Diak[] d, String ki) {

        int piros = 0;
        int kek = 0;
        for (int i = 0; i < d.length; i++) { // itt már a diákok növekső sorendbe állnak
             // ha elérünk a kiszemelt X-edik diákhoz, írjuk ki, hogy hány piros és kék sapkát látott, majd álljunk meg!
            // külünben!!!!=amíg el nem érjük őt, számoljuk meg előtte hány pirps és kék sapkás diák van = ez a feladat :)
            if (d[i].getSajatNeve().equals(ki)) {  
                System.out.println(piros + " " + kek);
                break;

            } else if (i % 2 == 0) { //a páros pozíción piros sakpások vannak: első diák piros sapkát kap---> d[0]-ba kerül
                piros++;
            } else {
                kek++;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine(); //beolvassuk az első sort
        String[] s = sor.split(";"); //az első sort 3 részre daraboljuk

        int n = Integer.parseInt(s[0]); //a feldarabolt sor 1. része a sorok száma=n (beleértve ezt a sort is); így n-1 sor marad még hátra
        Diak[] d = new Diak[n]; // n-darab sor= n darab diák; ebben a tömben fogjuk tárolni őket
        d[0] = new Diak(s[1], ""); // a feldarabolt sor 2.-ik része megadja az első diákot; ezt létre hozzuk és bele is tesszük a tömbe(ez lesz a tömb első eleme)
                                   // mivel ez az első diák, előtte nem áll senki, így az ő előzőNeve mezője üres String
        String X = s[2];    // a feldarabolt sor 3. része megadja azt a diákot, akinek a szemszögéből számolni fogjuk a sapkákat: ő tekint előre és számol

        for (int i = 1; i < n; i++) { //!!!  az i=1-ről indul: az első diák már a tömben van
            sor = sc.nextLine();     //figyelem a diákok nem sorrendben követik egymást az input sorokbam
            s = sor.split(";");      //ketté vágom a sort
            d[i] = new Diak(s[0], s[1]);    //saját neve; előzőNeve

        }

        rendez(d); // tornasorba rendezi a diákokat!!!

        for (Diak i : d) {    // foreach : kiíratom a diákokat tornasorban növekvőleg állítva
            System.out.println(i);
        }
        
        pirosKek(d, X);  // megszámolja és kiírja az X diák hány piros és kék sapkát lát, ha a sor eleje felé néz(legkisseb diák felé)
    }
}