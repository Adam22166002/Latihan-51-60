/**
 * @author 
 * Nama:ADAM
 * Nim :22166002
 * Prodi:sistem informasi
 * SALDO TARGET TABUNGAN
 */

//membuat superclass atau class utama 
public class Konan59 extends KarakterDetectiveConan {
    private String nama;
    private int usia;
    private String organisasi;

    // Menambahkan konstruktor untuk kelas Konan59
    public Konan59(String nama, int usia, String organisasi) {
        this.nama = nama;
        this.usia = usia;
        this.organisasi = organisasi;
    }

    // Implementasi metode abstrak dari interface KarakterDetectiveConan
    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Organisasi: " + organisasi);
    }

    // Implementasi metode abstrak dari interface KarakterDetectiveConan
    public void peran() {
        System.out.println("Peran: Anggota Organisasi Hitam");
    }
// Metode utama untuk pengujian fungsionalitas class KarakterDetectiveConan DAN ShinichiKudo
    public static void main(String[] args) {
        // Membuat objek karakter Konan dan Shinichi Kudo
        Konan59 konan = new Konan59("Konan", 19, "Organisasi Hitam");
        // ... (lanjutkan dengan objek ShinichiKudo dan pemanggilan metode)
        ShinichiKudo karakterShinichi = new ShinichiKudo("Shinichi Kudo", "Kemampuan deduksi yang tinggi");

        // Polimorfisme, mengakses informasi karakter melalui interface KarakterDetectiveConan
        KarakterDetectiveConan karakter1 = konan;  // Menggunakan variabel konan yang sudah dideklarasikan
        ShinichiKudo karakter2 = karakterShinichi;

        // Menampilkan informasi dan peran dari setiap karakter
        karakter1.tampilInfo();
        karakter1.peran();

        karakter2.tampilInfo();
        karakter2.peran();
    }
}
//PEMBUATAN SUBCLASS KarakterDetectiveConan DAN ShinichiKudo ADA DIFILE YANG BERBEDA/ DIBAWAH INI

//isi file java KarakterDetectiveConan
//class KarakterDetectiveConan {
//    void tampilInfo() {
//    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//  }
//  void peran() {
//      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//  }  
//}


//isi file ShinichiKudo
//public class ShinichiKudo extends KarakterDetectiveConan {
//  public ShinichiKudo(String shinichi_Kudo, int par, String kemampuan_deduksi_yang_tinggi) {
//  }
//  // Properti yang sudah ada
//  // Konstruktor
  // Implementasi metode abstrak dari interface KarakterDetectiveConan
//  public void tampilInfo() {
//      // Implementasi yang sesuai
//      System.out.println("Informasi tentang Shinichi Kudo");
//  }
//  // Implementasi metode abstrak dari interface KarakterDetectiveConan
//  public void peran() {
//      // Implementasi yang sesuai
//      System.out.println("Peran: Detektif SMA");
//  }
// }