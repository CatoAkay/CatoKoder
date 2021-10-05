package no.decisive.intervjuovinger.oppgave3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FemmerLag {

    private String navn;
    private List<Spiller> spillere;

    public FemmerLag(String navn, List<Spiller> spillere) {
        this.navn = navn;
        this.spillere = spillere;
        duplikatFikser3();
        sorterPaaDraktnummer();
        if (this.spillere.size() != 5) {
            throw new IllegalArgumentException("Det er ikke riktig antall spillere. Antall: " + this.spillere.size());
        }
    }

    public List<Spiller> duplikatFikser() {
        for (int i = 0; i < spillere.size(); i++) {
            for (int j = i + 1; j < spillere.size(); j++) {
                if (spillere.get(i).equals(spillere.get(j))) {
                    spillere.remove(i);
                    i = 0;
                    j = 1;
                }
            }
        }
        return spillere;
    }

    public void duplikatFikser2() {
        spillere = spillere.stream().distinct().collect(Collectors.toList());
    }

    /**
     * Her bygger vi opp et nytt array med unike verdier
     * Begynner med et tomt array
     */
    public void duplikatFikser3() {
        List<Spiller> filtrerteSpillere = new ArrayList<>();
        for (Spiller spiller : this.spillere) {
            if (!filtrerteSpillere.contains(spiller)) {
                filtrerteSpillere.add(spiller);
            }
        }
        this.spillere = filtrerteSpillere;
    }

    /**
     * Sort muterer spillere
     * Hvis du vil lage en ny liste så kan du bruke stream slik:
     * spillere.stream().sorted(Comparator.comparing(Spiller::getDraktnummer)).collect(Collectors.toList());
     */
    public void sorterPaaDraktnummer() {
        spillere.sort(Comparator.comparing(Spiller::getDraktnummer));
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public List<Spiller> getSpillere() {
        return spillere;
    }

    public void setSpillere(ArrayList<Spiller> spillere) {
        this.spillere = spillere;
    }
}
