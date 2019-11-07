package pbo1.pkg10118033.latihan49;

public class Emas {
    private double berat;
    private final double harga = 570000;

    public double getBerat() {
        return berat;
    }

    public double getHarga() {
        return harga;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public double totalBayar(double berat){
        return harga*berat;
    }
}