package main;

import model.Taxi;
import service.TaxiService;

import java.util.Scanner;

public class TaxiText {
    public static void main(String[] args) {
        TaxiService service = new TaxiService();
        Taxi taxi1 = service.create();
        Taxi taxi2 = service.create();
        Taxi taxi3 = service.create();
        Taxi[] taxis = {taxi1, taxi2, taxi3};

        Scanner s = new Scanner(System.in);

        boolean isActive = true;
        while (isActive) {
            System.out.println("Enter command number");
            System.out.println("1.isTaxiSport");
            System.out.println("2.newerTaxi");
            System.out.println("3.withSmallestSeatsCountry");
            System.out.println("4.notSport");
            System.out.println("5.sportTaxiMoreThan50000km");
            System.out.println("6.minimalWeight");
            System.out.println("7.minimalCost");
            System.out.println("8.orderByYear");

            int a = s.nextInt();
            switch (a) {
                case 1:
                    service.isTaxiSport(taxi1);
                    break;
                case 2:
                    service.newerTaxi(taxi1,taxi2).taxiInfo();
                    break;
                case 3:
                    service.withSmallestSeatsCountry(taxi1,taxi2,taxi3);
                    break;
                case 4:
                    service.notSport(taxis);
                    break;
                case 5:
                    service.sportTaxiMoreThan50000km(taxis);
                    break;
                case 6:
                    service.minimalWeight(taxis).taxiInfo();
                    break;
                case 7:
                    service.minimalCost(taxis).taxiInfo();
                    break;
                case 8:
                    System.out.println(service.orderByYear(taxis));
                    break;
                case 9:
                    isActive = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }

    }
}
