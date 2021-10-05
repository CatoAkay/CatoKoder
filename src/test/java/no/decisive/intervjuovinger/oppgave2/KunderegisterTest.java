package no.decisive.intervjuovinger.oppgave2;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KunderegisterTest {

    /*
    @Test
    public void hentPaaKundeid_EffektivImplementasjon() {
        Kunderegister kunderegister = new Kunderegister();
        for (int i = 1; i <= 1000000; i++) {
            kunderegister.leggTilKunde(new Kunde(i, "Ole Olsen nr " + i, BigDecimal.valueOf( i % 10000), i % 2 == 0));
        }

        int id = 909395;
        Long startTid = new Date().getTime();
        Kunde faktiskKunde = kunderegister.hentKundeMedId(id);
        Long sluttTid = new Date().getTime();

        Kunde forventetKunde = new Kunde(id, "Ole Olsen nr " + id, BigDecimal.valueOf(id % 10000), false);
        assertEquals(forventetKunde, faktiskKunde);
        long tidBrukt = sluttTid - startTid;
        int maksTidTillatt = 2;
        assertTrue(tidBrukt < maksTidTillatt, "Tidbrukt var " + tidBrukt + ", over kravet på " + maksTidTillatt + " ms");
    }
     */

}
