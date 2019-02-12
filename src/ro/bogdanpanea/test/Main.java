package ro.bogdanpanea.test;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws CourrierException {

        List<Package> packageList = new ArrayList<>();

        CopyFromFileToArray copyFromFileToArray = new CopyFromFileToArray();
        packageList = copyFromFileToArray.readFromCSV();


        GroupPackages groupPackages = new GroupPackages(packageList);
        PackageSending packageSending = new PackageSending(groupPackages.returnGroupOfPackages());
        packageSending.sendTruck();

        for (Thread thread : packageSending.getThreads()) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        CalculateTotalValue calculateTotalValue = new CalculateTotalValue(packageList);
        System.out.println(calculateTotalValue.totalValue());


        CalculateTotalRevenue calculateTotalRevenue = new CalculateTotalRevenue(packageList);
        System.out.println(calculateTotalRevenue.totalRevenue());

    }
}
