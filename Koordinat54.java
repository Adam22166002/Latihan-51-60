
/**
 * @author 
 * Nama:ADAM
 * Nim :22166002
 * Prodi:sistem informasi
 * SALDO TARGET TABUNGAN
 */
//membuat superclass atau class utama
public class Koordinat54 {
  // Atributnya
  private String warna;

  // Atribut x dan y untuk menentukan nilai koordinat pada sumbu x dan y
  private int x;
  private int y;
  
  // Konstruktor untuk inisialisasi objek Koordinat
  public Koordinat54(String warna, int x, int y) {
    this.warna = warna;
    this.x = x;
    this.y = y;
  }

  // Metode getter untuk mendapatkan nilai warna
  public String getWarna() {
    return warna;
  }

  // Metode setter untuk mengubah nilai warna
  public void setWarna(String warna) {
    this.warna = warna;
  }

  // Metode getter untuk mendapatkan nilai sumbu x
  public int getX() {
    return x;
  }

  // Metode setter untuk mengubah nilai sumbu x
  public void setX(int x) {
    this.x = x;
  }

  // Metode getter untuk mendapatkan nilai sumbu y
  public int getY() {
    return y;
  }

  // Metode setter untuk mengubah nilai sumbu y
  public void setY(int y) {
    this.y = y;
  }

  // Metode toString untuk memberikan representasi string dari objek Koordinat
  @Override
  public String toString() {
    return "Koordinat{" +
        "warna='" + warna + '\'' +
        ", x=" + x +
        ", y=" + y +
        '}';
  }

  // Metode main untuk melakukan uji coba atau demonstrasi penggunaan kelas Koordinat
  public static void main(String[] args) {  
    // Membuat objek Koordinat dengan warna "Jingga", x = 10, y = 4
    Koordinat54 koordinat = new Koordinat54("Jingga", 10, 4);
    // Menampilkan informasi koordinat menggunakan metode getter
    System.out.println("Warna Koordinat: " + koordinat.getWarna());
    System.out.println("Koordinat Sumbu x: " + koordinat.getX());
    System.out.println("Koordinat Sumbu y: " + koordinat.getY());
  }
}
