class konversi {
  public static void main(String args[] ) {
    String str1 = "10000" ;
    String str2 = "5.6" ;
    int bulat = Integer.parseInt(str1);
    double pecahan = Double.parseDouble(str2);

    System.out.println("Hasil dari variabel str1 adalah " + str1);
    System.out.println("Hasil dari variabel str2 adalah " + str2);

    System.out.println("Hasil dari variabel str1 + str2 adalah " + str1 + str2);
    System.out.println();

    System.out.println("Hasil dari bulat " + bulat);
    System.out.println("Hasil dari pecahan " + pecahan);
    System.out.println("Hasil dari bulat + pecahan " + (bulat+pecahan));
  }
}
