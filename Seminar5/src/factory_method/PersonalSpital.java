package factory_method;

public abstract class PersonalSpital {

    private String nume;

    public abstract void afiseazaDescriere();

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
