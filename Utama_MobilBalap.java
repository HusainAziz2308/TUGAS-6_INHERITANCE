// Class Induk: Mobil Balap
class MobilBalap {
    int nomer, CC;
    String merk, tipe, tahun, tim;

    // Constructor untuk MobilBalap
    public MobilBalap(int nomer, String merk, String tipe, String tahun, String tim, int CC) {
        this.nomer = nomer;
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.tim = tim;
        this.CC = CC;
    }
}

// Subclass 1: GT3
class GT3 extends MobilBalap {
    // Constructor untuk Mobil
    public GT3(int nomer, String merk, String tipe, String tahun, String tim, int CC) {
        super(nomer, merk, tipe, tahun, tim, CC); // Memanggil constructor superclass
    }

    // Metode untuk menampilkan informasi mobil
    public void tampilkanInfoGT3() {
        System.out.println("GT3 " +this.nomer);
        System.out.println("============ Data Mobil GT3 ============");
        System.out.println("Merk    : " + this.merk);
        System.out.println("Tipe    : " + this.tipe);
        System.out.println("Tahun   : " + this.tahun);
        System.out.println("Tim     : " + this.tim);
        System.out.println("CC      : " + this.CC + " CC" +"\n");
    }
}

// Subclass 2: F1
class F1 extends MobilBalap {
    // Constructor untuk Mobil
    public F1(int nomer, String merk, String tipe, String tahun, String tim, int CC) {
        super(nomer, merk, tipe, tahun, tim, CC); // Memanggil constructor superclass
    }
    // Metode untuk menampilkan informasi F1
    public void tampilkanInfoF1() {
        System.out.println("F1 " +this.nomer);
        System.out.println("============ Data Mobil F1 ============");
        System.out.println("Merk mesin  : " + this.merk);
        System.out.println("Tim         : " + this.tim);
        System.out.println("Nama Mobil  : " + this.tipe);
        System.out.println("Tahun       : " + this.tahun);
        System.out.println("CC          : " + this.CC + " CC" +"\n");
    }
}

// Class Utama
public class Utama_MobilBalap {
    public static void main(String[] args) {
        // GT3
        GT3 gt31 = new GT3(1,"Porsche", "911(992) GT3 R", "2023", "Manthey", 4000);
        GT3 gt32 = new GT3(2, "BMW", "M4 GT3", "2022", "WRT", 3000);

        // F1
        F1 f1_1 = new F1(1, "Mercedes", "Mercedess w16", "2025", "Mercedes AMG Petronas", 1600);
        F1 f1_2 = new F1(2, "Ferrari", "Ferrari SF25", "2025", "Scuderia Ferrari", 1600);

        // Menampilkan informasi GT3
        gt31.tampilkanInfoGT3();
        gt32.tampilkanInfoGT3();

        // Menampilkan informasi F1
        f1_1.tampilkanInfoF1();
        f1_2.tampilkanInfoF1();
    }
}