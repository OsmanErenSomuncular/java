import java.util.Scanner;

public class User {
    public  String isim;
    public int puan;
    public Scanner scanner= new Scanner(System.in);
    public User(String isim){
        this.isim= isim;
        this.puan=0;
    }
    public int oyna(){
        int sonuc =3; // sıfır dışında değer vermek gerek while çalışması için
        while (sonuc<0 || sonuc>2){

            System.out.println("0 - TAS\n" +
                    "1 - Kagıt\n" +
                    "2 - MAKAS\n"+
                    "Lütfen bir seçim yapınız :");
            sonuc = scanner.nextInt();
            if (sonuc<0 || sonuc>2)
                System.out.println("yanlış değer ");

        }



        if (sonuc==0)
            System.out.println(this.isim+" TAS secti");
        else if (sonuc==1)
            System.out.println(this.isim+" KAGIT secti");
        else
            System.out.println(this.isim+" Makas secti");
        return sonuc;
    }
}
