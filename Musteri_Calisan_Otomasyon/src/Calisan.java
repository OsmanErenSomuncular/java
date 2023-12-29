import java.time.LocalDate;

public class Calisan extends People {
    private double maas;
    private String departman;


    public Calisan(String isim, String soyisim, LocalDate dogumTarihi, double maas, String departman) {
        super(isim, soyisim, dogumTarihi);
        this.maas = maas;
        this.departman = departman;
    }


    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Maaş: " + maas);
        System.out.println("Departman: " + departman);
    }


    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
