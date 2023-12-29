public class Tavsan extends Hayvan{
    public Tavsan (String isim){
        super(isim);
    }

    @Override
    public void kos(int zar){
        switch (zar){
            case 1:
            case 2:
            case 3:
                System.out.println(this.isim+" zıpladı");
                this.konum+=2;
                break;
            case 4:
            case 5:
                System.out.println(this.isim+" yemek yiyiyor");
                break;
            case 6:
                System.out.println(this.isim+" uyuya kaldı");
                this.konum--;
                break;

        }
    }
}