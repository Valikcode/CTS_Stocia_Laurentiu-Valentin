package mocks;

import classes.IPersoana;

public class StubPersoanaMajora implements IPersoana {

    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 19;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
