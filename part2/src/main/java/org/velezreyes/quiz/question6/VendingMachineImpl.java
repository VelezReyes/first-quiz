package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private int insertedQuarters;

  private static final VendingMachineImpl instance = new VendingMachineImpl();

  private VendingMachineImpl() {
    this.insertedQuarters = 0;
  }

  public static VendingMachine getInstance() {
    return instance;
  }

  @Override
  public void insertQuarter() {
    this.insertedQuarters++;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if ("ScottCola".equals(name)) {
      if (this.insertedQuarters >= 3) {
        this.insertedQuarters -= 3;
        return new Cola("ScottCola", true);
      } else {
        throw new NotEnoughMoneyException();
      }
    } else if ("KarenTea".equals(name)) {
      if (this.insertedQuarters >= 4) {
        this.insertedQuarters -= 4;
        return new Tea("KarenTea", false);
      } else {
        throw new NotEnoughMoneyException();
      }
    } else {
      throw new UnknownDrinkException();
    }
  }
}

