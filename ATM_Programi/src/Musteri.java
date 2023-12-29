import java.util.Random;
import java.util.Scanner;

public class Musteri {
    String isim;
    String mNo;
   private String Sifre;
    int bakiye;

    public Musteri(){
        Scanner sc = new Scanner(System.in);
        System.out.println("İsim :");
        this.isim = sc.nextLine();
        System.out.println("Sifre :");
        this.Sifre = sc.nextLine();
        this.bakiye = 1000;
        setmNo();

    }

    public String getSifre() {
        return Sifre;
    }

    private void setmNo() {
        mNo = "";
        Random r = new Random();
        for (int i = 0; i < 16; i++) {
            if (i==0){
                int rakam = r.nextInt(1,10);
                mNo += rakam;
            }
            else {
                int rakam = r.nextInt(10);
                mNo += rakam;
            }


        }
    }
}
