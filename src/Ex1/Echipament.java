package Ex1;
import java.io.Serializable;

public class Echipament implements Serializable {
    private String denumire;
    private int nr_inv;
    private int pret;
    private String zona_mag;
    private SituatieProdus sp;

    public Echipament(String denumire, int nr_inv, int pret, String zona_mag, SituatieProdus sp) {
        super();
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.sp = sp;
    }

    void setSp(SituatieProdus sp1)
    {
        sp = sp1;
    }
    SituatieProdus getSp()
    {
        return sp;
    }

    int getNr_inv()
    {
        return nr_inv;
    }

    @Override
    public String toString() {
        return "Echipament{" +
                "denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", sp=" + sp +
                '}';
    }
}
