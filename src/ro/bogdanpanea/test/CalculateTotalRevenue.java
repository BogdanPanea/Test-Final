package ro.bogdanpanea.test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTotalRevenue {

    private List<Package> packages = new ArrayList<>();
    private int totalRevenue;

    public CalculateTotalRevenue(List<Package> packages) {
        this.packages = packages;
    }

    public int totalRevenue() {

        for (Package p : packages) {
            totalRevenue += p.getTargetDistance();

        }

        return totalRevenue;
    }
}
