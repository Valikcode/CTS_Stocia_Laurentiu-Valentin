package tests;

import classes.PachetTuristic;
import mocks.FakePersoana;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicaDiscountTest {

    @Test
    void aplicaDiscountVarstniciTest() {
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(70);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana,"test", 100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90.0, pachetTuristic.getPret());
    }

    @Test
    void nuAplicaDiscountVarstniciTest() {
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(50);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana,"test", 100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(100.0, pachetTuristic.getPret());
    }
}