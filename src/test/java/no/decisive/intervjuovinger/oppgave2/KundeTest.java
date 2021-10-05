package no.decisive.intervjuovinger.oppgave2;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class KundeTest {

    @Test
    public void opprettingAvKunde() {
        Kunde kunde = new Kunde(3, "Kari Nordmann", BigDecimal.valueOf(3000), true);
        assertEquals(3, kunde.getId());
        assertEquals("Kari Nordmann", kunde.getNavn());
        assertEquals(BigDecimal.valueOf(3000), kunde.getKredittGrense());
        assertTrue(kunde.isAbonnererPaaNyhetsbrev());
    }

    @Test
    public void kundeMaaHaNavn() {
        try {
            new Kunde(3, null, BigDecimal.valueOf(3000), true);
            fail("Skulle ha kastet IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //Alt ok
        }
        try {
            new Kunde(3, "            ", BigDecimal.valueOf(3000), true);
            fail("Skulle ha kastet IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //Alt ok
        }
    }
}
