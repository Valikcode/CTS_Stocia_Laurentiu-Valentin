package builder.model;

public interface BuilderInterface {

    public ContBancar build();

    public BuilderInterface setPrimesteSalariu(boolean primesteSalariu);
    public BuilderInterface setCardAtasat(boolean cardAtasat);
    public BuilderInterface setInternetBanking(boolean internetBanking);
    public BuilderInterface setNume(String nume);
}
