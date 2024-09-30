
package javacosole.tgs;
import java.util.Scanner;
public class TGS2NO2 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama marketing: ");
        String namaMarketing = input.nextLine();
        System.out.print("Masukkan total penjualan marketing: ");
        double penjualanMarketing = input.nextDouble();

        System.out.print("Masukkan nama kasir: ");
        input.nextLine();
        String namaKasir = input.nextLine();
        System.out.print("Masukkan jam kerja lembur kasir: ");
        int jamLemburKasir = input.nextInt();
        Marketing Marketing = new Marketing(namaMarketing, 500000, penjualanMarketing);
          int jamLembur = 0;
        kasir kasir = new kasir(namaKasir, 500000, jamLembur);

        double totalGajiMarketing = Marketing.hitungGaji();
        double totalGajiKasir = kasir.hitungGaji();

        System.out.println("Total gaji marketing: Rp. " + totalGajiMarketing);
        System.out.println("Total gaji kasir: Rp. " + totalGajiKasir);
    }
    
}
    
