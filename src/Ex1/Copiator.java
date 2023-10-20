package Ex1;

public class Copiator extends Echipament{
    private final int p_ton;
    private FormatCopiere format;

    public Copiator(String denumire, int nr_inv, int pret, String zona_mag, SituatieProdus sp, int p_ton, FormatCopiere format) {
        super(denumire, nr_inv, pret, zona_mag, sp);
        this.p_ton = p_ton;
        this.format = format;
    }

    void setFormat(FormatCopiere format1)
    {
        format = format1;
    }

    @Override
    public String toString() {
        return super.toString() + "Copiator{" +
                "p_ton=" + p_ton +
                ", format=" + format +
                '}';
    }
}
