package ro.bogdanpanea.test;

public class Truck implements Runnable {

    private DataAboutGroupedPackage dataAboutGroupedPackage;

    public Truck(DataAboutGroupedPackage dataAboutGroupedPackage) {
        this.dataAboutGroupedPackage = dataAboutGroupedPackage;
    }

    public DataAboutGroupedPackage getDataAboutGroupedPackage() {
        return dataAboutGroupedPackage;
    }

    public void run() {

        System.out.println("-------------------------- Incepe livrarea --------------------------" + System.lineSeparator() + "[Delivering for <" + getDataAboutGroupedPackage().getDestination() + "> and date <" + getDataAboutGroupedPackage().getDate() + "> in <" + getDataAboutGroupedPackage().getDeliveryTime() + "> seconds]" + System.lineSeparator());

        try {
            Thread.sleep(dataAboutGroupedPackage.getDeliveryTime() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------------- Livrare finalizata -----------------------" + System.lineSeparator() + "[Delivering for <" + getDataAboutGroupedPackage().getDestination() + "> and date <" + getDataAboutGroupedPackage().getDate() + "> in <" + getDataAboutGroupedPackage().getDeliveryTime() + "> seconds]" + System.lineSeparator());
    }

}
