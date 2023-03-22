package simple_factory;

public class Anestezist extends  PersonalSpital{
    private int aniVechime;
    public Anestezist(String nume, int aniVechime) {
        super(nume);
        this.aniVechime = aniVechime;
    }


    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul: " + super.getNume() + " are " + aniVechime + " ani vechime.");
    }
}
