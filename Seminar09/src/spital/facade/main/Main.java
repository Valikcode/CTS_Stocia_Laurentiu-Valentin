package spital.facade.main;

import spital.facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.interneazaPacient("Vali");
        facade.interneazaPacient("Clau");
        facade.interneazaPacient("Cata");
        facade.interneazaPacient("Cipri");
        facade.interneazaPacient("Gigi");
    }
}