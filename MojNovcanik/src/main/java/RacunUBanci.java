import java.util.Scanner;

public class RacunUBanci {
    Scanner s = new Scanner(System.in);

    private String imeBanke;
    private String brojRacuna;
    private double stanjeNaRacunu;

    public RacunUBanci(String imeBanke, String brojRacuna, double stanjeNaRacunu) {
        this.imeBanke = imeBanke;
        this.brojRacuna = brojRacuna;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String getImeBanke() {
        return imeBanke;
    }

    public void setImeBanke(String imeBanke) {
        this.imeBanke = imeBanke;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Vas racun se nalazi u ").append(imeBanke).append(" banci.\n");
       sb.append("Broj racuna je: ").append(brojRacuna).append("\n");
       sb.append("Trenutno stanje na Vasem racunu iznosi: ").append(stanjeNaRacunu);
       return sb.toString();
    }

    public void uplataNaRacun(){
        System.out.println("Upisite koliko novca uplacujete na racun.");
        setStanjeNaRacunu(stanjeNaRacunu+s.nextDouble());
        System.out.println("Vase stanje na racunu sada iznosi"+stanjeNaRacunu);
    }

}
