/**
 * @author 
 * Nama:ADAM
 * Nim :22166002
 * Prodi:sistem informasi
 * SALDO TARGET TABUNGAN
 */

public class Animal53 {
    // class Animal sebagai kelas utama 
    public static class Animal {
        private boolean vegetarian;  // hewan vegetarian
        private String eats;         // Jenis makanan
        private int noOfLegs;        // Jumlah kaki

        // Konstruktor untuk inisialisasi 
        public Animal(boolean vegetarian, String eats, int noOfLegs) {
            this.vegetarian = vegetarian;
            this.eats = eats;
            this.noOfLegs = noOfLegs;
        }

        // Metode getter untuk mendapatkan informasi atribut hewan
        public boolean isVegetarian() {
            return vegetarian;
        }

        public String getEats() {
            return eats;
        }

        public int getNoOfLegs() {
            return noOfLegs;
        }
    }

    // Class Rabbit sebagai subclass dari Animal
    public static class Rabbit extends Animal {
        private String name;  // Nama kelinci
        private String color; // Warna kelinci

        // Konstruktor untuk inisialisasi atribut-atribut kelinci dan atribut dari superclass Animal
        public Rabbit(String name, boolean vegetarian, String eats, int noOfLegs, String color) {
            super(vegetarian, eats, noOfLegs);
            this.name = name;
            this.color = color;
        }

        // Metode getter untuk mendapatkan informasi atribut kelinci
        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }
    }

    // Metode utama untuk pengujian fungsionalitas kelas Animal dan Rabbit
    public static void main(String[] args) {
        // Menampilkan informasi tentang kelinci "Peter"
        Rabbit peter = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is Peter");
        System.out.println("Peter is Vegetarian? " + peter.isVegetarian());
        System.out.println("Peter eats " + peter.getEats());
        System.out.println("Peter has " + peter.getNoOfLegs() + " legs");
        System.out.println("Peter color is " + peter.getColor());
    }
}
