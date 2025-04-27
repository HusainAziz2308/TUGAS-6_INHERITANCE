// Class Induk: GPU
class GPU {
    int id;
    String merk;
    String model;
    int memory; // GB
    String clockSpeed; // GHz

    // Constructor untuk GPU
    public GPU(int id, String merk, String model, int memory, String clockSpeed) {
        this.id = id;
        this.merk = merk;
        this.model = model;
        this.memory = memory;
        this.clockSpeed = clockSpeed;
    }

    // Method untuk menampilkan informasi GPU
    public void tampilkanInfoGPU() {
        System.out.println("GPU ID              : " + id);
        System.out.println("Merk                : " + merk);
        System.out.println("Model               : " + model);
        System.out.println("Memory              : " + memory + " GB");
        System.out.println("Clock Speed         : " + clockSpeed + " GHz");
    }
}

// Subclass 1: NvidiaGPU
class NvidiaGPU extends GPU {
    boolean rayTracing;
    String coolingSystem;

    // Constructor untuk NvidiaGPU
    public NvidiaGPU(int id, String merk, String model, int memory, String clockSpeed, boolean rayTracing, String coolingSystem) {
        super(id, merk, model, memory, clockSpeed);
        this.rayTracing = rayTracing;
        this.coolingSystem = coolingSystem;
    }

    // Method untuk menampilkan informasi NvidiaGPU
    public void tampilkanInfoNvidiaGPU() {
        tampilkanInfoGPU();
        System.out.println("Ray Tracing Support : " + (rayTracing ? "Yes" : "No"));
        System.out.println("Cooling System      : " + coolingSystem);
        System.out.println("=================================");
    }
}

// Subclass 2: AMD
class AMD extends GPU {
    String precision; // Contoh: FP32, FP64
    boolean virtualRealitySupport;

    // Constructor untuk AMD
    public AMD(int id, String merk, String model, int memory, String clockSpeed, String precision, boolean virtualRealitySupport) {
        super(id, merk, model, memory, clockSpeed);
        this.precision = precision;
        this.virtualRealitySupport = virtualRealitySupport;
    }

    // Method untuk menampilkan informasi AMD
    public void tampilkanInfoAMD() {
        tampilkanInfoGPU();
        System.out.println("Precision           : " + precision);
        System.out.println("VR Support          : " + (virtualRealitySupport ? "Yes" : "No"));
        System.out.println("=================================");
    }
}

// Class Utama
public class Utama_GPU {
    public static void main(String[] args) {
        // Objek NvidiaGPU
        NvidiaGPU gpuNvidia1 = new NvidiaGPU(1, "NVIDIA", "RTX 4090", 24, "2.5", true, "Liquid Cooling");
        NvidiaGPU gpuNvidia2 = new NvidiaGPU(2, "NVIDIA", "RTX 3080", 10, "1.8", true, "Air Cooling");

        // Objek AMD
        AMD gpuAMD1 = new AMD(3, "AMD", "Radeon RX 7900 XT", 20, "2.2", "FP64", true);
        AMD gpuAMD2 = new AMD(4, "AMD", "Radeon RX 6700 XT", 12, "2.0", "FP32", false);

        // Menampilkan informasi NvidiaGPU
        System.out.println("===== Nvidia GPU =====");
        gpuNvidia1.tampilkanInfoNvidiaGPU();
        gpuNvidia2.tampilkanInfoNvidiaGPU();

        // Menampilkan informasi AMD
        System.out.println("===== AMD GPU =====");
        gpuAMD1.tampilkanInfoAMD();
        gpuAMD2.tampilkanInfoAMD();
    }
}
