
package javacosole.tgs;
public class kasir extends karyawan {
     private final int jamKerjaLembur;

    public kasir(String nama, double gajiPokok, int jamKerjaLembur) {
        super(nama, gajiPokok);
        this.jamKerjaLembur = jamKerjaLembur;
    }

    @Override
    public double hitungGaji() {
        double gajiLembur = 0;
        if (jamKerjaLembur > 8) {
            gajiLembur = (jamKerjaLembur - 8) * 30000;
        }
        return super.hitungGaji() + gajiLembur;
    }
    
}
    

