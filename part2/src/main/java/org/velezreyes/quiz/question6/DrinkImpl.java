package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink {

  private String name;
  private boolean fizzines;

  public DrinkImpl(String name_s, boolean fizzines_s ){
    name=name_s;
    fizzines=fizzines_s;
  }

  public String getName(){
    return name;
  }

  public boolean isFizzy(){
    return fizzines;
  }

}