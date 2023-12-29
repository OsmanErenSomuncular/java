public class Titan extends Oyuncu{
    public Titan() {
        super("Titan");
        this.setCan(200);
        this.setHasar(20);
        this.setOran(10);
        this.setSavunma(50);
    }

    @Override
    public void move() {
        System.out.println("Dikkat bir Titan sana Doğru koşuyor!!");
    }
}
