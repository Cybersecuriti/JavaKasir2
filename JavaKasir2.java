import java.util.Scanner;

// membuat program kasir sedrhana

public class Kasir {
  
   public static void main(String[] args){
     
      String nama_barang;
      String merek_barang;
      String kondisi_barang;
      int jumlah_barang,harga,totalharga;
      double diskon = 0.067;
      double totalbayar;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Nama Barang:");
      nama_barang = input.nextLine();
      System.out.print("Merek barang:");
      merek_barang = input.nextLine();
      System.out.print("Kondisi Barang:");
      kondisi_barang = input.nextLine();
      
      System.out.print("Jumlah Barang:");
      jumlah_barang = input.nextInt();
      if(jumlah_barang <=0){
        System.out.println("Mohon Masukkan jumlah yang valid dan ulang");
        System.exit(0);
      }
       System.out.print("Harga Barang");
       harga = input.nextInt();
       if(harga <150)
       {
         System.out.println("Mohon Masukan harga barang yang valid dan ulang");
         System.exit(0);
       }
        System.out.println("Anada mendapatkan diskon sbesar 6.7%");
        
        totalharga = jumlah_barang * harga;
        System.out.println("Total Harga : Rp" + totalharga);
        
        diskon = totalharga * diskon;
        totalbayar = totalharga - diskon;
        System.out.println("Total bayar : Rp" + totalbayar);
        System.out.println("Nama Barang : " + nama_barang);
        System.out.println("Merek Barang : " + merek_barang);
        System.out.println("Kondisi Barang : " + kondisi_barang);
        System.out.println("Total Harga : Rp" + harga);
        System.out.println("Total Bayar : Rp" + totalbayar);
        System.out.println("_____Terimah Kasih Telah Barkunjung_____");
   }
}