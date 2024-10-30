import java.util.ArrayList;
import java.util.Scanner;

public class sesudah {
    private ArrayList<Double> incomes = new ArrayList<>();
    private ArrayList<Double> expenses = new ArrayList<>();
    private double balance = 0;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersonalFinanceRefactored app = new PersonalFinanceRefactored();
        app.run();
    }

    private void run() {
        boolean isRunning = true;

        while (isRunning) {
            displayMenu();
            int choice = getUserInput("Pilihan: ");
            isRunning = handleMenuChoice(choice);
        }
    }

    private void displayMenu() {
        System.out.println("\n1. Tambah Pendapatan");
        System.out.println("2. Tambah Pengeluaran");
        System.out.println("3. Lihat Saldo");
        System.out.println("4. Keluar");
    }

    private int getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private boolean handleMenuChoice(int choice) {
        switch (choice) {
            case 1 -> addIncome();
            case 2 -> addExpense();
            case 3 -> showBalance();
            case 4 -> {
                System.out.println("Program selesai.");
                return false;
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
        return true;
    }

    private void addIncome() {
        double income = getUserInput("Jumlah Pendapatan: ");
        balance += income;
        incomes.add(income);
    }

    private void addExpense() {
        double expense = getUserInput("Jumlah Pengeluaran: ");
        balance -= expense;
        expenses.add(expense);
    }

    private void showBalance() {
        System.out.println("Saldo Anda: " + balance);
    }
}
