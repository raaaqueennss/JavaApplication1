
package javacosole;
import java.util.Scanner;
public class Tugas2NO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double jariJariLingkaran, jariJariBola, jariJariKerucut, tinggiKerucut;

        System.out.print("Masukkan jari-jari lingkaran\t: ");
        jariJariLingkaran = scanner.nextDouble();

        System.out.print("Masukkan jari-jari bola     \t: ");
        jariJariBola = scanner.nextDouble();

        System.out.print("Masukkan jari-jari kerucut  \t: ");
        jariJariKerucut = scanner.nextDouble();

        System.out.print("Masukkan tinggi kerucut     \t: ");
        tinggiKerucut = scanner.nextDouble();

        LuasLingkaran lingkaran = new LuasLingkaran(jariJariLingkaran);
        Bola bola = new Bola(jariJariBola);
        Kerucut kerucut = new Kerucut(jariJariKerucut, tinggiKerucut);

        double luasLingkaran = lingkaran.hitungLuas();
        double volumeBola = bola.hitungVolume();
        double volumeKerucut = kerucut.hitungVolume();

        System.out.println("Luas Lingkaran\t: " + luasLingkaran);
        System.out.println("Volume Bola   \t: " + volumeBola);
        System.out.println("Volume Kerucut\t: " + volumeKerucut);

        scanner.close();
    }
}
    
