public class Vampir extends Oyuncu {
    public Vampir() {
        super("Vampir");
        this.setCan(100);
        this.setHasar(65);
        this.setOran(30);
        this.setSavunma(20);

    }

    @Override
    public void move() {
        System.out.println("Vampir hareket ediyor!");
    }

    @Override
    public int atak() {
        int vurulanHasar = super.atak();
        double canYenile = vurulanHasar*0.07;
        int canMiktari = getCan() + (int) canYenile;
        if (canMiktari > 100) canMiktari = 100;
        setCan(canMiktari);
        return vurulanHasar;
    }


}


