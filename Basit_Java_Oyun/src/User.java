import java.util.Scanner;

public class User extends Oyuncu{
   static Scanner sc = new Scanner(System.in);
   private int maxCan;
    public User(String isim) {
        super(isim);
        this.setCan(100);
        this.maxCan = getCan();
        this.setHasar(45);
        this.setOran(25);
        this.setSavunma(50);
    }

    @Override
    public void move() {

    }

    @Override
    public void levelUp() {
        this.addLevel();
        System.out.println("Level Atladınız : "+getLevel());
        this.setCan(this.maxCan);
        System.out.println("1 - Can -"+getCan()+"- => -" +(getCan()+50)+"-");
        System.out.println("2 - Saldırı -"+getHasar()+"- => -" +(getHasar()+20)+"-");
        System.out.println("3 - Savunma -"+getSavunma()+"- => -" +(getSavunma()+20)+"-");
        System.out.println("4 - K.Oran -"+getOran()+"- => -" +(getOran()+15)+"-");
        System.out.println("Arttirmak istediginiz Özelliği seçin :");
        int secim = sc.nextInt();
        switch (secim){
            case 1:
                setCan(maxCan+50);
                break;
            case 2:
                setHasar((getHasar()+20));
                break;
            case 3:
                setSavunma(getSavunma()+20);
                break;
            case 4:
                setOran(getOran()+15);
                break;
            default:
                System.out.println("Yanlış değer girdiniz Hakkınızı Kaybettiniz");
        }
    }
}
