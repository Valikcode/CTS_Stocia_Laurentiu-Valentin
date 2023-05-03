package Flyweight.Main;

import Flyweight.Module.Cont;
import Flyweight.Module.FlyweightFactory;
import Flyweight.Module.IClientBanca;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Cont cont1 = new Cont(100,1);
        Cont cont2 = new Cont(300,2);
        Cont cont3 = new Cont(10,3);

        IClientBanca detinator = flyweightFactory.getDetinator("Vasile", "0744427590", "Valea Alba");
        detinator.descriere(cont1);

        flyweightFactory.getDetinator("Alin", "1234", "Test").descriere(cont2);
        flyweightFactory.getDetinator("Clau", "312", "Teest").descriere(cont3);
        flyweightFactory.getDetinator("Alin", "1234", "Test").descriere(cont1);

    }
}
