package ru.job4j.inheritance;

public class House {

    private int stockScore;
    private boolean isSkyscraper;

    public House() {
    }

    public House(int stockScore, boolean isSkyscraper) {
        this.stockScore = stockScore;
        this.isSkyscraper = isSkyscraper;
    }

    public void addStock(int newStocks) {
        this.stockScore += newStocks;
    }
}
