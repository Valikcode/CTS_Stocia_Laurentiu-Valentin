package builder.model;

public class ContBancar {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;
    private String nume;

    protected ContBancar(boolean primesteSalariu, boolean cardAtasat, boolean internetBanking, String nume) {
        this.primesteSalariu = primesteSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
        this.nume = nume;
    }

    protected void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    protected void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    protected void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("primesteSalariu=").append(primesteSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
