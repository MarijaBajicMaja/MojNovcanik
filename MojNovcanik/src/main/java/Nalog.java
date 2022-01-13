import java.util.ArrayList;

public class Nalog extends Korisnik {
    private ArrayList<RacunUBanci> mojiRacuni;

    public Nalog(String ime, String prezime, String korisnickoIme, String password, ArrayList<RacunUBanci> mojiRacuni) {
        super(ime, prezime, korisnickoIme, password);
        this.mojiRacuni = new ArrayList<>();
    }

    public ArrayList<RacunUBanci> getMojiRacuni() {
        return mojiRacuni;
    }

    public void setMojiRacuni(ArrayList<RacunUBanci> mojiRacuni) {
        this.mojiRacuni = mojiRacuni;
    }

    public void novRacun(RacunUBanci r) {
        mojiRacuni.add(r);
    }

    public void ugasiRacun(RacunUBanci r) {
        if (mojiRacuni.contains(r)) {
            if (r.getStanjeNaRacunu() == 0) {
                mojiRacuni.remove(r);
            }
        }
    }
    public void prebaciSaJednogNaDrugiRacun(RacunUBanci r1, RacunUBanci r2){




    }
}
