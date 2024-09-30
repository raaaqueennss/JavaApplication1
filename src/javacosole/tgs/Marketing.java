
package javacosole.tgs;
public class Marketing extends karyawan {
    private final double totalPenjualan;
    
    public Marketing( String nama, double gajiPokok, double totalPenjualan) {
        super(nama, gajiPokok);
        this.totalPenjualan = totalPenjualan;
    }
    
    @Override
    public double hitungGaji(){
        double bonus = 0.10 * totalPenjualan;
        return super.hitungGaji() + bonus; 
    }
    
}
    
