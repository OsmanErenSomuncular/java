public class Ejderha extends Oyuncu{
    public Ejderha() {
        super("Ejderha");
        this.setCan(350);
        this.setHasar(85);
        this.setOran(30);
        this.setSavunma(50);
    }

    @Override
    public void move() {
        System.out.println("Uçarak gelen bir Ejderha var! Geçmiş Olsun!!!");
    }

    @Override
    public int atak() {
        int vurulanHasar = super.atak();
        if (getCan()>=100 && getCan()<=200){
            vurulanHasar = (int) (vurulanHasar*1.5);
        } else if (getCan()<100) {
            vurulanHasar = vurulanHasar*2;

        }
        return vurulanHasar;
    }
}
