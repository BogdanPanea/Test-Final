package ro.bogdanpanea.test;

import java.util.ArrayList;
import java.util.List;

public class GroupPackages {

    List<Package> packages = new ArrayList<>();
    List<Package> groupedPackages = new ArrayList<>();
    List<Package> recousivePackages = new ArrayList<>();
    List<DataAboutGroupedPackage> dataAboutGroupedPackages = new ArrayList<>();
    int counter = 0;


    public GroupPackages(List<Package> packages) {
        this.packages = packages;
    }

    public List<DataAboutGroupedPackage> returnGroupOfPackages() {

        counter = packages.size();

        while (counter > 0) {

            groupedPackages = new ArrayList<>();
            recousivePackages = new ArrayList<>();
            int groupValue = 0;
            //int groupRevenue = 0;

            Package t = packages.get(0);
            groupedPackages.add(t);
            groupValue += t.getValue();
            //groupRevenue += t.getTargetDistance();

            for (int i = 1; i < packages.size(); i++) {

                if ((t.getDate().equals(packages.get(i).getDate()) && t.getTargetLocation().equals(packages.get(i).getTargetLocation()))) {
                    groupedPackages.add(packages.get(i));
                    groupValue += packages.get(i).getValue();
                    //groupRevenue += packages.get(i).getTargetDistance();
                } else {
                    recousivePackages.add(packages.get(i));
                }
            }
            dataAboutGroupedPackages.add(new DataAboutGroupedPackage(t.getTargetLocation(), t.getDate(), t.getTargetDistance(), groupValue, t.getValue()));

            if (recousivePackages.size() > 1) {

                packages = new ArrayList<>();
                packages = recousivePackages;
                counter = recousivePackages.size();

            } else if (recousivePackages.size() == 1) {
                dataAboutGroupedPackages.add(new DataAboutGroupedPackage(recousivePackages.get(0).getTargetLocation(), recousivePackages.get(0).getDate(), recousivePackages.get(0).getTargetDistance(), recousivePackages.get(0).getValue(), recousivePackages.get(0).getTargetDistance()));
                packages = new ArrayList<>();
                counter = 0;
            } else {
                packages = new ArrayList<>();
                counter = 0;
            }

            //System.out.println(packages.size());
        }

        return dataAboutGroupedPackages;
    }

    void printData(List<Package> groupedPackages) {
        for (Package a : groupedPackages) {
            System.out.println(a);
        }
    }

    void printDataAboutPackage() {
        for (DataAboutGroupedPackage d : dataAboutGroupedPackages) {
            System.out.println(d);
        }
    }

}
