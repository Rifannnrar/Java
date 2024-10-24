import java.io.*;

class Buffered {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Masukkan Nama Anda: ");
    String nama = br.readLine();
    System.out.println("Nama Saya adalah: " + nama);
  }
}
