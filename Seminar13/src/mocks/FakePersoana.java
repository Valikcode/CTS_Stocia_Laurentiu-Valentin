package mocks;

import classes.IPersoana;

public class FakePersoana implements IPersoana {

    private int getVarstaValue=0;
    private boolean checkCNP = true;
    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return getVarstaValue;
    }

    @Override
    public boolean checkCNP() {
        return checkCNP;
    }

    public void setGetVarstaValue(int getVarstaValue) {
        this.getVarstaValue = getVarstaValue;
    }

    public void setCheckCNP(boolean checkCNP) {
        this.checkCNP = checkCNP;
    }
}
