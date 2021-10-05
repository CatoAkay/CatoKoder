package no.decisive.intervjuovinger.oppgave3;

import java.util.Objects;

public class Spiller {

    private int draktNummer;
    private String navn;

    public Spiller(int draktNummer, String navn) {
        this.draktNummer = draktNummer;
        this.navn = navn;
    }

    public int getDraktnummer() {
        return draktNummer;
    }

    public void setDraktNummer(int draktNummer) {
        this.draktNummer = draktNummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Spiller spiller = (Spiller) o;
        return draktNummer == spiller.draktNummer && Objects.equals(navn, spiller.navn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(draktNummer, navn);
    }
}
