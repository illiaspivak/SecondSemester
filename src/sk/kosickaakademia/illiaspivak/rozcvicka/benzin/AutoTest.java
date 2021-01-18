package sk.kosickaakademia.illiaspivak.rozcvicka.benzin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.TestClass;
import sk.kosickaakademia.illiaspivak.rozcvicka.unittesty.Metody;

import static org.junit.Assert.*;

public class AutoTest {
    private TestClass tc;

    @Before
    public void setUp() throws Exception {
        System.out.println("Test started");
    }

    @After
    public void tearDown() throws Exception {
        tc=null;
        System.out.println("Test finished");
    }

    @Test
    public void cenaBenzin() {
        assertEquals("0,00", Auto.CenaBenzin(0,1,0));
        assertEquals("0", Auto.CenaBenzin(-1,5,8));
        assertEquals("0", Auto.CenaBenzin(100,-5,8));
        assertEquals("0", Auto.CenaBenzin(1931,5,-8));
        assertEquals("0", Auto.CenaBenzin(-1,5,8));
        assertEquals("0", Auto.CenaBenzin(-1,5,8));
        assertEquals("7043,57", Auto.CenaBenzin(16435,7,3));
    }
}