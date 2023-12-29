import java.util.Random;

public class Ork extends Oyuncu{

    public Ork() {
        super("Ork");
        this.setCan(150);
        this.setHasar(30);
        this.setOran(20);
        this.setSavunma(80);

    }

    @Override
    public int atak() {
        int hasar = super.atak();
        // ekstara yapılacak özellikler
        return hasar;
    }

    @Override
    public int blok() {
        int blokDegeri = super.blok();
        // ekstra işlemler
        return blokDegeri;
    }

    @Override
    public void move() {
        System.out.println("Ork üzerine koşuyor!");
    }
}
