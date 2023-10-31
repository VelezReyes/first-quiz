package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink {
    private String name;
    private boolean isFizzy;
    private double price;

    public DrinkImpl(String name) {
        this.name = name;
        this.isFizzy = false;
        this.price = 0;
    }

    @Override
    public void setFizzy(boolean isFizzy) {
        this.isFizzy = isFizzy;
    }

    @Override
    public boolean isFizzy() {
        return this.isFizzy;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
