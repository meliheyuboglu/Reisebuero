package com.company;

public interface ReisebueroSchnittstelle {



    public void addKunde(Kunden k);
    public void addMitarbeiter(Mitarbeiter m);
    public void addReisepaket(Reisepakete rp);

    public Kunden getKunde(String id);
    public Mitarbeiter getMitarbeiter(String id);
    public Reisepakete getReisepaket(int id);

    public void printKunden();
    public void printMitarbeiter();
    public void printAlleReisepakete();
    public void printAktuelleReisepakete();

    public void verkaufeReisepaket(String kunde_id, int rp_id);
}