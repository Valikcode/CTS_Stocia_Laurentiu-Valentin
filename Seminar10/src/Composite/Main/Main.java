package Composite.Main;

import Composite.Module.Filiala;
import Composite.Module.Sucursala;
import Composite.Module.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursala1 = new Sucursala("Sucursala1", 10);
        UnitateBancara sucursala2 = new Sucursala("Sucursala2", 20);
        UnitateBancara agentie1 = new Sucursala("Agentie1",15);
        UnitateBancara agentie2 = new Sucursala("Agentie2",15);
        UnitateBancara filiala1 = new Filiala("Filiala1",5);
        UnitateBancara filiala2 = new Filiala("Filiala2",4);
        UnitateBancara filiala3 = new Filiala("Filiala3",6);

        sucursala1.adaugaUnitate(sucursala2);
        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(filiala1);

        sucursala2.adaugaUnitate(agentie2);
        sucursala2.adaugaUnitate(filiala2);

        agentie1.adaugaUnitate(filiala3);

        sucursala1.printUnitate("   ");
    }
}