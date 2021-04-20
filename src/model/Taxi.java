package model;

public class Taxi {
    private String model;
    private String country;
    private int year;
    private int milage;
    private int weight;
    private int topSpeed;
    private short seats;
    private double cost;
    private boolean isSport;

    public String getModel() {
        return model;
    }

    public void setModel(String m) {
        if (m.length() == 0) {
            model = m;
        }
        else {
            System.out.println("Error");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String c) {

        if (c.length() == 0) {
            country = c;
        }
        else {
            System.out.println("Error");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        if (y >=1903 && y <=2020) {
            year = y;
        }
        else {
            System.out.println("Error");
        }

    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int mil) {
        if (mil >=0 && mil <=999999) {
            milage = mil;
        }
        else {
            System.out.println("Error");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int w) {

        if (w >=1000 && w <=3000) {
            weight = w;
        }
        else {
            System.out.println("Error");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int top) {
        if (top >=0 && top <=220) {
            topSpeed = top;
        }
        else {
            System.out.println("Error");
        }
    }

    public short getSeats() {
        return seats;
    }

    public void setSeats(short s) {
        if (s >= 0) {
            seats = s;
        }
        else {
            System.out.println("Error");
        }

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double c) {

        if (c >= 0) {
            cost = c;
        }
        else {
            System.out.println("Error");
        }
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }

    public void taxiInfo() {
        System.out.println("Model:" + model);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Milage: " + milage);
        System.out.println("Weight: " + weight);
        System.out.println("topSpeed: " + weight);
        System.out.println("seats: " + seats);
        System.out.println("Cost: " + cost);
        System.out.println("Is sport: " + (isSport ? "Yes" : "No"));
    }
}
