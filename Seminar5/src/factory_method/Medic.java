package factory_method;

import factory_method.PersonalSpital;

public class Medic extends PersonalSpital {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicul: " + super.getNume());
    }
}
