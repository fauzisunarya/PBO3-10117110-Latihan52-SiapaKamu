
/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Siapa Kamu Dengan Menggunakan Konsep OOP inheritance dan polymorphism
 */
package pbo3.pkg10117110.latihan52.siapakamu;


public class PBO310117110Latihan52SiapaKamu {

 
    public static void main(String[] args) {
        
        Dosen obj = new Dosen();
        obj.setNip("41227829930");
        System.out.println("NIP DOSEN : "+obj.getNip());
        obj.siapaKamu();
        obj.mengajarApa();
        
        
        System.out.println("");
        System.out.println("");
        
        
        Mahasiswa obj1 = new Mahasiswa();
        obj1.setNim("10110269");
        System.out.println("NIM MAHASISWA : "+obj1.getNim());
        obj1.siapaKamu();
        obj1.kelasApa();
   
    }
    
}
