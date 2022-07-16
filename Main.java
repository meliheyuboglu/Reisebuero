package com.company;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) throws ParseException{



        Scanner sc = new Scanner(System.in);

        int operation = 0;
        int sayac = 1;
        Reisebuero re = new Reisebuero();
        while (operation != 100) {

            System.out.println("Welche Operation moechten Sie durchfuehren?");
            System.out.println("  1- Mitarbeiter hinzufuegen");
            System.out.println("  2- Mitarbeiter auflisten");
            System.out.println("  3- Mitarbeiter loeschen");
            System.out.println("  4- Kunde hinzufuegen");
            System.out.println("  5- Kunde auflisten");
            System.out.println("  6- Kunden loeschen");
            System.out.println("  7- Reisepakete hinzufuegen");
            System.out.println("  8- Reisepakete auflisten");
            System.out.println("  9- Reisepakete loeschen");
            System.out.println("  10- Reisepaket an Kunden verkaufen");
            System.out.println("  11- Reisepakete vom Kunden auflisten");
            System.out.println("  100 - Programm beenden");

            operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Geben Sie bitte ID des Mitarbeiters ein: ");
                    String mit_idN = sc.next();
                    try {
                        Person.isIDgultig(mit_idN);
                    }
                    catch (InvalidIDException h) {
                        System.out.println(h.getMessage());
                    }
                    catch (InputMismatchException s) {
                        System.out.println(s.getMessage());
                    }
                    if(Person.IDverifier(mit_idN)) {
                        Mitarbeiter m1 = new Mitarbeiter(mit_idN);

                        System.out.println("Geben Sie bitte der Name ein: ");
                        String mit_name = sc.next();
                        m1.setName(mit_name);

                        System.out.println("Geben Sie bitte der Nachname ein: ");
                        String mit_nachname = sc.next();
                        m1.setNachname(mit_nachname);

                        System.out.println("Geben Sie bitte das Alter ein: ");
                        int mit_alter = sc.nextInt();
                        m1.setAlter(mit_alter);

                        System.out.println("Geben Sie bitte das Gehalt ein: ");
                        String mit_gehalt = sc.next();
                        m1.setGehalt(mit_gehalt);

                        System.out.println("Geben Sie bitte die Abteilung des Mitarbeiters ein: ");
                        String mit_abteilung = sc.next();
                        m1.setAbteilung(mit_abteilung);

                        re.addMitarbeiter(m1);
                    }


                    break;

                case 2:
                    re.printMitarbeiter();
                    break;

                case 3:
                    System.out.println("Geben Sie bitte ID des Mitarbeiters ein: ");
                    String id = sc.next();

                    re.loescheMitarbeiter(id);
                    break;

                case 4:
                    System.out.println("Geben Sie bitte ID des Kundes ein: ");
                    String kun_idN = sc.next();
                    Kunden k1 = new Kunden(kun_idN);
                    try{
                        Person.isIDgultig(kun_idN);
                    }
                    catch (InvalidIDException h) {
                        System.out.println(h.getMessage());
                    }
                    catch (InputMismatchException s) {
                        System.out.println(s.getMessage());
                    }
                    if(Person.IDverifier(kun_idN)) {
                        System.out.println("Geben Sie bitte der Name ein: ");
                        String kun_name = sc.next();
                        k1.setName(kun_name);

                        System.out.println("Geben Sie bitte der Nachname ein: ");
                        String kun_nachname = sc.next();
                        k1.setNachname(kun_nachname);

                        System.out.println("Geben Sie bitte das Alter ein: ");
                        int kun_alter = sc.nextInt();
                        k1.setAlter(kun_alter);

                        System.out.println("Geben Sie bitte der Tel - Nummer ein: ");
                        String kun_telN = sc.next();
                        k1.setTelNummer(kun_telN);

                        System.out.println("Geben Sie bitte die Kreditkarte ein: ");
                        String kun_kreditkarte = sc.next();
                        k1.setKreditkarte(kun_kreditkarte);

                        re.addKunde(k1);
                    }

                    break;

                case 5:
                    re.printKunden();
                    break;

                case 6:
                    System.out.println("Geben Sie bitte ID des Kunden ein: ");
                    String k_id = sc.next();

                    re.loescheKunde(k_id);
                    break;

                case 7:
                    System.out.println("Geben Sie das Startdatum ein (TT/MM/JJJJ)");
                    String start = sc.next();
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    Date s = format.parse(start);

                    System.out.println("Geben Sie das Enddatum ein TT/MM/JJJJ");
                    String end = sc.next();
                    Date e = format.parse(end);

                    System.out.println("Geben Sie das Destination ein: ");
                    String dest = sc.next();

                    System.out.println("Geben Sie die Anzal der Tage ein");
                    int tag = sc.nextInt();

                    Reisepakete r1 = new Reisepakete(s, e, dest, tag);
                    r1.setPaket_id(sayac);
                    re.addReisepaket(r1);
                    sayac++;

                    break;

                case 8:
                    re.printAktuelleReisepakete();

                    break;

                case 9:
                    System.out.println("Geben Sie bitte ID des Pakets ein: ");
                    int pakete = sc.nextInt();

                    re.loescheReisepakete(pakete);

                case 10:
                    System.out.println("Geben Sie bitte ID des Kunden ein: ");
                    String kunden_id = sc.next();
                    System.out.println("Geben Sie bitte ID des Pakets ein: ");
                    int paket_id = sc.nextInt();

                    re.verkaufeReisepaket(kunden_id, paket_id);

                    break;

                case 11:
                    System.out.println("Geben Sie bitte ID des Kunden ein: ");
                    String kunde_list = sc.next();

                    re.printKundespakete(kunde_list);


                    break;

            }



        }

    }

}
