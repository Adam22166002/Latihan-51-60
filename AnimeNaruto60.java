/**
 * @author 
 * Nama:ADAM
 * Nim :22166002
 * Prodi:sistem informasi
 * SALDO TARGET TABUNGAN
 */

//membuat class utama atau superclass
public class AnimeNaruto60 extends KarakterAkatsuki {
    private String nama;
    private int usia;
    private String organisasi;

    // Menambahkan konstruktor untuk kelas AnimeNaruto60
    public AnimeNaruto60(String nama, int usia, String organisasi) {
        this.nama = nama;
        this.usia = usia;
        this.organisasi = organisasi;
    }

    // Implementasi metode abstrak dari interface KarakterAkatsuki
    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Organisasi: " + organisasi);
    }

    // Implementasi metode abstrak dari interface KarakterAkatsuki
    public void peran() {
        System.out.println("Peran: Pengguna Edotensei");
    }
    public void usia() {
        System.out.println("Usia: " + usia + " tahun");
    }
 // Metode utama untuk pengujian fungsionalitas kelas AnimeNaruto60, karakterakatsuki, dan uchiha itachi
    public static void main(String[] args) {
        // Membuat objek karakter akatsuki dan Uchiha ITACHI
        AnimeNaruto60 orochimaru = new AnimeNaruto60("Orochimaru", 55, "AKATSUKI");
        // ... (lanjutkan dengan objek UchihaItachi dan pemanggilan metode)
        UchihaItachi uchihaItachi = new UchihaItachi("UCHIHA ITACHI","Kemampuan Mata Sharingan");

        // Polimorfisme, mengakses informasi karakter melalui interface KarakterAkatsuki
        AnimeNaruto60 karakter1 = orochimaru;  // Menggunakan variabel orochimaru yang sudah dideklarasikan
        UchihaItachi karakter2 = uchihaItachi;

        // Menampilkan informasi dan peran dari setiap karakter
        karakter1.tampilInfo();
        karakter1.peran();
        karakter2.tampilInfo();
        karakter2.peran();
    }
}
//PEMBUTATAN SUBCLASS KARAKTERAKATSUKI DAN UCHIHAITACHI ADA DIFILE BERBEDA/ dibawah ini

//isi file KarakterAkatsuki
//class KarakterAkatsuki {
//  void tampilInfo() {
//      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//  }
//  void peran() {
//      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//  }
// }

//isi file UchihaItachi
// public class UchihaItachi extends KarakterAkatsuki {
//  public UchihaItachi(String uchiha_Itachi, String kemampuan) {
//  }
    // Properti yang sudah ada
    // Konstruktor
    // Implementasi metode abstrak dari interface KarakterAkatsuki
//  public void tampilInfo() {
        // Implementasi yang sesuai
//      System.out.println("Informasi tentang Uchiha ITACHI");
//  }
    // Implementasi metode abstrak dari interface KarakterAkatsuki
//  public void peran() {
        // Implementasi yang sesuai
//      System.out.println("Peran: Pengguna Genjutsu");
//  }
// }