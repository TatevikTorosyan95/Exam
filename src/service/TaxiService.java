package service;

import model.Taxi;

import java.util.Scanner;

public class TaxiService {
    public Taxi create() {
        Scanner s = new Scanner(System.in);

        System.out.println(" name of the car (Any not empty string)");
        String model = s.next();

        System.out.println("country the car belongs to (Any not empty string)");
        String country = s.next();

        System.out.println("year of publishing  (from 1903 to 2020)");
        int year = s.nextInt();

        System.out.println("milage (from 0 to 999999)");
        int milage = s.nextInt();

        System.out.println("weight of car (from 1000 KG to 3000 KG)");
        int weight = s.nextInt();

        System.out.println("maximal speed per hour (220 km/h)");
        int topSpeed = s.nextInt();

        System.out.println("number of seats (any not negative value)");
        short seats = s.nextShort();

        System.out.println("cost of the car (ex: 445.6$) (any not negative value)");
        double cost = s.nextDouble();

        System.out.println("is sport or not");
        boolean isSport = s.next().charAt(0) == 'y';

        Taxi taxi = new Taxi();
        taxi.setModel(model);
        taxi.setCountry(country);
        taxi.setYear(year);
        taxi.setMilage(milage);
        taxi.setWeight(weight);
        taxi.setTopSpeed(topSpeed);
        taxi.setSeats(seats);
        taxi.setCost(cost);
        taxi.setSport(isSport);
        return taxi;
    }

    public void isTaxiSport(Taxi t1) {
        if (t1.isSport()){
            System.out.println("Cost: " + t1.getCost() + " Top Spped: " + t1.getTopSpeed());
        } else {
            System.out.println("Model: " + t1.getModel() + " Country: " + t1.getCountry());
        }
    }

    public Taxi newerTaxi(Taxi t1, Taxi t2) {
        return t1.getYear() >= t2.getYear() ? t1 : t2;
    }

    public void withSmallestSeatsCountry(Taxi t1, Taxi t2, Taxi t3) {
        Taxi smallestSeats = t2.getSeats() <= t3.getSeats() ? t2 : t3;
        if (smallestSeats.getSeats() <= t1.getYear()) {
            System.out.println(t1.getCountry());
        } else {
            System.out.println(smallestSeats.getCountry());
        }
    }

    public void notSport(Taxi[] taxis) {
        for (Taxi taxi : taxis) {
            if (!taxi.isSport()) {
                taxi.taxiInfo();
            }
        }
    }

    public void sportTaxiMoreThan50000km(Taxi[] taxis) {
        for (Taxi taxi : taxis) {
            if (taxi.isSport() && taxi.getMilage() > 50000) {
                taxi.taxiInfo();
            }
        }
    }

    public Taxi minimalWeight(Taxi[] taxis) {
        Taxi min = taxis[0];
        for (int i = 1; i < taxis.length; i++) {
            if (min.getWeight() >= taxis[i].getWeight()) {
                min = taxis[i];
            }
        }
        return min;
    }

    public Taxi minimalCost(Taxi[] taxis) {
        Taxi t = null;
        for (int i = 0; i < taxis.length; i++) {
            if (taxis[i].isSport()) {
                if (t == null) {
                    t = taxis[i];
                    continue;
                }
                if (t.getCost() >= taxis[i].getCost())
                    t = taxis[i];
            }
        }
        return t;
    }

    public Taxi[] orderByYear(Taxi[] taxis) {
        boolean isActive = true;
        int count = 0;
        while (isActive) {
            isActive = false;
            for (int i = 0; i < taxis.length-1-count; i++) {
                if (taxis[i].getYear() > taxis[i+1].getYear()) {
                    Taxi temp = taxis[i];
                    taxis[i] = taxis[i+1];
                    taxis[i+1] = temp;
                    isActive = true;
                }
            }
            count++;
        }
        return taxis;
    }
}
