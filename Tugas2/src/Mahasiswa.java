import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mahasiswa {
    private static Map<String, String> dataMhs = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opsi;
        
        do {
            System.out.println("Sistem Informasi Mahasiswa");
            System.out.println("1. Create Mahasiswa");
            System.out.println("2. Show Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Delete Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Opsi yang dipilih: ");
            opsi = scanner.nextInt();
            scanner.nextLine(); 

            switch (opsi) {
                case 1:
                    createMahasiswa();
                    break;
                case 2:
                    readMahasiswa();
                    break;
                case 3:
                    updateMahasiswa();
                    break;
                case 4:
                    deleteMahasiswa();
                    break;
                case 5:
                    System.out.println("Anda telah keluar dari program. Terima kasih.");
                    break;
                default:
                    System.out.println("Opsi tidak tersedia.");
            }
        } while (opsi != 5);
    }

    private static void createMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        if (dataMhs.containsKey(nim)) {
            System.out.println("NIM telah terdaftar.");
        } else {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            dataMhs.put(nim, nama);
            System.out.println("Mahasiswa telah ditambahkan.");
        }
    }

    private static void readMahasiswa() {
        if (dataMhs.isEmpty()) {
            System.out.println("Data mahasiswa tidak ditemukan.");
        } else {
            System.out.println("Daftar Mahasiswa");
            for (Map.Entry<String, String> entry : dataMhs.entrySet()) {
                System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }

    private static void updateMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yg ingin diupdate: ");
        String nim = scanner.nextLine();

        if (dataMhs.containsKey(nim)) {
            System.out.print("Masukkan Nama baru: ");
            String namaBaru = scanner.nextLine();
            dataMhs.put(nim, namaBaru);
            System.out.println("Data mahasiswa berhasil diupdate.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    private static void deleteMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yg ingin dihapus: ");
        String nim = scanner.nextLine();

        if (dataMhs.containsKey(nim)) {
            dataMhs.remove(nim);
            System.out.println("Mahasiswa telah dikeluarkan.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }
}