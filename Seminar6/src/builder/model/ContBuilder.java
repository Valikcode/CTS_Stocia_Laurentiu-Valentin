package builder.model;

public class ContBuilder implements BuilderInterface{
    private ContBancar contBancar;

    public ContBuilder(){
        this.contBancar = new ContBancar(false,false,false,"N/A");
    }

    public BuilderInterface setPrimesteSalariu(boolean primesteSalariu) {
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    public BuilderInterface setCardAtasat(boolean cardAtasat) {
        this.contBancar.setCardAtasat(cardAtasat);
        return this;
    }

    public BuilderInterface setInternetBanking(boolean internetBanking) {
        this.contBancar.setInternetBanking(internetBanking);
        return this;
    }

    public BuilderInterface setNume(String nume) {
        this.contBancar.setNume(nume);
        return this;
    }
    @Override
    public ContBancar build() {
        return contBancar;
    }
}
