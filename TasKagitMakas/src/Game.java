import java.util.Scanner;

public class Game {
    public void oyunuOyna(){

        Pc p = new Pc("AI :");
        User k = new User("Oyuncu :");



        while (true){
            int userSecim = k.oyna();
            int pcSecim = p.oyna();

            if (userSecim == pcSecim){
                System.out.println(" Berabere");
            } else if ((userSecim == 0 && pcSecim ==2) ||
                    (userSecim == 1 && pcSecim == 0) ||
                    (userSecim == 2 && pcSecim == 1)){
                System.out.println(k.isim + " Kazandı");
                k.puan++;

            }
            else {
                System.out.println(p.isim + " Kazandı");
                p.puan++;
            }
            if (k.puan == 3){
                System.out.println(k.isim+" oyunu kazandı");
                break;
            }
            if (p.puan == 3){
                System.out.println(p.isim+" oyunu kazandı");
                break;
            }
        }


    }
}
