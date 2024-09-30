
package javacosole;    
class Kerucut extends LuasLingkaran {
    double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
}
    
