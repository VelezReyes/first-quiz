package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {
  private double quarters;

  private VendingMachineImpl() {
      this.quarters = 0;
  }

  public double getQuarters() {
    return quarters;
  }

  public void setQuarters(double quarters) {
    this.quarters = quarters;
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    this.quarters += 0.25;
  }

  private void setData(Drink drink, String name) throws UnknownDrinkException {
    if (name.equals("ScottCola")) {
      drink.setFizzy(true);
      drink.setPrice(0.45);
    } else if (name.equals("KarenTea")) {
      drink.setFizzy(false);
      drink.setPrice(1.0);
    } else {
      throw new UnknownDrinkException();
    }
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    Drink drink = new DrinkImpl(name);

    setData(drink, name);

    if (this.quarters < drink.getPrice()) {
      throw new NotEnoughMoneyException();
    }

    return drink;
  }
}
