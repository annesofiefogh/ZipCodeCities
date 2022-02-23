package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileHandler fh = new FileHandler();
        ArrayList<PostInfo> listOfZipNumberAndCities = fh.fileDataToObjects();

        System.out.println("Hvilken by til hvilket postnummer?");
        System.out.print("Skriv venligst et postnummer her: ");
        int userZipNumber = sc.nextInt();

        String zipNumberCity = "";

        for (int i = 0; i < listOfZipNumberAndCities.size(); i++) {
            if (listOfZipNumberAndCities.get(i).getZipNumber() == userZipNumber) {
                zipNumberCity = listOfZipNumberAndCities.get(i).getCity();
            }
        }
        if (zipNumberCity.equals("")) {
            System.out.println("Ingen by fundet");
        } else {
            System.out.println("By: " + zipNumberCity);
        }

        //Alternative: print toString from PostInfo
        /*for (int i = 0; i < listOfZipNumberAndCities.size(); i++) {
            if (listOfZipNumberAndCities.get(i).getPostalCode() == userZipNumber) {
                System.out.println(listOfZipNumberAndCities.get(i));
                break;
            }
        }*/
    }
}
