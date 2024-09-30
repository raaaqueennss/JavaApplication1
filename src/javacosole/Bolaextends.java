
package javacosole;
class Bola extends LuasLingkaran {
    public Bola(double jariJari) {
        super(jariJari);
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}
    
