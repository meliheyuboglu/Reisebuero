package com.company;
import java.util.Date;

public class Reisepakete {

    private int paket_id;
    private Date startDatum;
    private Date endDatum;
    private String destination;
    private int anzahlderTage;

    public Reisepakete(Date startDatum, Date endDatum, String destination, int anzahlderTage){
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.destination = destination;
        this.anzahlderTage = anzahlderTage;
    }

    public Date getStartDatum(){

        return startDatum;
    }

    public Date getEndDatumn(){
        return endDatum;
    }

    public String getDestination(){
        return destination;
    }

    public int getAnzahlderTage(){
        return anzahlderTage;
    }

    public void setPaket_id(int paket_id){
        this.paket_id = paket_id;
    }

    public int getPaket_id() {

        return paket_id;
    }

    public void printInfo() {
        System.out.println("ID " + paket_id + ")" +  " " + "Startdatum: " + startDatum + " " + "Enddatum: " + endDatum + " " + "Destination: " + destination + " " + "Dauer: " + anzahlderTage);
    }

}
