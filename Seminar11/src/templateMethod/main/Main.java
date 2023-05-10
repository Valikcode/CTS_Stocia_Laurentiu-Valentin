package templateMethod.main;

import templateMethod.model.Masa;
import templateMethod.model.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.ocupaMasa();

        MasaRezervata masaRezervata = new MasaRezervata(1,"ora 3");
        masaRezervata.ocupaMasa();

    }
}
