import java.io.*;

public class Kartumahas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input data mahasiswa
        System.out.print("Masukkan Nama: ");
        String nama = br.readLine();

        System.out.print("Masukkan NRP: ");
        String nrp = br.readLine();

        System.out.print("Masukkan Program Studi: ");
        String programStudi = br.readLine();

        System.out.print("Masukkan Departemen: ");
        String departemen = br.readLine();

        // Tampilkan kartu mahasiswa
        System.out.println("\n===== KARTU MAHASISWA =====");
        System.out.println("Nama           : " + nama);
        System.out.println("NRP            : " + nrp);
        System.out.println("Program Studi  : " + programStudi);
        System.out.println("Departemen       : " + departemen);
        System.out.println("===========================");
    }
}
