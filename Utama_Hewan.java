// Class Induk: Hewan
class Hewan {
    int id;
    String nama;
    String habitat;
    String jenisKelamin;

    // Constructor untuk Hewan
    public Hewan(int id, String nama, String habitat, String jenisKelamin) {
        this.id = id;
        this.nama = nama;
        this.habitat = habitat;
        this.jenisKelamin = jenisKelamin;
    }

    // Method untuk menampilkan informasi Hewan
    public void tampilkanInfoHewan() {
        System.out.println("ID Hewan        : " + id);
        System.out.println("Nama            : " + nama);
        System.out.println("Habitat         : " + habitat);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
    }
}

// Subclass 1: Herbivora
class Herbivora extends Hewan {
    String makananUtama;
    boolean gigiPengunyah;

    // Constructor untuk Herbivora
    public Herbivora(int id, String nama, String habitat, String jenisKelamin, String makananUtama, boolean gigiPengunyah) {
        super(id, nama, habitat, jenisKelamin);
        this.makananUtama = makananUtama;
        this.gigiPengunyah = gigiPengunyah;
    }

    // Method untuk menampilkan informasi Herbivora
    public void tampilkanInfoHerbivora() {
        tampilkanInfoHewan();
        System.out.println("Makanan Utama   : " + makananUtama);
        System.out.println("Gigi Pengunyah  : " + (gigiPengunyah ? "Ya" : "Tidak"));
        System.out.println("=================================");
    }
}

// Subclass 2: Karnivora
class Karnivora extends Hewan {
    String jenisTaring;
    boolean predator;

    // Constructor untuk Karnivora
    public Karnivora(int id, String nama, String habitat, String jenisKelamin, String jenisTaring, boolean predator) {
        super(id, nama, habitat, jenisKelamin);
        this.jenisTaring = jenisTaring;
        this.predator = predator;
    }

    // Method untuk menampilkan informasi Karnivora
    public void tampilkanInfoKarnivora() {
        tampilkanInfoHewan();
        System.out.println("Jenis Taring    : " + jenisTaring);
        System.out.println("Predator        : " + (predator ? "Ya" : "Tidak"));
        System.out.println("=================================");
    }
}

// Subclass 3: Omnivora
class Omnivora extends Hewan {
    String polaMakan;
    boolean adaptif;

    // Constructor untuk Omnivora
    public Omnivora(int id, String nama, String habitat, String jenisKelamin, String polaMakan, boolean adaptif) {
        super(id, nama, habitat, jenisKelamin);
        this.polaMakan = polaMakan;
        this.adaptif = adaptif;
    }

    // Method untuk menampilkan informasi Omnivora
    public void tampilkanInfoOmnivora() {
        tampilkanInfoHewan();
        System.out.println("Pola Makan      : " + polaMakan);
        System.out.println("Adaptif         : " + (adaptif ? "Ya" : "Tidak"));
        System.out.println("=================================");
    }
}

// Class Utama
public class Utama_Hewan {
    public static void main(String[] args) {
        // Objek Herbivora
        Herbivora herbivora1 = new Herbivora(1, "Kambing", "Padang Rumput", "Betina", "Rumput", true);
        Herbivora herbivora2 = new Herbivora(2, "Sapi", "Peternakan", "Jantan", "Jerami", true);

        // Objek Karnivora
        Karnivora karnivora1 = new Karnivora(3, "Harimau", "Hutan", "Jantan", "Taring Panjang", true);
        Karnivora karnivora2 = new Karnivora(4, "Serigala", "Pegunungan", "Betina", "Taring Tajam", true);

        // Objek Omnivora
        Omnivora omnivora1 = new Omnivora(5, "Beruang", "Hutan", "Jantan", "Segala Jenis", true);
        Omnivora omnivora2 = new Omnivora(6, "Ayam", "Kandang", "Betina", "Campuran", true);

        // Menampilkan informasi Herbivora
        System.out.println("===== Herbivora =====");
        herbivora1.tampilkanInfoHerbivora();
        herbivora2.tampilkanInfoHerbivora();

        // Menampilkan informasi Karnivora
        System.out.println("===== Karnivora =====");
        karnivora1.tampilkanInfoKarnivora();
        karnivora2.tampilkanInfoKarnivora();

        // Menampilkan informasi Omnivora
        System.out.println("===== Omnivora =====");
        omnivora1.tampilkanInfoOmnivora();
        omnivora2.tampilkanInfoOmnivora();
    }
}
