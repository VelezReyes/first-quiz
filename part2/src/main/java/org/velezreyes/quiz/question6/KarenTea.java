package org.velezreyes.quiz.question6;
/**
 * The `KarenTea` class represents a type of drink called "KarenTea."
 * It implements the `Drink` interface and provides information about the
 * name, price (static), and fizziness of the tea.
 */
public class KarenTea implements Drink{

    public KarenTea() {}
    @Override
    public String getName() {
        return "KarenTea";
    }


    public static Integer getPrice() {
        return 100;
    }

    @Override
    public boolean isFizzy() {
        return false;
    }
}
