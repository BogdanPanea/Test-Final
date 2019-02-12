package ro.bogdanpanea.test;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws CourrierException {

        List<Package> packageList = new ArrayList<>();

        CopyFromFileToArray copyFromFileToArray = new CopyFromFileToArray();
        packageList = copyFromFileToArray.readFromCSV();


        GroupPackages groupPackages = new GroupPackages(packageList);
        GroupedPackageSending groupedPackageSending = new GroupedPackageSending(groupPackages.returnGroupOfPackages());
        groupedPackageSending.sendPackage();

        for (Thread thread : groupedPackageSending.getThreads()) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        CalculateTotalValue calculateTotalValue = new CalculateTotalValue(packageList);
        System.out.println("Valoarea totale a coletelor este de " + calculateTotalValue.totalValue() + " RON");


        CalculateTotalRevenue calculateTotalRevenue = new CalculateTotalRevenue(packageList);
        System.out.println("Venituri totale in valoare de " + calculateTotalRevenue.totalRevenue() + " RON");

    }
}
