package templateMethod.model;

public abstract class IMasa {
    private int nr;

    public IMasa(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();
    protected abstract void invitaPersoane();
    public final void ocupaMasa(){
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }
}
