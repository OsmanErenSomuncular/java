public class Zombi extends Oyuncu{
    public Zombi() {
        super("Zombi");
        this.setCan(60);
        this.setHasar(20);
        this.setOran(20);
        this.setSavunma(45);
    }

    @Override
    public void move() {
        System.out.println("Uzaklardan yavaş yavaş gelen bir Zombi var!");
    }
}
