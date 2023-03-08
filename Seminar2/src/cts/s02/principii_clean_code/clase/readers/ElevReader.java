package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {

    @Override
    public List<Aplicant> readAplicants(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Elev elev = new Elev();
            super.readAplicant(input, elev);
            int clasa = input.nextInt();
            String tutore = input.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }
        input.close();
        return elevi;
    }
}
