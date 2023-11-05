package org.velezreyes.quiz.question6;

public interface VendingMachine {
    void insertQuarter();
    Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException;
}
