package ro.bogdanpanea.test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTotalValue implements Runnable {

    private List<Package> packages = new ArrayList<>();
    private int totalValue;

    public CalculateTotalValue(List<Package> packages) {
        this.packages = packages;
    }

    public int totalValue() {

        for (Package p : packages) {
            totalValue += p.getValue();

        }

        return totalValue;
    }

    public void run() {
        System.out.println("Valoarea totala a coletelor este " + totalValue() + " RON");
    }
}
