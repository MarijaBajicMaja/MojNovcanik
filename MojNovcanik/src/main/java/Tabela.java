import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class Tabela {
    public static void popunjavanjeTabele(ArrayList<Korisnik> nizKorisnika){
        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sh1 = wb.createSheet("Moj_novcanik");

        Row r1 = sh1.createRow(0);
        Cell c1 = r1.createCell(0);
        c1.setCellValue("Ime");
        Cell c2 = r1.createCell(1);
        c2.setCellValue("Prezime");
        Cell c3 = r1.createCell(2);
        c3.setCellValue("Korisnicko ime");
        Cell c4 = r1.createCell(3);
        c4.setCellValue("lozinka");
        Cell c5 = r1.createCell(4);
        c5.setCellValue("Racun 1");
        Cell c6 = r1.createCell(5);
        c6.setCellValue("Racun 2");

        int sledeciRedUKojiUpisuje = 1;
        for(Korisnik k : nizKorisnika){
            Row red = sh1.createRow(sledeciRedUKojiUpisuje);
            Cell ime = red.createCell(0);
            Cell prezime = red.createCell(1);
            Cell korisnickoIme = red.createCell(2);
            Cell lozinka = red.createCell(3);

            ime.setCellValue(k.getIme());
            prezime.setCellValue(k.getPrezime());
            korisnickoIme.setCellValue(k.getKorisnickoIme());
            lozinka.setCellValue(k.getPassword());

            sledeciRedUKojiUpisuje++;
        }

        try {
            OutputStream fajl = new FileOutputStream("Moj_novcanik.xls");
            wb.write(fajl);
            wb.close();
        } catch (IOException e) {
            System.out.println("Desila se greska " + e.getMessage());
        }

    }
}
