import java.util.Scanner;

public class TabunganBebek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan : ");
        double jumlahTabungan = scanner.nextDouble();

        double[] interestRates = {0.04, 0.05, 0.06, 0.07};

        System.out.println("Tahun\t\t4%\t\t5%\t\t6%\t\t7%");
        System.out.println("==================================================================================");

        for (int year = 1; year <= 10; year++) {
            System.out.print("Tahun ke-" + year + "\t= ");
            for (double rate : interestRates) {
                double amount = jumlahTabungan * Math.pow(1 + rate, year);
                System.out.printf("%.1f\t\t", amount);
            }
            System.out.println();
        }
    }
}
