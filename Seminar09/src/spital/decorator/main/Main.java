package spital.decorator.main;

import spital.decorator.clase.DecoratorAbstract;
import spital.decorator.clase.FurnizareRezultat;
import spital.decorator.clase.RezultatOnlinte;
import spital.decorator.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {

        FurnizareRezultat rezultatPeHartie = new RezultatPeHartie();
        rezultatPeHartie.printareRezultat("Raceala");

        DecoratorAbstract decoratorAbstract = new RezultatOnlinte(rezultatPeHartie);
        decoratorAbstract.afisareOnline("Raceala");
        decoratorAbstract.printareRezultat("Raceala");
    }
}
