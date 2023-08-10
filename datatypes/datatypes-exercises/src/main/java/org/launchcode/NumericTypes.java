package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args){
        double length;
        double height;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle Length: ");
        length = input.nextDouble();

        System.out.println("Rectangle Height: ");
        height = input.nextDouble();

        area = length*height;

        System.out.println("Rectangle's Area: " + area);
    }
}
