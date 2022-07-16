package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reisebuero implements ReisebueroSchnittstelle {
    private ArrayList<Mitarbeiter> mitarbeiter = new ArrayList();
    private ArrayList <Kunden> kunden = new ArrayList();
    private ArrayList <Reisepakete> reisepakete = new ArrayList();

    @Override
    public void addKunde(Kunden k) {

        kunden.add(k);
    }

    @Override
    public void addMitarbeiter(Mitarbeiter m) {

        mitarbeiter.add(m);
    }

    @Override
    public void addReisepaket(Reisepakete rp) {

        reisepakete.add(rp);
    }

    public void loescheKunde(String k){
        for(int i = 0 ; i < kunden.size() ; i++){
            Kunden kunde = kunden.get(i);
            if(kunde.getIdNummer().equals(k)){
                kunden.remove(i);
            }
        }
    }

    public void loescheMitarbeiter(String m){
        for(int i = 0 ; i < mitarbeiter.size() ; i++){
            Mitarbeiter mitarb = mitarbeiter.get(i);
            if(mitarb.getIdNummer().equals(m)){
                mitarbeiter.remove(i);
            }
        }
    }

    public void loescheReisepakete(int id){
        for(int i = 0 ; i < reisepakete.size() ; i++){
            Reisepakete reisepaket = reisepakete.get(i);
            if(reisepaket.getPaket_id() == id){
                reisepakete.remove(i);
            }
        }
    }

    @Override
    public Kunden getKunde(String id) {
        for(int i = 0 ; i < kunden.size() ; i++){
            if(id == kunden.get(i).getIdNummer()){
                return kunden.get(i);
            }
        }
        return null;
    }

    @Override
    public Mitarbeiter getMitarbeiter(String id) {
        for(int i = 0 ; i < mitarbeiter.size() ; i++){
            if(id == mitarbeiter.get(i).getIdNummer()){
                return mitarbeiter.get(i);
            }
        }
        return null;
    }

    @Override
    public Reisepakete getReisepaket(int id) {
        for(int i = 0 ; i < reisepakete.size() ; i++){
            if(id == reisepakete.get(i).getPaket_id()){
                return reisepakete.get(i);
            }
        }
        return null;
    }

    @Override
    public void printKunden() {
        for (int i = 0 ; i < kunden.size() ; i++){
            Kunden k = kunden.get(i);
            System.out.println(k);
        }
    }

    @Override
    public void printMitarbeiter() {
        for (int i = 0 ; i < mitarbeiter.size() ; i++) {
            Mitarbeiter m = mitarbeiter.get(i);
            System.out.println(m);
        }
    }

    @Override
    public void printAlleReisepakete() {
        for(int i = 0 ; i < reisepakete.size() ; i++){
            Reisepakete re = reisepakete.get(i);
            System.out.println(re);
        }
    }

    @Override
    public void printAktuelleReisepakete() {
        Calendar c = new GregorianCalendar();
        for (int i = 0; i < reisepakete.size(); i++) {
            Reisepakete re = reisepakete.get(i);
            if(re.getStartDatum().after(c.getTime())) {
                re.printInfo();
            }
        }
    }

    public void printKundespakete(String kunde_list){
        for (int i = 0 ; i < kunden.size() ; i++){
            if(kunden.get(i).getIdNummer().equals(kunde_list)){
                System.out.println(kunden.get(i).ReisepaketeInfo());
            }
        }
    }

    @Override
    public void verkaufeReisepaket(String kunde_id, int rp_id) {
        for(int i = 0 ; i < kunden.size() ; i++) {
            if (kunde_id.equals(kunden.get(i).getIdNummer())){
                for(int j = 0 ; j < kunden.size() ; j++) {
                    if(kunden.get(j).getIdNummer().equals(kunde_id)) {
                        for (int l = 0; l < reisepakete.size(); l++) {
                            if (reisepakete.get(l).getPaket_id() == rp_id) {
                                kunden.get(j).add(reisepakete.get(l));
                            }
                        }
                    }
                }
            }
        }

    }
}
