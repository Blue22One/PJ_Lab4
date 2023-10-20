package Ex1;

public class SistemDeCalcul extends Echipament {
    private final String tip_mon;
    private final float vit_proc;
    private final int c_hdd;
    private SistemOperare OS;

    public SistemDeCalcul(String denumire, int nr_inv, int pret, String zona_mag, SituatieProdus sp, String tip_mon, float vit_proc, int c_hdd, SistemOperare OS) {
        super(denumire, nr_inv, pret, zona_mag, sp);
        this.tip_mon = tip_mon;
        this.c_hdd = c_hdd;
        this.vit_proc = vit_proc;
        this.OS = OS;
    }

    void setOS(SistemOperare OS1)
    {
        OS = OS1;
    }

    @Override
    public String toString() {
        return super.toString() + "SistemDeCalcul{" +
                "tip_mon='" + tip_mon + '\'' +
                ", vit_proc=" + vit_proc +
                ", c_hdd=" + c_hdd +
                ", OS=" + OS +
                '}';
    }
}
