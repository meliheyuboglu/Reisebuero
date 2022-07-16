package com.company;

import java.util.ArrayList;

public class Kunden extends Person{
    private String telNummer;
    private String kreditkarte;
    private ArrayList <Reisepakete> reisepaketes = new ArrayList<>();
    public Kunden(String idN) {
        super(idN);
    }


    public void setTelNummer(String telNummer) {
        this.telNummer = telNummer;
    }

    public String getTelNummer() {
        return telNummer;
    }

    public void setKreditkarte(String kreditkarte) {
        this.kreditkarte = kreditkarte;
    }

    public String getKreditkarte() {
        return kreditkarte;
    }

    public void add(Reisepakete a) {
        reisepaketes.add(a);
    }

    public ArrayList<String> ReisepaketeInfo(){
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0 ; i < reisepaketes.size() ; i++){
            Reisepakete s = reisepaketes.get(i);
            String a = "ID " + s.getPaket_id() + ")" +  " " + "Startdatum: " + s.getStartDatum() + " " + "Enddatum: " + s.getEndDatumn() + " " + "Destination: " + s.getDestination() + " " + "Dauer: " + s.getAnzahlderTage();
            list.add(a);
        }
        return list;
    }

    @Override
    public String toString(){
        return getIdNummer() + " " + getName() + " " + getNachname() + " " + getAlter() + " " + telNummer + " " + kreditkarte;
    }
}
