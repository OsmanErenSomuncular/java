import java.time.LocalDate;
import java.util.Random;

public class Musteri extends People {
    private String musteriNo;


    public Musteri(String isim, String soyisim, LocalDate dogumTarihi) {
        super(isim, soyisim, dogumTarihi);
        this.musteriNo = musteriNoOlustur();
    }


    private String musteriNoOlustur() {
        Random random = new Random();
        StringBuilder musteriNumarasi = new StringBuilder();


        for (int i = 0; i < 16; i++) {
            int rastgeleSayi = random.nextInt(10);
            musteriNumarasi.append(rastgeleSayi);
        }

        return musteriNumarasi.toString();
    }


    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Müşteri Numarası: " + musteriNo);
    }


    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }
}

