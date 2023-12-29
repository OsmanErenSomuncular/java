import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Oyun {
    private int dusmanSayisi = 5;
    ArrayList<Oyuncu> dusmanListesi = new ArrayList();
    public Oyun(){
        dusmanListesi.add(new Ork());
        dusmanListesi.add(new Vampir());
        dusmanListesi.add(new Saman());
        dusmanListesi.add(new Titan());
        dusmanListesi.add(new Zombi());


    }
    public void basla(){
        User user = new User("User ");
        Scanner scanner = new Scanner(System.in);
        Random rdn = new Random();
        while (true){
            Oyuncu dusman = dusmanBelirle();
            while (true){
                System.out.println(user.getIsim()+" canı :"+user.getCan());
                System.out.println(dusman.getIsim()+" canı :"+dusman.getCan());
                System.out.println("1 - Saldır\n"+
                        "2 - Savun\n"+
                        "Seçim yapınız :");
                int islemUser = scanner.nextInt();
                int islemDusman = rdn.nextInt(2)+1;
                if(islemUser == islemDusman){
                    if (islemUser == 1){
                        int userHasar = user.atak();
                        int dusmanHasar = dusman.atak();
                        user.setCan(user.getCan() - dusmanHasar);
                        dusman.setCan(dusman.getCan() - userHasar);
                        System.out.println("Kullanıcı Hasarı : "+ userHasar);
                        System.out.println(dusman.getIsim()+"Hasarı :"+ dusmanHasar);
                    }
                    else {
                        System.out.println("Hamle Yapmanızı Bekliyoruz");
                    }
                } else if (islemDusman > islemUser) {
                    int userHasar = user.atak();
                    int dusmanSavunma = dusman.blok();
                    if (userHasar > dusmanSavunma){
                        System.out.println("Saldırı Başarılı!!! :"+userHasar);
                        dusman.setCan(dusman.getCan()- userHasar);
                    }
                    else {
                        System.out.println("Blok Başarılı!!");
                    }

                }
                else {
                    int userSavunma = user.blok();
                    int dusmanHasar = dusman.atak();
                    if (userSavunma > dusmanHasar){
                        System.out.println("Saldırı Başarılı!!! :"+dusmanHasar);
                        dusman.setCan(dusman.getCan()- dusmanHasar);
                    }
                    else {
                        System.out.println("Blok Başarılı!!");
                    }

                }
                if(user.getCan() <= 0) {
                    System.out.println("Öldünüz!!!");
                    return;
                }
                if(dusman.getCan() <= 0){
                    System.out.println("Kazandınız!!");
                    dusmanSayisi--;
                    user.levelUp();
                    break;
                }
            }
            if (dusmanSayisi < 0){
                System.out.println("Oyunu kazandınız!");
                break;
            }




    }


    }
    public Oyuncu dusmanBelirle() {
        Oyuncu o = new Ejderha();

        Random r = new Random();
        if (dusmanSayisi > 0) {
            int index = r.nextInt(dusmanSayisi);
            o = dusmanListesi.get(index);
            dusmanListesi.remove(index);
            dusmanSayisi--;
        }
        return o;
    }
}
