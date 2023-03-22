package simple_factory.main;

import simple_factory.PersonalSpital;
import simple_factory.SimpleFactory;
import simple_factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        List<PersonalSpital> lista = new ArrayList<>();
        PersonalSpital personalSpital1 = simpleFactory.creazaPersonal(TipPersonal.Medic, "Andrei");
        PersonalSpital personalSpital2 = simpleFactory.creazaPersonal(TipPersonal.Asistent, "Cata");
        PersonalSpital personalSpital3 = simpleFactory.creazaPersonal(TipPersonal.Brancardier, "Vali");
        PersonalSpital personalSpital4 = simpleFactory.creazaPersonal(TipPersonal.Medic, "Clau");
        PersonalSpital personalSpital5 = simpleFactory.creazaPersonal(TipPersonal.Anestezist, "Carmen", 5);
        lista.addAll(List.of(personalSpital1, personalSpital2, personalSpital3, personalSpital4, personalSpital5));
        for (PersonalSpital personalSpital : lista) {
            personalSpital.afiseazaDescriere();
        }
    }
}