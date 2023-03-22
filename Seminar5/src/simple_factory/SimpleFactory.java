package simple_factory;

public class SimpleFactory {


    public PersonalSpital creazaPersonal(TipPersonal tipPersonal, String nume) {
        switch (tipPersonal) {
            case Medic:
                return new Medic(nume);
            case Brancardier:
                return new Brancardier(nume);
            case Asistent:
                return new Asistent(nume);
            default:
                return null;
        }
    }

    public PersonalSpital creazaPersonal(TipPersonal tipPersonal, String nume, int aniVechime) {
        switch (tipPersonal) {
            case Anestezist:
                return  new Anestezist(nume,aniVechime);
            default: return creazaPersonal(tipPersonal, nume);
        }
    }
}
