import java.util.Random;

public class Oyun {
    int pistUzunlugu = 100;

    Random rnd = new Random();

    public void oyunuBaslat(){
        Tavsan t = new Tavsan(" Tavşan ");
        Kaplumbaga k = new Kaplumbaga(" Kaplumbağa ");

        while (true){
            t.kos(zarAt());
            k.kos(zarAt());
            if (t.konum >= 100 && k.konum>=100){
                System.out.println("berabere!");
                break;
            } else if (t.konum>=100) {
                System.out.println("Tavşan kazandı!!");
                break;

            } else if (k.konum>=100) {
                System.out.println("Kaplumbağa kazandı!!");
                break;

            }
            else {
                System.out.println("Tavşanın konumu :"+t.konum);
                System.out.println("Kaplumbağnın konumu :"+k.konum);
            }
        }


    }
    public int zarAt(){
        int sayi = rnd.nextInt(1,7);
        return sayi;

        //return rnd.nexInt(6)+1;
    }
}