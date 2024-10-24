import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

  public class fungsi {
  private static int a, b, c;
  public static void main(String[] args) {
    try {
    BufferedReader br = new BufferedReader(new
  InputStreamReader(System.in));
    System.out.print("Masukkan bilangan pertama : ");
      a = Integer.parseInt(br.readLine());
    System.out.print("Masukkan bilangan kedua : ");
      b = Integer.parseInt(br.readLine());
      c = tambah();
    System.out.println("Hasil Penjumlahan : " + c);
      c = kurang();
    System.out.println("Hasil Pengurangan : " + c);
  } catch (Exception e) {
    System.out.println("Input harus berupa angka");
  }
}
    private static int tambah() {
      return (a + b);
    }
    private static int kurang() {
      return (a - b);
  }
}