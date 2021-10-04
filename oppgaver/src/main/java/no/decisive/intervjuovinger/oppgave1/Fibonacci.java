package no.decisive.intervjuovinger.oppgave1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {
    public static List<Integer> lagSekvensMedOppgittAntallTall(int lengdePaaRekke) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(0);
        if (lengdePaaRekke == 0) {
            return Collections.emptyList();
        }
        if (lengdePaaRekke == 2){
            a.add(1);
            return a;
        }
        for (int j = 1; j < lengdePaaRekke - 1; j++) {
            if (j == 1) {
                a.add(j);
            }
            a.add(a.get(j) + a.get(j - 1));
        }
        return a;
    }
}
