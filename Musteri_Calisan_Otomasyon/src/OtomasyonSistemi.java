import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class OtomasyonSistemi {
    private ArrayList<Musteri> musteriListesi;
    private ArrayList<Calisan> calisanListesi;
    private Scanner scanner;


    public OtomasyonSistemi() {
        musteriListesi = new ArrayList<>();
        calisanListesi = new ArrayList<>();
        scanner = new Scanner(System.in);
    }


    public void sistemiBaslat() {
        int secim;

        do {
            System.out.println("1. Müşteri Ekle");
            System.out.println("2. Çalışan Ekle");
            System.out.println("3. Müşteri Ara");
            System.out.println("4. Çalışan Ara");
            System.out.println("5. Müşteri Sil");
            System.out.println("6. Çalışan Sil");
            System.out.println("7. Müşterileri Göster");
            System.out.println("8. Çalışanları Göster");
            System.out.println("0. Çıkış");

            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    musteriEkle();
                    break;
                case 2:
                    calisanEkle();
                    break;
                case 3:
                    musteriAra();
                    break;
                case 4:
                    calisanAra();
                    break;
                case 5:
                    musteriSil();
                    break;
                case 6:
                    calisanSil();
                    break;
                case 7:
                    musterileriGoster();
                    break;
                case 8:
                    calisanlariGoster();
                    break;
                case 0:
                    System.out.println("Otomasyon Sistemi Kapatılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    break;
            }
        } while (secim != 0);
    }


    public void musteriEkle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Müşteri bilgilerini girin:");
        System.out.print("İsim: ");
        String isim = scanner.nextLine();

        System.out.print("Soyisim: ");
        String soyisim = scanner.nextLine();

        System.out.print("Doğum Tarihi (yyyy-ay-gün): ");
        String dogumTarihiStr = scanner.nextLine();
        LocalDate dogumTarihi = LocalDate.parse(dogumTarihiStr);


        Musteri yeniMusteri = new Musteri(isim, soyisim, dogumTarihi);
        musteriListesi.add(yeniMusteri);

        System.out.println("Müşteri başarıyla eklendi: " + isim + " " + soyisim);
    }

    public void calisanEkle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışan bilgilerini girin:");
        System.out.print("İsim: ");
        String isim = scanner.nextLine();

        System.out.print("Soyisim: ");
        String soyisim = scanner.nextLine();

        System.out.print("Doğum Tarihi (yyyy-ay-gün): ");
        String dogumTarihiStr = scanner.nextLine();
        LocalDate dogumTarihi = LocalDate.parse(dogumTarihiStr);

        System.out.print("Maaş: ");
        double maas = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Departman: ");
        String departman = scanner.nextLine();


        Calisan yeniCalisan = new Calisan(isim, soyisim, dogumTarihi, maas, departman);
        calisanListesi.add(yeniCalisan);

        System.out.println("Çalışan başarıyla eklendi: " + isim + " " + soyisim);
    }

    public void musteriAra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aranacak Müşterinin İsmi: ");
        String arananIsim = scanner.nextLine();

        boolean bulundu = false;

        System.out.println("Aranan Müşteriler:");
        for (Musteri musteri : musteriListesi) {
            if (musteri.getIsim().equalsIgnoreCase(arananIsim)) {
                musteri.bilgiGoster();
                bulundu = true;
            }
        }

        if (!bulundu) {
            System.out.println("Aranan isme sahip müşteri bulunamadı.");
        }
    }

    public void calisanAra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aranacak Çalışanın İsmi: ");
        String arananIsim = scanner.nextLine();

        boolean bulundu = false;

        System.out.println("Aranan Çalışanlar:");
        for (Calisan calisan : calisanListesi) {
            if (calisan.getIsim().equalsIgnoreCase(arananIsim)) {
                calisan.bilgiGoster();
                bulundu = true;
            }
        }

        if (!bulundu) {
            System.out.println("Aranan isme sahip çalışan bulunamadı.");
        }
    }

    public void musteriSil() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silinecek Müşterinin İsmi: ");
        String silinecekIsim = scanner.nextLine();

        boolean bulundu = false;
        for (Musteri musteri : musteriListesi) {
            if (musteri.getIsim().equalsIgnoreCase(silinecekIsim)) {
                musteriListesi.remove(musteri);
                System.out.println(silinecekIsim + " isimli müşteri başarıyla silindi.");
                bulundu = true;
                break;
            }
        }

        if (!bulundu) {
            System.out.println("Silinecek müşteri bulunamadı.");
        }


        System.out.println("Güncellenmiş Müşteri Listesi:");
        musterileriGoster();
    }



    public void calisanSil() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silinecek Çalışanın İsmi: ");
        String silinecekIsim = scanner.nextLine();

        boolean bulundu = false;
        for (Calisan calisan : calisanListesi) {
            if (calisan.getIsim().equalsIgnoreCase(silinecekIsim)) {
                calisanListesi.remove(calisan);
                System.out.println(silinecekIsim + " isimli çalışan başarıyla silindi.");
                bulundu = true;
                break;
            }
        }

        if (!bulundu) {
            System.out.println("Silinecek çalışan bulunamadı.");
        }


        System.out.println("Güncellenmiş Çalışan Listesi:");
        calisanlariGoster();
    }

    public void musterileriGoster() {
        if (musteriListesi.isEmpty()) {
            System.out.println("Mevcut müşteri bulunmamaktadır.");
        } else {
            System.out.println("Mevcut Müşteriler:");
            for (Musteri musteri : musteriListesi) {
                musteri.bilgiGoster();
                System.out.println("------------------------------");
            }
        }
    }

    public void calisanlariGoster() {
        if (calisanListesi.isEmpty()) {
            System.out.println("Mevcut çalışan bulunmamaktadır.");
        } else {
            System.out.println("Mevcut Çalışanlar:");
            for (Calisan calisan : calisanListesi) {
                calisan.bilgiGoster();
                System.out.println("------------------------------");
            }
        }
    }


}

