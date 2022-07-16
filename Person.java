package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public abstract class Person {
    private final String idNummer;
    private String name;
    private String nachname;
    private int alter;

    public Person(String idN) {
        this.idNummer = idN;

    }
    public static void isIDgultig (String s) throws InputMismatchException {
        if(s.length() == 7) {
            if ((!s.matches("[0-9]+"))) {
                throw new InputMismatchException("ID muss aus Ziffern bestehen!");
            }
            if(s.charAt(0) == '0'){
                throw new InputMismatchException("ID darf nicht mit '0' starten!");
            }
        }
        else {
            throw new InvalidIDException("ID muss 7 stellig sein!");
        }
    }

    public static boolean IDverifier (String m){
        if (m.length() == 7  && m.charAt(0) != '0' && m.matches("[0-9]+")){
            return true;
        }
        else{
            return false;
        }
    }

    public String getIdNummer() {

        return idNummer;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setNachname(String nachname) {

        this.nachname = nachname;
    }

    public String getNachname() {

        return nachname;
    }

    public void setAlter(int alter) {

        this.alter = alter;
    }

    public int getAlter() {

        return alter;
    }

}
