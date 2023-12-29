import java.util.Scanner;

public class ATM {
   private Musteri m = new Musteri();
    Scanner sc = new Scanner(System.in);
    public void Menu(){
       if(girisYap()){

           while (true){
               System.out.println("1 - Para Ekle\n"+
                       "2 - Para çek\n"+
                       "3 - Bilgi Göster\n"+
                       "4 - Çıkış\n"+
                       "Lütfen Seçim Yapınız : ");
               int islem = sc.nextInt();
               switch (islem){
                   case 1:
                       paraEkle();
                       break;
                   case 2:
                       paraCek();
                       break;
                   case 3:
                       bilgiGoster();
                       break;
                   case 4:
                       return;

                   default:
                       System.out.println("Yanlış Giriş!!!");
               }
           }
       }
       else {
           System.out.println("Hesabınız Bloke Edildi");
       }
    }
    public void paraEkle(){
        System.out.println("Miktar Girini :");
        int miktar =sc.nextInt();
        if (miktar > 0){
            System.out.println("İşlem Başarılı");
            m.bakiye += miktar;
        }
        else {
            System.out.println("Yanlış Değer Girdiniz!!");
        }

    }
    public void paraCek(){
        System.out.println("Miktar Girini :");
        int miktar =sc.nextInt();
        if  (miktar <= m.bakiye){
            System.out.println("İşlem Başarılı");
            m.bakiye -= miktar;
        }
        else {
            System.out.println("Yetersiz Bakiye!!!");
        }


    }
    public boolean girisYap(){

        for (int i = 0; i < 3; i++) {
            System.out.println("Şifre Giriniz :");
            String girilenSifre = sc.nextLine();
            if (this.m.getSifre().equals(girilenSifre)){
                System.out.println("Giriş Başarılı...");
                return true;

            }
            else {
                System.out.println("Hatalı Giriş!!");
            }

        }
        return false;
    }
    public void bilgiGoster(){
        System.out.println("İsim :"+m.isim);
        System.out.println("MÜşteri No :"+m.mNo);
        System.out.println("Bakiye :"+m.bakiye);

    }
}
