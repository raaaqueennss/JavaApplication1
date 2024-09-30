
package javaapplication1;
public class Mahasiswa {
    private final String nim;
    private final String nama;
    private final float nilaiTugas;
    private final float mid;
    private final float nilaiSemester;
    private final float nilaiAkhir;
    private final String nilaiHuruf;

    public Mahasiswa(String nim, String nama, float nilaiTugas, float mid, float nilaiSemester) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.mid = mid;
        this.nilaiSemester = nilaiSemester;

        this.nilaiAkhir = (nilaiTugas * 30 / 100) + (mid * 30 / 100) + (nilaiSemester * 40 / 100);

        if (this.nilaiAkhir >= 0 && this.nilaiAkhir <= 100) {
            if (this.nilaiAkhir >= 86) {
                this.nilaiHuruf = "A";
            } else if (this.nilaiAkhir >= 81) {
                this.nilaiHuruf = "A-";
            } else if (this.nilaiAkhir >= 76) {
                this.nilaiHuruf = "B+";
            } else if (this.nilaiAkhir >= 71) {
                this.nilaiHuruf = "B";
            } else if (this.nilaiAkhir >= 66) {
                this.nilaiHuruf = "B-";
            } else if (this.nilaiAkhir >= 61) {
                this.nilaiHuruf = "C+";
            } else if (this.nilaiAkhir >= 56) {
                this.nilaiHuruf = "C";
            } else if (this.nilaiAkhir >= 41) {
                this.nilaiHuruf = "D";
            } else {
                this.nilaiHuruf = "E";
            }
        } else {
            this.nilaiHuruf = "Nilai Akhir di luar rentang 0-100. Program berhenti.";
            System.exit(0); // Menghentikan program jika nilai di luar rentang
        }
    }

    public void cetakDataMahasiswa() {
        System.out.println("Data Nilai Ujian Algoritma dan Pemrograman");
        System.out.println("-----------------------------------------");
        System.out.println("NIM            : " + nim);
        System.out.println("NAMA MHS       : " + nama);
        System.out.println("NILAI TUGAS    : " + nilaiTugas);
        System.out.println("NILAI MID      : " + mid);
        System.out.println("NILAI SEMESTER : " + nilaiSemester);
        System.out.println("NILAI AKHIR    : " + nilaiAkhir);
        System.out.println("NILAI HURUF    : " + nilaiHuruf);
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        
        Mahasiswa mahasiswa = new Mahasiswa("222061","rani" , 86.5f,81.0f, 90.0f);
        mahasiswa.cetakDataMahasiswa();
    }
}
