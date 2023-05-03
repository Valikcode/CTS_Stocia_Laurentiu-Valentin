package spital.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Medic {

    private List<Pacient> numePacienti;

    public Medic(){
        this.numePacienti = new ArrayList<>();
    }

    public void adaugaPacient(Pacient Pacient){
        this.numePacienti.add(Pacient);
    }

    public boolean verificaTrimitere(Pacient pacient){
        return this.numePacienti.contains(pacient);
    }

    public Pacient getPacient(String nume){
        for(Pacient pacient:numePacienti){
            if (pacient.getNume().equals(nume)){
                return pacient;
            }
        }
        return null;
    }
}
