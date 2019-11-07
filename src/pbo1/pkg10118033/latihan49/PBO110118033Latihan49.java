
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan biaya mas
 *                     kawin.
 *  
 */

package pbo1.pkg10118033.latihan49;

public class PBO110118033Latihan49 {
    public static void main(String[] args) {
        Emas emas = new Emas();
        emas.setBerat(15.7);
        System.out.println("Harga emas 1 gram : Rp."+emas.getHarga());
        System.out.printf("Berat emas  : %1.1f gram\n", emas.getBerat());
        System.out.println("Total Bayar : Rp."+emas.totalBayar(emas.getBerat()));
    }
}