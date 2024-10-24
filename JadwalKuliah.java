public class JadwalKuliah {
  public static void main(String[] args) {
      String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
      
      System.out.println("-----Jadwal Perkuliahan-----");
      
      for (String h : hari) {
          if (h.equals("Sabtu") || h.equals("Minggu")) {
              System.out.println(h + ": Hari Libur");
          } else {
              System.out.println(h + ": Hari Aktif Kuliah");
          }
      }
  }
}
