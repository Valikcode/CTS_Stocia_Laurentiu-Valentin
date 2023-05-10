package state.model;

public class Masa {
    private int numar;
    private IStare stare;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = new StareLibera();
    }

    public int getNumar() {
        return numar;
    }

    public IStare getStare() {
        return stare;
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    public void ocupareMasa(){
        IStare stare = new StareOcupata();
        stare.modificareStare(this);
    }

    public void rezervaMasa(){
        IStare stare = new StareRezervata();
        stare.modificareStare(this);
    }

    public void elibereazaMasa(){
        IStare stare = new StareLibera();
        stare.modificareStare(this);
    }

    public void anuleazaRezervare(){
        IStare stare = new StareLibera();
        stare.modificareStare(this);
    }
}
