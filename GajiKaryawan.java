import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Nama: ");
        String nama = Input.nextLine();

        System.out.print("NIK: ");
        String nik = Input.nextLine();

        System.out.print("Umur: ");
        int umur = Input.nextInt();
        Input.nextLine(); 

        System.out.print("Alamat: ");
        String alamat = Input.nextLine();

        System.out.print("Jabatan (Dokter/Perawat/Apoteker/Cleaning Service): ");
        String jabatan = Input.nextLine();

        System.out.print("Jumlah Jam Kerja dalam 1 bulan: ");
        int jumlahJamKerja = Input.nextInt();

        int upahPerJam = 0;
        int gajiBulanan = 0;

        // Menentukan upah per jam berdasarkan jabatan
        switch (jabatan.toLowerCase()) {
            case "dokter":
                upahPerJam = 50000;
                break;
            case "perawat":
                upahPerJam = 25000;
                break;
            case "apoteker":
                upahPerJam = 20000;
                break;
            case "cleaning service":
                upahPerJam = 15000;
                break;
            default:
                System.out.println("Jabatan tidak dikenal.");
                return;
        }

        // Menghitung gaji bulanan
        if (jumlahJamKerja <= 40) {
            gajiBulanan = jumlahJamKerja * upahPerJam;
        } else {
            int jamLembur = jumlahJamKerja - 40;
            gajiBulanan = (40 * upahPerJam) + (jamLembur * 15000);
        }

        // Output hasil gaji karyawan
        System.out.println("=====================================");
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja + " jam");
        System.out.println("Gaji Bulanan: Rp " + gajiBulanan);
    }
}
