package practice;

import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fuel;
        do {
            System.out.print("Enter the quantity of fuel in Liters: ");
             fuel = sc.nextInt();
             if(fuel < 0) System.out.println("Please enter a positive value this time");
        }while(fuel <= 0);
        System.out.println(fuel);
        int dist;
        do {
            System.out.print("Enter the distance covered in "+ fuel + "L of fuel: ");
            dist = sc.nextInt();
            if(dist <= 0) System.out.println("Please enter the positive value for distance.");
        }while(dist <= 0);
        System.out.println(dist);

        double mileagePer100Km = ((double)fuel/dist) * 100;
        System.out.println("The fuel consumption is: "+ String.format("%.2f", mileagePer100Km)+" Liters per 100 km");
        double mileageMilesPerGalon = (dist*0.6214) / (fuel*0.2642);
        System.out.println("The fuel consumption is: "+ String.format("%.2f", mileageMilesPerGalon) + " miles per 100 galon");
    }
}
