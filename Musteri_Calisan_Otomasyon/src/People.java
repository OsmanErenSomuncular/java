import java.time.LocalDate;


public abstract class People {

    private String isim;
    private String soyisim;
    private LocalDate dogumTarihi;


    public People(String isim, String soyisim, LocalDate dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }


    public void bilgiGoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Soyisim: " + soyisim);
        System.out.println("Doğum Tarihi: " + dogumTarihi);
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}

