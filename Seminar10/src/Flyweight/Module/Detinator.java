package Flyweight.Module;

public class Detinator implements IClientBanca {

    private String nume;
    private String nrTelefon;
    private String adresa;

    public Detinator(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void descriere(Cont cont) {
        System.out.println("Clientul " + this.nume + " cu nr de telefon " + this.nrTelefon + " sta la adresa " + adresa + ".-Cont:" + cont.toString());
    }
}
