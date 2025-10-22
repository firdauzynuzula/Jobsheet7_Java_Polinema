import java.util.Scanner;

public class SiakadFor11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nilai, terendah = 100, tertinggi = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai < 60) {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus.");
            } else {
                System.out.println("Mahasiswa ke-" + i + " lulus.");
            }
        }
        System.out.println("nilai tertinggi saat ini: " + tertinggi);
        System.out.println("nilai terendah saat ini: " + terendah);
        
        scanner.close();
    }
}