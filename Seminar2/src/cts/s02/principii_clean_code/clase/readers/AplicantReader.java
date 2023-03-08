package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicants(String fileName) throws FileNotFoundException;

    public void readAplicant(Scanner scanner,Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nrProiecte = scanner.nextInt();
        String[] denumireProiect = new String[5];
        for (int i = 0; i < nrProiecte; i++)
            denumireProiect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setPunctaj(punctaj);
        aplicant.setVarsta(varsta);
        aplicant.setNrProiecte(nrProiecte,denumireProiect);
    }
}
