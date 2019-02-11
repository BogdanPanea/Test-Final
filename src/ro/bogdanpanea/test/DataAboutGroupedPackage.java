package ro.bogdanpanea.test;

public class DataAboutGroupedPackage {

    private String destination;
    private String date;
    private int deliveryTime;
    private int value;
    private int revenue;

    public DataAboutGroupedPackage(String destination, String date, int deliveryTime, int value, int revenue) {
        this.destination = destination;
        this.date = date;
        this.deliveryTime = deliveryTime;
        this.value = value;
        this.revenue = revenue;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public int getValue() {
        return value;
    }

    public int getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "DataAboutGroupedPackage{" +
                "destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", deliveryTime=" + deliveryTime +
                ", value=" + value +
                ", revenue=" + revenue +
                '}';
    }
}
