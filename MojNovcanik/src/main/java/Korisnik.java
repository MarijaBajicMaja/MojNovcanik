import java.util.ArrayList;
//Cini mi se da je ova klasa suvisna i da je trebalo na pocetku napraviti samo nalog
public class Korisnik {
    private String ime;
    private String prezime;
    private String korisnickoIme;
    private String password;


    public Korisnik(String ime, String prezime, String korisnickoIme, String password) {
        boolean validanPassword = daLiJePasswordValidan();
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.password = password;
    }
    public Korisnik(String korisnickoIme, String password) {
        this.korisnickoIme = korisnickoIme;
        this.password = password;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public boolean daLiJePasswordValidan(){
        return true;
    }
}
