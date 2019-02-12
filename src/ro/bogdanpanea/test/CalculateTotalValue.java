package ro.bogdanpanea.test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTotalValue {

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
}
