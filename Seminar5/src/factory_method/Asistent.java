package factory_method;

import factory_method.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul: " + super.getNume());
    }
}
