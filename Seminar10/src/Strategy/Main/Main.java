package Strategy.Main;

import Strategy.Modul.Operator;
import Strategy.Modul.VerificarePersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.verificaClient();
        operator.setModVerificare(new VerificarePersoanaJuridica());
        operator.verificaClient();
    }
}
