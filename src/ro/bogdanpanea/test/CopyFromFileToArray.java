package ro.bogdanpanea.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyFromFileToArray {

    private String csvFile = "SourceFile" + File.separator + "PackageData.csv";
    private String line = "";
    private String cvsSplitBy = ",";
    private List<Package> packages = new ArrayList<>();

    List<Package> readFromCSV() throws CourrierException {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] packageDetails = line.split(cvsSplitBy);
                checkLine(packageDetails);
                packages.add(new Package(packageDetails[0], Integer.parseInt(packageDetails[1]),Integer.parseInt(packageDetails[2]), packageDetails[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return packages;

    }

    private void checkLine(String[] line) throws CourrierException {
        if (line.length != 4) {
            throw new CourrierException("Linia nu contine toate informatiile despre pachet !", "Linie invalida.");
        }
    }

    void printData() {
        for (Package a : packages) {
            System.out.println(a);
        }
    }
}
