package ru.job4j.inheritance;

public class Builder extends Profession {

    private String originCountry;

    public Builder(String originCountry) {
        super();
        this.originCountry = originCountry;
    }

    public void builtUp(House house, int stockNumber) {
        house.addStock(stockNumber);
    }
}
