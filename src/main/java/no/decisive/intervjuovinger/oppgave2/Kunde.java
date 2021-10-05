package no.decisive.intervjuovinger.oppgave2;

import java.math.BigDecimal;

public class Kunde {

    private int Id;
    private String navn;
    private BigDecimal kredittGrense;
    private Boolean abonnererPaaNyhetsbrev;

    public Kunde(int Id, String navn, BigDecimal kredittGrense, Boolean abonnererPaaNyhetsbrev) {
        if (navn == null || navn.trim().equals("")) {
            throw new IllegalArgumentException("Kunde må ha navn");
        }
        this.Id = Id;
        this.navn = navn;
        this.kredittGrense = kredittGrense;
        this.abonnererPaaNyhetsbrev = abonnererPaaNyhetsbrev;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public BigDecimal getKredittGrense() {
        return kredittGrense;
    }

    public void setKredittGrense(BigDecimal kredittGrense) {
        this.kredittGrense = kredittGrense;
    }

    public Boolean isAbonnererPaaNyhetsbrev() {
        return abonnererPaaNyhetsbrev;
    }

    public void setAbonnererPaaNyhetsbrev(Boolean abonnererPaaNyhetsbrev) {
        this.abonnererPaaNyhetsbrev = abonnererPaaNyhetsbrev;
    }
}
