package org.velezreyes.quiz.question6;

/**
 * The `ScottCola` class represents a type of drink called "ScottCola."
 * It implements the `Drink` interface and provides information about the
 * name, price (static), and fizziness of the drink.
 */
public class ScottCola implements Drink{

    public ScottCola(){}
    @Override
    public String getName() {
        return "ScottCola";
    }


    public static Integer getPrice() {
        return 75;
    }

    @Override
    public boolean isFizzy() {
        return true;
    }
}
