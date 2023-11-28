package barangantik;
/**
 * @author
 * NAMA: ADAM
 * NIM: 22166002
 * PRODI: SISTEM INFORMASI
 * MATAKULIAH: PBO
 */
public class BarangAntik56 { //superclass barang antik
    private int umur;
    
    public BarangAntik56(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public class Radio extends BarangAntik56 { //subclass radio
        private String name;

        public Radio(int umur, String name) {
            super(umur); //super digunakan untuk mengakses parent class/class induk pak.
            this.name = name;
        }

        public String getNama() {
            return name;
        }

        public void tampilUmur() { //method yang kita akan panggil
            System.out.println("Nama barang antik: " + getNama());
            System.out.println("Umur barang antik ini adalah: " + getUmur() + " tahun");
        }
    }

    public static void main(String[] args) { //disini masih bingung pak
        BarangAntik56 barang = new BarangAntik56(234);
        BarangAntik56.Radio radio = barang.new Radio(234, "Radio antik men"); 
        radio.tampilUmur();
    }
}