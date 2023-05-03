package spital.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> coduriPaturiLibere;

    public Salon(){
        this.coduriPaturiLibere = new ArrayList<>();
    }

    public void adaugaPatLiber(int codPat){
        this.coduriPaturiLibere.add(codPat);
    }
    public boolean verificaPaturiLibere(){
        return !coduriPaturiLibere.isEmpty();
    }

    public void ocupaPat(){
        coduriPaturiLibere.remove(0);
    }

    public int getCodPat() {
        return coduriPaturiLibere.get(0);
    }
}
