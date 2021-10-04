package no.decisive.intervjuovinger.oppgave3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FemmerLagTest {

    /*
    @Test
    public void femmerlagHarNavnOgSpillere() {
        Spiller per = new Spiller(1, "Per");
        Spiller paal = new Spiller(3, "Pål");
        Spiller espenAskeladd = new Spiller(4, "Espen Askeladd");
        Spiller gudbrand = new Spiller(8, "Gudbrand");
        Spiller smoerbukk = new Spiller(11, "Smørbukk");
        FemmerLag lag = new FemmerLag("De gode hjelperne", new ArrayList<>(Arrays.asList(per, paal, espenAskeladd, gudbrand, smoerbukk)));

        assertEquals("De gode hjelperne", lag.getNavn());
        List<Spiller> spillere = lag.getSpillere();
        assertEquals(1, spillere.get(0).getDraktnummer());
        assertEquals(3, spillere.get(1).getDraktnummer());
        assertEquals(4, spillere.get(2).getDraktnummer());
        assertEquals(8, spillere.get(3).getDraktnummer());
        assertEquals(11, spillere.get(4).getDraktnummer());
    }
    */

    /*
    @Test
    public void femmerlagSkalHaAkkuratFemSpillere() {
        Spiller per = new Spiller(1, "Per");
        Spiller paal = new Spiller(3, "Pål");
        Spiller espenAskeladd = new Spiller(4, "Espen Askeladd");
        Spiller gudbrand = new Spiller(8, "Gudbrand");
        Spiller smoerbukk = new Spiller(11, "Smørbukk");
        Spiller halvor = new Spiller(7, "Halvor");

        try {
            //Tester med mindre enn 5 spillere
            new FemmerLag("De gode hjelperne", new ArrayList<>(Arrays.asList(per, paal, espenAskeladd, gudbrand)));
            fail("Skulle ha kastet exception");
        } catch (IllegalArgumentException e) {
            //Alt ok
        }

        //Tester med akkurat 5 spillere
        FemmerLag lag = new FemmerLag("De gode hjelperne", new ArrayList<>(Arrays.asList(per, paal, espenAskeladd, gudbrand, smoerbukk)));
        assertEquals(5, lag.getSpillere().size());

        try {
            //Tester med mer enn 5 spillere
            new FemmerLag("De gode hjelperne", new ArrayList<>(Arrays.asList(per, paal, espenAskeladd, gudbrand, smoerbukk, halvor)));
            fail("Skulle ha kastet exception");
        } catch (IllegalArgumentException e) {
            //Alt ok
        }
    }
     */

    /*
    @Test
    public void duplikatregistrerteSpillereBlirFjernet() {
        Spiller per = new Spiller(1, "Per");
        Spiller paal = new Spiller(3, "Pål");
        Spiller espenAskeladd = new Spiller(4, "Espen Askeladd");
        Spiller gudbrand = new Spiller(8, "Gudbrand");
        Spiller smoerbukk = new Spiller(11, "Smørbukk");

        List<Spiller> spillere = new ArrayList<>();
        spillere.add(per);
        spillere.add(paal);
        spillere.add(espenAskeladd);
        spillere.add(gudbrand);
        spillere.add(smoerbukk);
        //Legger også til to av spillerne en gang til (duplikater)
        spillere.add(new Spiller(1, "Per"));
        spillere.add(new Spiller(3, "Pål"));
        FemmerLag lag = new FemmerLag("De gode hjelperne", spillere);

        List<Spiller> spillerePaaLaget = lag.getSpillere();
        assertEquals(5, spillerePaaLaget.size());
        assertTrue(spillerePaaLaget.contains(per));
        assertTrue(spillerePaaLaget.contains(paal));
        assertTrue(spillerePaaLaget.contains(espenAskeladd));
        assertTrue(spillerePaaLaget.contains(gudbrand));
        assertTrue(spillerePaaLaget.contains(smoerbukk));
    }
     */

    /*
    @Test
    public void spillerneSkalVaereSortertEtterDraktnummer() {
        Spiller per = new Spiller(1, "Per");
        Spiller paal = new Spiller(3, "Pål");
        Spiller espenAskeladd = new Spiller(4, "Espen Askeladd");
        Spiller gudbrand = new Spiller(8, "Gudbrand");
        Spiller smoerbukk = new Spiller(11, "Smørbukk");

        List<Spiller> spillere = new ArrayList<>();
        //Legger til spillerne i en annen rekkefølge enn etter draktnummer
        spillere.add(espenAskeladd);
        spillere.add(smoerbukk);
        spillere.add(paal);
        spillere.add(per);
        spillere.add(gudbrand);
        FemmerLag lag = new FemmerLag("De gode hjelperne", spillere);

        List<Spiller> spillerePaaLaget = lag.getSpillere();
        assertEquals(per, spillerePaaLaget.get(0));
        assertEquals(paal, spillerePaaLaget.get(1));
        assertEquals(espenAskeladd, spillerePaaLaget.get(2));
        assertEquals(gudbrand, spillerePaaLaget.get(3));
        assertEquals(smoerbukk, spillerePaaLaget.get(4));
    }
     */
}
