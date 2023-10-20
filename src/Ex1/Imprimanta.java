package Ex1;

public class Imprimanta extends Echipament {
    private final int ppm;
    private final String rezolutie;
    private final int p_car;
    private ModTipar mt;

    public Imprimanta(String denumire, int nr_inv, int pret, String zona_mag, SituatieProdus sp, int ppm, String rezolutie, int p_car, ModTipar mt) {
        super(denumire, nr_inv, pret, zona_mag,sp);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.mt = mt;
    }

    void setMt(ModTipar mt1)
    {
        mt = mt1;
    }

    @Override
    public String toString() {
        return super.toString() + "Imprimanta{" +
                "ppm=" + ppm +
                ", rezolutie='" + rezolutie + '\'' +
                ", p_car=" + p_car +
                ", mt=" + mt +
                '}';
    }
}
