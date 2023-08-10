package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        float miles;
        float gallons;
        float mpg;
        Scanner input = new Scanner(System.in);

        System.out.println("Miles Driven: ");
        miles = input.nextFloat();

        System.out.println("Gallons Consumed: ");
        gallons = input.nextFloat();

        mpg = miles/gallons;
        System.out.println("Miles-per-Gallon: " + mpg);

    }
}
