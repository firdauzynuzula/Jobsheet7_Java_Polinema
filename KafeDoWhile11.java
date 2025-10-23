public class KafeDoWhile11 {
    public static void main(String[] args) {
        int i = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Masukkan jumlah kopi yang ingin dipesan: ");
        int jumlahKopi = scanner.nextInt();

        do {
            System.out.print("Masukkan jenis kopi ke-" + (i + 1) + ": ");
            String jenisKopi = scanner.next();

            System.out.print("Masukkan ukuran kopi ke-" + (i + 1) + " (S/M/L): ");
            String ukuranKopi = scanner.next();

            System.out.print("Masukkan jumlah gula untuk kopi ke-" + (i + 1) + ": ");
            int jumlahGula = scanner.nextInt();

            System.out.println("Pesanan kopi ke-" + (i + 1) + ": " + jenisKopi + ", Ukuran: " + ukuranKopi + ", Gula: " + jumlahGula + " sendok");
            i++;
        } while (i < jumlahKopi);

        scanner.close();
    }
}
