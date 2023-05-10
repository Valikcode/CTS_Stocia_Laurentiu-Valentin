package state.model;

public class StareOcupata implements IStare{
    @Override
    public void modificareStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera || masa.getStare() instanceof StareRezervata){
            System.out.println("Masa este ocupata acum.");
            masa.setStare(this);
        } else {
            System.out.println("Masa este deja ocupata.");
        }
    }
}
