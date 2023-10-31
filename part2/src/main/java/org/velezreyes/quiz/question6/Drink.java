package org.velezreyes.quiz.question6;

public interface Drink {
  String getName();

  static Integer getPrice(){
    return 0;
  }

  boolean isFizzy();
}