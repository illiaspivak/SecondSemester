package sk.kosickaakademia.illiaspivak.rodnecislo;

import static org.junit.Assert.*;

public class DenTest {

    @org.junit.Test
    public void denN() {
        Den den = new Den();
        assertEquals("Utorok",den.DenN(1963,12,03));
        assertEquals("Utorok",den.DenN(1935,02,19));
        assertEquals("Streda",den.DenN(1997,12,31));
        assertEquals("Utorok",den.DenN(1984,05,01));
    }
}