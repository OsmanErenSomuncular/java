public class Saman extends Oyuncu{
    public Saman() {
        super("Şaman");
        this.setCan(120);
        this.setHasar(35);
        this.setOran(15);
        this.setSavunma(65);
    }

    @Override
    public int blok() {
       int blokDegeri = super.blok();
       int canYenile = (int) (getCan()*0.1);
       int canMiktarı = getCan() + canYenile;
       if (canMiktarı > 120) canMiktarı = 120;
       setCan(canMiktarı);

       return blokDegeri;
    }

    @Override
    public void move() {
        System.out.println("Dikkat et bir Şaman seni büyülemek üzere geliyor!!!");
    }
}
