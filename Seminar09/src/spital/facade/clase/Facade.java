package spital.facade.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        medic.adaugaPacient(new Pacient("Clau",8));
        medic.adaugaPacient(new Pacient("Vali",2));
        medic.adaugaPacient(new Pacient("Cipri",6));
        medic.adaugaPacient(new Pacient("Cata",10));
        this.salon = new Salon();
        salon.adaugaPatLiber(10);
        salon.adaugaPatLiber(11);

    }

    public void interneazaPacient(String numePacient){
        if(medic.verificaTrimitere(medic.getPacient(numePacient))){
            if(salon.verificaPaturiLibere() == true){
                if(medic.getPacient(numePacient).getGravitate()>4){
                    System.out.println(numePacient + " este internat in patul " + salon.getCodPat());
                    salon.ocupaPat();
                } else {
                    System.out.println("Pacientul nu are o stare grava");
                }
            } else {
                System.out.println("Nu exista paturi libere");
            }
        } else {
            System.out.println("Pacientul nu are trimitere");
        }
    }
}
