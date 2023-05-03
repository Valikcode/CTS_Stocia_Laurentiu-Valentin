package Composite.Module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sucursala implements UnitateBancara{
    private String nume;
    private int nrAngajati;
    private List<UnitateBancara> unitateBancaraList;

    public Sucursala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.unitateBancaraList = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        this.unitateBancaraList.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        this.unitateBancaraList.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return this.unitateBancaraList.get(index);
    }

    @Override
    public void printUnitate(String indentare) {
        System.out.println(indentare + "Sucursala " + this.nume + " are " + this.nrAngajati + " angajati.");
        for(UnitateBancara unitateBancara : unitateBancaraList){
            unitateBancara.printUnitate(indentare + "   ");
        }
    }
}
