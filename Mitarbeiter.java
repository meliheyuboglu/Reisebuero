package com.company;

public class Mitarbeiter extends Person{
    private String abteilung;
    private String gehalt;


    public Mitarbeiter(String idN) {

        super(idN);
    }


    public void setAbteilung(String abteilung) {

        this.abteilung = abteilung;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setGehalt(String gehalt) {
        this.gehalt = gehalt;
    }

    public String getGehalt() {

        return gehalt;
    }

    @Override
    public String toString() {
        return getIdNummer() + " " + getName() + " " + getNachname() + " " + getAlter() + " " + gehalt + " " + abteilung;
    }
}
