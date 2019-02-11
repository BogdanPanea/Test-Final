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
        Thread t = new Thread(calculateTotalValue);
        t.start();


        CalculateTotalRevenue calculateTotalRevenue = new CalculateTotalRevenue(packageList);
        Thread t1 = new Thread(calculateTotalRevenue);
        t1.setPriority(4);
        t1.start();

    }
}
