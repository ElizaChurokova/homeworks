package com.company;

public class Country {
private int id;
private String name;
private int countryCode;
private int countryPopulation;

    public Country(int id, String name, int countryCode, int countryPopulation) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.countryPopulation = countryPopulation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }
}
