package com.company;

public class PostInfo {

    private String city;
    private int zipNumber;

    public PostInfo(int zipNumber, String city) {
        this.zipNumber = zipNumber;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public int getZipNumber() {
        return zipNumber;
    }

    @Override
    public String toString(){
        return "By: " + city + "\nPostnummer: " + zipNumber;
    }

}
