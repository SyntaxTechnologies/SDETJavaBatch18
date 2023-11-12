package org.class5;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the country");
        String country = scanner.nextLine();
        switch (country.toLowerCase()) {
            case "tajikistan":
                System.out.println("Tajik");
                break;
            case "russia":
                System.out.println("Russian");
                break;
            case "iran":
                System.out.println("Persian");
                break;
            case "spain":
                System.out.println("spanish");
                break;
            case "afghanistan":
                System.out.println("Farsi");
                break;
            default:
                System.out.println("Invalid country");
        }
    }
}