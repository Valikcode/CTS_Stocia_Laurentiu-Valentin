package tests;

import classes.PachetTuristic;
import mocks.StubPersoanaMajora;
import mocks.StubPersoanaMinora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoateRezervaTest {

    @Test
    void getVarstaMajorTest(){
        StubPersoanaMajora stubPersoanaMajora = new StubPersoanaMajora();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoanaMajora, "Test", 150.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    void getVarstaMinorTest(){
        StubPersoanaMinora stubPersoanaMinora = new StubPersoanaMinora();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoanaMinora, "Test", 150.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

}