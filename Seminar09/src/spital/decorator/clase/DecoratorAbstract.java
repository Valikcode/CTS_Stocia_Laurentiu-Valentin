package spital.decorator.clase;

public abstract class DecoratorAbstract implements FurnizareRezultat {
    private FurnizareRezultat rezultatPeHartie;
    @Override
    public void printareRezultat(String diagnostic) {
        rezultatPeHartie.printareRezultat(diagnostic);
    }

    public DecoratorAbstract(FurnizareRezultat rezultatPeHartie){
        this.rezultatPeHartie = rezultatPeHartie;
    }
    public abstract void afisareOnline(String diagnostic);
}
