import java.util.ArrayList;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AplikacijaExcel {
    static Scanner s = new Scanner(System.in);
    static ArrayList<Nalog> bazaNaloga = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("Da li imate nalog?");
        if (s.next().equals("ne")) {
            signIn(bazaNaloga);
        } else {
            logIn(bazaNaloga);
        }


    }

    public static void signIn(ArrayList<Nalog> bazaNaloga) {
        System.out.println("Molimo Vas unesite Vase ime:");
        String ime = s.next();
        System.out.println(ime);

        System.out.println("Molimo Vas unesite Vase prezime :");
        String prezime = s.next();
        System.out.println(prezime);

        System.out.println("Molimo Vas unesite korisnicko ime:");
        String korisnickoIme = s.next();
        System.out.println(korisnickoIme);

        System.out.println("Molimo Vas unesite Vasu lozinku: ");
        String password = s.next();
        System.out.println(password);

        Korisnik novi = new Korisnik(korisnickoIme, password);

        System.out.println("Molimo Vas da unesite ime banke:");
        s.nextLine();
        String imeBanke = s.nextLine();
        System.out.println(imeBanke);
        System.out.println("Unesite broj racuna:");
        String brR = s.next();
        System.out.println(brR);
        //Ovo je potpuno besmisleno , treblo bi pristupiti stvarnim bankovnim racunima, makar preko neke sifre,
        //ne da korisnik unosi cifru, osim ako aplikacija ne funkcionise samo kao podsetnik
        System.out.println("Unesite koliko trenutno imate novca na tom racunu:");
        Double trenutnoNaRacunu = s.nextDouble();
        System.out.println(brR);

        RacunUBanci racun = new RacunUBanci(imeBanke,brR,trenutnoNaRacunu);
        ArrayList<RacunUBanci> nizRacuna = new ArrayList<>();
        nizRacuna.add(racun);

        Nalog nalog = new Nalog(ime, prezime, korisnickoIme, password, nizRacuna);
        bazaNaloga.add(nalog);

        meni(nalog);
    }

    public static void logIn(ArrayList<Nalog> bazaNaloga) {
        System.out.println("Molimo Vas unesite korisnicko ime:");
        String korisnickoIme = s.next();
        System.out.println(korisnickoIme);

        for (Nalog k : bazaNaloga) {
            if (!k.getKorisnickoIme().equals(korisnickoIme)) {
                System.out.println("Ne postoji nalog sa tim korisnickim imenom.");
            } else {
                System.out.println("Molimo Vas unesite Vasu lozinku: ");
                String password = s.next();
                System.out.println(password);

                int i = 1;
                while (i == 3) {
                    if (!k.getPassword().equals(password)) {
                        System.out.println("Lozinka je neispravna.");
                        i++;
                    } else {
                        meni(k);
                    }
                }
            }
        }
    }

    public static void meni(Nalog k){
        System.out.println("Da biste izabrali 'Uvid u stanje na racunu' izaberite: 1");
        System.out.println("Da biste dodali novi racun, izaberite 2");
        System.out.println("Da biste dodali novi racun, izaberite 3");
        System.out.println("Da biste izasli iz menija izaberite: 4");

        int opcija = s.nextInt();

        while(opcija != 4){

            switch(opcija){
                case 1:
                    System.out.println("Odaberite racun, ispisite broj racuna");
                    String brR = s.next();
                    System.out.println();
                    break;
                case 4:
                    break;
            }
            System.out.println("Odaberite ponovo opciju na meniju.");
            opcija = s.nextInt();
        }

    }
}

