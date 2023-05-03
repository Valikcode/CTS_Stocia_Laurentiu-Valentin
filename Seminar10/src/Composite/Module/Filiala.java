package Composite.Module;

public class Filiala implements UnitateBancara{

    private String nume;
    private int nrAngajati;

    public Filiala() {}

    public Filiala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        throw new RuntimeException();
    }

    @Override
    public void printUnitate(String indentare) {
        System.out.println(indentare + "Filiala " + this.nume + " are " + this.nrAngajati + " angajati.");
    }
}
