package state.main;

import state.model.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.elibereazaMasa();
        masa.rezervaMasa();
        masa.rezervaMasa();
        masa.ocupareMasa();
        masa.ocupareMasa();
        masa.elibereazaMasa();
        masa.rezervaMasa();
    }
}
