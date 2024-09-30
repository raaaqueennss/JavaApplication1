
package javacosole.latihan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        mahasiswa[] mahasiswas = new mahasiswa[3];
        
        for (int i = 0; i < mahasiswas.length; i++) {
            System.out.println("Data Mahasiswa " + (i+1));
            
            System.out.print("NIM: ");
            String nim = scanner.next();
            
            System.out.print("Nama Mahasiswa: ");
            String nama = scanner.next();
            
            System.out.print("Nilai Tugas: ");
            float nilaiTugas = scanner.nextFloat();
            
            System.out.print("Nilai MID: ");
            float mid = scanner.nextFloat();
            
            System.out.print("Nilai Semester: ");
            float nilaiSemester = scanner.nextFloat();
            
            mahasiswas[i] = new mahasiswa(nim, nama, nilaiTugas, mid, nilaiSemester);
            System.out.println();
        }
        
        scanner.close();
        
        for (int i = 0; i < mahasiswas.length; i++) {
            System.out.println("Data Mahasiswa " + (i + 1));
            System.out.println("NIM: " + mahasiswas[i].getNim());
            System.out.println("Nama Mahasiswa: " + mahasiswas[i].getNama());
            System.out.println("Nilai Akhir: " + mahasiswas[i].getNilaiAkhir());
            System.out.println("Nilai Huruf: " + mahasiswas[i].getNilaiHuruf());
            System.out.println();
        }
    }
}

   
