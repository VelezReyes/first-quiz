package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine{

  private Integer balance;

  public VendingMachineImpl() {
    balance = 0;
  }
  public static VendingMachine getInstance() {

    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    balance += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (balance >= 75){
      return ""
    }
    return null;
  }
}
