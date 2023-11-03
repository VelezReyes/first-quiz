package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {
  private int quartersInserted;
  private boolean machineReset;

  public VendingMachineImpl() {
    quartersInserted = 0;
    machineReset = false;
  }

  @Override
  public void insertQuarter() {
    quartersInserted++;
    machineReset = false;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (machineReset) {
      throw new NotEnoughMoneyException();
    }

    if (name.equals("ScottCola")) {
      if (quartersInserted >= 3) {
        machineReset = true;
        quartersInserted -= 3;
        return new ScottCola();
      } else {
        throw new NotEnoughMoneyException();
      }
    } else if (name.equals("KarenTea")) {
      if (quartersInserted >= 4) {
        machineReset = true;
        quartersInserted -= 4;
        return new KarenTea();
      } else {
        throw new NotEnoughMoneyException();
      }
    } else {
      throw new UnknownDrinkException();
    }
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }
}
