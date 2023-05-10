package templateMethod.model;

public class Masa extends IMasa{
    public Masa(int nr) {
        super(nr);
    }
    @Override
    protected void curataMasa() {
        System.out.println("Masa nr " + super.getNr() + " a fost curatata.");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Masa nr " + super.getNr() + " au fost asezate servetelele.");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Masa nr " + super.getNr() + " au fost asezate tacamurile.");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Masa nr " + super.getNr() + " au fost invitati invitatii.");
    }
}
