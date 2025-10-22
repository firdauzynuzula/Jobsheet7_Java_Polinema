import java.util.Scanner;

public class SiakadWhile11 {

    public static void main(String[] args) {

        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        while (i < jumlahMahasiswa) {
            i++;
            double nilai, terendah = 100, tertinggi = 0;
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
            
            System.out.println("nilai tertinggi saat ini: " + tertinggi);
            System.out.println("nilai terendah saat ini: " + terendah);
        }
    }
}