import java.util.*;
public class perulangan {
  public static void main(String[] args) {
    Scanner emoh = new Scanner (System.in);
    int jumlahmhs = 1;
    int total = 0;
    while (jumlahmhs<4) {
      System.out.println("Nilai mahasiswa ke- " +jumlahmhs+" : ");
      int skor = Integer.parseInt(emoh.nextLine());
      if (skor<0) {
        do {
          System.out.println("Nilai Mahasiswa ke-" +jumlahmhs);
          skor = Integer.parseInt(emoh.nextLine());
        } while (skor<0);
      }
      total = total+skor;
      jumlahmhs++;
    }
    System.out.println("Nilai Total = "+total);
    double rata = total/3;
    System.out.println("Nilai rata rata ="+rata);
  }
}
