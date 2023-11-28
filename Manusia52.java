package manusia;
/**
 * @author
 * NAMA: ADAM
 * NIM: 22166002
 * PRODI: SISTEM INFORMASI
 * MATAKULIAH: PBO
 */
public class Manusia52 { //class utama atau superclass
    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void siapaKamu() {
        System.out.println("Saya Manusia Abadi");
    }
    class Dosen extends Manusia52 { //subclass yaitu dosen
        private String nip;
        private String mataKuliah;

        public String getNip() {
            return nip;
        }
        public void setNip(String nip) {
            this.nip = nip;
        }
        public String getMataKuliah() {
            return mataKuliah;
        }
        public void setMataKuliah(String mataKuliah) {
            this.mataKuliah = mataKuliah;
        }
        public void mengajarApa() {
            System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar matakuliah " + mataKuliah);
        }
    }
    class Mahasiswa extends Manusia52 {
        private String kelas;
        private String nim;
        
        public String getNim() {
            return nim;
        }
        public void setNim(String nim){
            this.nim = nim;
        }
        public String getKelas() {
            return kelas;
        }
        public void setKelas(String kelas) {
            this.kelas = kelas;
        }
        public void kelasApa() { // method yang kita panggil
            System.out.println("Saya kelas " + kelas); 
        }
        @Override
        public void siapaKamu() { //method ini yang akan dipanggil 
            System.out.println("Saya " + nama + " dengan nim " + nim);
        }
    }
    public static void main(String[] args) {
        Manusia52.Dosen dosen = new Manusia52().new Dosen();
        dosen.setNama("Rizki");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();

        Manusia52.Mahasiswa mahasiswa = new Manusia52().new Mahasiswa();
        mahasiswa.setNama("Adam");
        mahasiswa.setNim("22166002");
        mahasiswa.setKelas("PBO16-K Sistem Informasi");
        mahasiswa.siapaKamu(); //kita memanggil  method siapaKamu bukan method kelasApa
        mahasiswa.kelasApa(); //memanggil method kelasApa
    }
}
