package org.velezreyes.quiz.question6;

public class ScottCola implements Drink{

    public ScottCola(){

    }
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
