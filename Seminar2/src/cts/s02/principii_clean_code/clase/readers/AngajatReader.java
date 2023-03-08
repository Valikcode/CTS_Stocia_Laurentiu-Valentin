package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {

    @Override
    public List<Aplicant> readAplicants(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(input,angajat);
            int salariu = input.nextInt();
            String ocupatie = input.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input.close();
        return angajati;
    }
}
