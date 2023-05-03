package spital.decorator.clase;

public class RezultatPeHartie implements FurnizareRezultat{
    @Override
    public void printareRezultat(String diagnostic) {
        System.out.println("Hartie: " + diagnostic);
    }
}
