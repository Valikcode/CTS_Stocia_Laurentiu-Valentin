package state.model;

public class StareLibera implements IStare{
    @Override
    public void modificareStare(Masa masa) {
        if(!(masa.getStare() instanceof StareLibera)){
            System.out.println("Masa este libera acum.");
            masa.setStare(this);
        } else {
            System.out.println("Masa este deja libera.");
        }
    }
}
