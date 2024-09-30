
package javacosole.latihan;
import java.util.Scanner;
public class mahasiswa {
    private String nim;
    private String nama;
    private float nilaiTugas;
    private float mid;
    private float nilaiSemester;
    private float nilaiAkhir;
    private String nilaiHuruf;
    
    // Constructor
    public mahasiswa(String nim, String nama, float nilaiTugas, float mid, float nilaiSemester) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.mid = mid;
        this.nilaiSemester = nilaiSemester;
    }
    
    // Methods
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public float getNilaiAkhir() {
        return nilaiAkhir;
    }
    
    public String getNilaiHuruf() {
        return nilaiHuruf;
    }
    
    public void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 30 / 100) + (mid * 30 / 100) + (nilaiSemester * 40 / 100);
        
        if (nilaiAkhir >= 0 && nilaiAkhir <= 100) {
            if (nilaiAkhir >= 86) {
                nilaiHuruf = "A";
            }else if (nilaiAkhir >= 81) {
                nilaiHuruf = "A-";
            }else if (nilaiAkhir >= 76) {
                nilaiHuruf = "B+";
            }else if (nilaiAkhir >=71 ) {
                nilaiHuruf = "B";
            }else if (nilaiAkhir >= 66) {
                nilaiHuruf = "B-";
            }else if (nilaiAkhir >= 61) {
                nilaiHuruf = "C+";
            }else if (nilaiAkhir >= 56) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 41) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
        } else {
            nilaiHuruf = "Nilai Invalid";
        }
    }
}

    
