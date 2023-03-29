package builder.model;

public class ContBancarBuilder implements BuilderInterface{
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;
    private String nume;

    @Override
    public BuilderInterface setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    @Override
    public BuilderInterface setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    @Override
    public BuilderInterface setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    @Override
    public BuilderInterface setNume(String nume) {
        this.nume = nume;
        return this;
    }

    @Override
    public ContBancar build() {
        return new ContBancar(this.primesteSalariu,this.cardAtasat,this.internetBanking,this.nume);
    }

}
