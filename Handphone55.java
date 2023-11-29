/**
 * @author 
 * Nama:ADAM
 * Nim :22166002
 * Prodi:sistem informasi
 * SALDO TARGET TABUNGAN
 */

// Class abstrak sebagai superclass yaitu Handphone55
public abstract class Handphone55 { 
    //Atributnya
  protected String manufacture;       
  protected String operatingSystem;   
  protected String model;             
  protected int harga;                 
  
  // Konstruktor untuk inisialisasi atribut-atribut handphone
  public Handphone55(String manufacture, String operatingSystem, String model, int harga) {
    this.manufacture = manufacture;
    this.operatingSystem = operatingSystem;
    this.model = model;
    this.harga = harga;
  }

  // Metode abstrak untuk menampilkan informasi produk handphone
  public abstract void displayProduct();
}

// Membuat Subclass BlackBerry
class BlackBerry extends Handphone55 {
  private String pinBB;  // PIN BlackBerry

  // Konstruktor untuk inisialisasi atribut-atribut handphone BlackBerry
  public BlackBerry(String manufacture, String operatingSystem, String model, int harga, String pinBB) {
    super(manufacture, operatingSystem, model, harga);
    this.pinBB = pinBB;
  }

  // Metode displayProduct() untuk menampilkan informasi produk handphone BlackBerry
  @Override
  public void displayProduct() {
    System.out.println("Handphone BlackBerry");
    System.out.println("Manufaktur: " + manufacture);
    System.out.println("Sistem Operasi: " + operatingSystem);
    System.out.println("Model: " + model);
    System.out.println("Harga: " + harga);
    System.out.println("PIN BB: " + pinBB);
  }
}

// Membuat Subclass Android
class Android extends Handphone55 {
  private String keyStore;  // Keystore handphone Android

  // Konstruktor untuk inisialisasi atribut-atribut handphone Android
  public Android(String manufacture, String operatingSystem, String model, int harga, String keyStore) {
    super(manufacture, operatingSystem, model, harga);
    this.keyStore = keyStore;
  }

  // Metode displayProduct() untuk menampilkan informasi produk handphone Android
  @Override
  public void displayProduct() {
    System.out.println("Handphone Android");
    System.out.println("Manufaktur: " + manufacture);
    System.out.println("Sistem Operasi: " + operatingSystem);
    System.out.println("Model: " + model);
    System.out.println("Harga: " + harga);
    System.out.println("Keystore: " + keyStore);
  }
}

// Membuat Subclass WindowsPhone 
class WindowsPhone extends Handphone55 {
  private String wpKeyStore;  // Atributnya

  // Konstruktor untuk inisialisasi atribut-atribut handphone Windows Phone
  public WindowsPhone(String manufacture, String operatingSystem, String model, int harga, String wpKeyStore) {
    super(manufacture, operatingSystem, model, harga);
    this.wpKeyStore = wpKeyStore;
  }

  // Metode displayProduct() untuk menampilkan informasi produk handphone Windows Phone
  @Override
  public void displayProduct() {
    System.out.println("Handphone Windows Phone");
    System.out.println("Manufaktur: " + super.manufacture);
    System.out.println("Sistem Operasi: " + super.operatingSystem);
    System.out.println("Model: " + super.model);
    System.out.println("Harga: " + super.harga);
    System.out.println("Keystore Windows Phone: " + wpKeyStore);
  }
  
  // Metode utama untuk diuji hasilnya
public static void main(String[] args) {
    //// Menampilkan informasi produk dari setiap handphone
    BlackBerry blackberry = new BlackBerry("RIM", "BlackBerry OS", "Bold 9900", 3_000_000, "123456");
    Android android = new Android("Google", "Android", "Pixel 6", 7_000_000, "abcd1234");
    WindowsPhone windowsPhone = new WindowsPhone("Microsoft", "Windows Phone 10", "Lumia 950 XL", 5_000_000, "qwerty123");
    blackberry.displayProduct();
    android.displayProduct();
    windowsPhone.displayProduct();
  }
}