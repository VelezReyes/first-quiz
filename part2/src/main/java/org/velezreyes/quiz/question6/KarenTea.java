package org.velezreyes.quiz.question6;

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
