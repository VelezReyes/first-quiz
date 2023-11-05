package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

    private static VendingMachine instance;

    private int moneyInserted;

    public static VendingMachine getInstance() {
        if (instance == null) {
            instance = new VendingMachineImpl();
        }
        return instance;
    }

    private VendingMachineImpl() {
        this.moneyInserted = 0;
    }

    @Override
    public void insertQuarter() {
        this.moneyInserted += 25;
    }

    private static final int scottColaPrice = 75;
    private static final int karenTeaPrice = 100;

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        if (name.equals("ScottCola")) {
            int price = scottColaPrice;
            if (moneyInserted >= price) {
                moneyInserted -= price;
                return new ScottCola();
            } else {
                throw new NotEnoughMoneyException();
            }
        } else if (name.equals("KarenTea")) {
            int price = karenTeaPrice;
            if (moneyInserted >= price) {
                moneyInserted -= price;
                return new KarenTea();
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            throw new UnknownDrinkException();
        }
    }
}
