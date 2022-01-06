package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String originCountry;

    public Builder(String name, String surname, String education, String birthday, boolean hasTools, String originCountry) {
        super(name, surname, education, birthday, hasTools);
        this.originCountry = originCountry;
    }

    public void builtUp(House house, int stockNumber) {
        house.addStock(stockNumber);
    }
}
