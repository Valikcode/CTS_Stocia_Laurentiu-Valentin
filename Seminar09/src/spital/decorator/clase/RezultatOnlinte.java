package spital.decorator.clase;

public class RezultatOnlinte extends DecoratorAbstract{
    public RezultatOnlinte(FurnizareRezultat rezultatPeHartie) {
        super(rezultatPeHartie);
    }

    @Override
    public void afisareOnline(String diagnostic) {
        System.out.println("Online: " + diagnostic);
    }
}
