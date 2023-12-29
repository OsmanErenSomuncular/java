import java.util.Random;

public class Oyuncu {
    private String isim;
    private int oran;
    private int can;
    private int hasar;
    private int savunma;
    private int level;

    public Oyuncu(String isim) {
        this.isim = isim;
        this.level = 1;
    }

    public void move(){

    }
    public int atak(){
        Random r = new Random();
        int vurulanHasar = 2*(r.nextInt(getHasar()/2,getHasar()));
        if (r.nextInt(100) < this.getOran()){
            System.out.println(this.isim+" kritik vuruyor!!!");
            vurulanHasar = 2*vurulanHasar;
        }

        return vurulanHasar;


    }
    public int blok(){
        Random r = new Random();
        int blokDegeri = r.nextInt(this.getSavunma()/3,getSavunma());
        System.out.println(this.isim+" savunma yapıyor!");
        return blokDegeri;


    }
    public void levelUp(){  }

    public String getIsim(){
        return isim;
    }

    public int getOran() {
        return oran;
    }

    public void setOran(int oran) {
        this.oran = oran;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        if (hasar >0 && hasar <= 100)

            this.hasar = hasar;
        else
            this.hasar =0;
    }

    public int getSavunma() {
        return savunma;
    }

    public void setSavunma(int savunma) {
        this.savunma = savunma;
    }

    public int getLevel() {
        return level;
    }

    public void addLevel() {
        this.level++;
    }


}
