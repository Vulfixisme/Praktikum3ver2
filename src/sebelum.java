import java.util.ArrayList;
import java.util.Scanner;

public class sebelum {
    static ArrayList<Double> pendapatan = new ArrayList<>();
    static ArrayList<Double> pengeluaran = new ArrayList<>();
    static double saldo = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Tambah Pendapatan");
            System.out.println("2. Tambah Pengeluaran");
            System.out.println("3. Lihat Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Jumlah Pendapatan: ");
                    double income = scanner.nextDouble();
                    saldo += income;
                    pendapatan.add(income);
                    break;
                case 2:
                    System.out.print("Jumlah Pengeluaran: ");
                    double expense = scanner.nextDouble();
                    saldo -= expense;
                    pengeluaran.add(expense);
                    break;
                case 3:
                    System.out.println("Saldo Anda: " + saldo);
                    break;
                case 4:
                    running = false;
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
