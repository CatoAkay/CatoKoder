package no.decisive.intervjuovinger.oppgave1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciTest {


    @Test
    public void fibonacciMedIngenTallISekvensen() {
        List<Integer> faktiskSekvens = Fibonacci.lagSekvensMedOppgittAntallTall(0);

        assertTrue(faktiskSekvens.isEmpty());
    }

    @Test
    public void fibonacciMedEttTallISekvensen() {
        List<Integer> faktiskSekvens = Fibonacci.lagSekvensMedOppgittAntallTall(1);

        List<Integer> forventetSekvens = Arrays.asList(0);
        assertEquals(forventetSekvens, faktiskSekvens);
    }

    @Test
    public void fibonacciMedToTallISekvensen() {
        List<Integer> faktiskSekvens = Fibonacci.lagSekvensMedOppgittAntallTall(2);

        List<Integer> forventetSekvens = Arrays.asList(0,1);
        assertEquals(forventetSekvens, faktiskSekvens);
    }

    @Test
    public void fibonacciMedTiTallISekvensen() {
        List<Integer> faktiskSekvens = Fibonacci.lagSekvensMedOppgittAntallTall(10);

        List<Integer> forventetSekvens = Arrays.asList(0,1,1,2,3,5,8,13,21,34);
        assertEquals(forventetSekvens, faktiskSekvens);
    }
}
