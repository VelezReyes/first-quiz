package org.velezreyes.quiz.question6;

public class ScottCola implements Drink{

    public ScottCola(){

    }
    @Override
    public String getName() {
        return "scottCola";
    }

    @Override
    public boolean isFizzy() {
        return true;
    }
}
