import java.util.Random;

public class Pc {
    public  String isim;
    public int puan;
    public Random rdn = new Random();

    public Pc(String isim){
        this.isim= isim;
        this.puan= 0;
    }

    public int oyna(){
        int sonuc = rdn.nextInt(3);
        if (sonuc==0)
            System.out.println(this.isim+" TAS secti");
        else if (sonuc==1)
            System.out.println(this.isim+" KAGIT secti");
        else
            System.out.println(this.isim+" Makas secti");
        return sonuc;


    }
}
