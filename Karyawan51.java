package karyawan;
/**
 * @author
 * NAMA: ADAM
 * NIM: 22166002
 * PRODI: SISTEM INFORMASI
 * MATAKULIAH: PBO
 */
import java.util.Scanner;
//membuat class karyawan
class Karyawan {
    //atributnya
    private String NIK;
    private String Nama;
    private String Jabatan;
    private int Golongan;

    public String getNik() {
        return NIK;
    }

    public void setNik(String nik) {
        this.NIK = nik;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String jabatan) {
        this.Jabatan = jabatan;
    }

    public int getGolongan() {
        return Golongan;
    }

    public void setGolongan(int golongan) {
        this.Golongan = golongan;
    }
}
//membuat subclas manager
class Manager extends Karyawan { // extends keyword dari inheritance
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        return hadir * 10000;
    }

    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equalsIgnoreCase("Manager")) {
            return 2000000;
        } else if (jabatan.equalsIgnoreCase("Kabag")) {
            return 1000000;
        } else {
            return 0;
        }
    }

    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
            case 1:
                return 500000;
            case 2:
                return 1000000;
            case 3:
                return 1500000;
            default:
                return 0;
        }
    }
 //Menghitung total gaji karyawan berdasarkan tunjangan kehadiran, tunjangan jabatan,dan tunjangan golongan.
    public float gajiTotal() { //tipe data float
        tunjanganKehadiran = tunjanganKehadiran(kehadiran);
        tunjanganJabatan = tunjanganJabatan(getJabatan());
        tunjanganGolongan = tunjanganGolongan(getGolongan());

        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
        //return Total gaji karyawan yang terdiri dari tunjangan kehadiran, tunjangan jabatan,dan tunjangan golongan.
    }
}
//membuat superclass/ class utama
public class Karyawan51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("===== Program Perhitungan Gaji Karyawan =====");
        System.out.println();
        
        System.out.println("Masukkan NIK:");
        String nik = scanner.nextLine();
        
        System.out.println("Masukkan Nama:");
        String nama = scanner.nextLine();

        System.out.println("Masukkan Golongan (1/2/3):");
        int golongan = scanner.nextInt();

        System.out.println("Masukkan Jabatan (Manager/Kabag):");
        scanner.nextLine(); // Consume the newline character
        String jabatan = scanner.nextLine();

        System.out.println("Masukkan Jumlah Kehadiran:");
        int kehadiran = scanner.nextInt();
        System.out.println();

        Manager manager = new Manager();
        manager.setNik(nik);
        manager.setNama(nama);
        manager.setGolongan(golongan);
        manager.setJabatan(jabatan);
        manager.setKehadiran(kehadiran);

        System.out.println("===== Hasil Perhitungan =====");
        System.out.println("NIK: " + manager.getNik());
        System.out.println("Nama: " + manager.getNama());
        System.out.println("Golongan: " + manager.getGolongan());
        System.out.println("Jabatan: " + manager.getJabatan());
        System.out.println();

        System.out.println("Tunjangan Golongan: " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("Tunjangan Jabatan: " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("Tunjangan Kehadiran: " + manager.tunjanganKehadiran(manager.getKehadiran()));

        System.out.println("Gaji Total: " + manager.gajiTotal());
    }
}