import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.println("\nOutput:");
        System.out.print("Nama Mahasiswa: ");
        System.out.println(nama);
        System.out.print("NIM: ");
        System.out.println(nim);

        scanner.close();
    }
}