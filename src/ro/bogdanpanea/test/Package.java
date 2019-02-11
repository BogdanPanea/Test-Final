package ro.bogdanpanea.test;

public class Package {

    private String targetLocation;
    private int targetDistance;
    private int value;
    private String date;

    public Package(String targetLocation, int targetDistance, int value, String date) {
        this.targetLocation = targetLocation;
        this.targetDistance = targetDistance;
        this.value = value;
        this.date = date;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public int getTargetDistance() {
        return targetDistance;
    }

    public int getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Package{" +
                "targetLocation='" + targetLocation + '\'' +
                ", targetDistance=" + targetDistance +
                ", value=" + value +
                ", date='" + date + '\'' +
                '}';
    }
}
