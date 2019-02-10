package ro.bogdanpanea.test;

public class Main {

    public static void main(String[] args) throws CourrierException {

        CopyFromFileToArray copyFromFileToArray = new CopyFromFileToArray();
        copyFromFileToArray.readFromCSV();
        copyFromFileToArray.printData();


    }
}
