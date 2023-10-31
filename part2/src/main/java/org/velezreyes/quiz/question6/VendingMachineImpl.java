package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

    private static VendingMachineImpl instance = null;

    private DrinkImpl drink;
    private int amount;

    public VendingMachineImpl() {
        this.amount = 0;
    }

    public static VendingMachine getInstance() {
        if (instance == null) {
            VendingMachineImpl.instance = new VendingMachineImpl();
        }
        return VendingMachineImpl.instance;
    }

    @Override
    public void insertQuarter() {
        amount += 25;
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        if (amount < 75) {
            throw new NotEnoughMoneyException();
        } else if (amount == 75) {
            if (name.equalsIgnoreCase("ScottCola")) {
                drink = new DrinkImpl("ScottCola", true);
                amount = 0;
                return drink;
            } else if (name.equalsIgnoreCase("KarenTea")) {
                throw new NotEnoughMoneyException();
            }
            throw new UnknownDrinkException();
        } else {
            if (name.equalsIgnoreCase("KarenTea")) {
                drink = new DrinkImpl("KarenTea", false);
                amount = 0;
                return drink;
            }
            throw new UnknownDrinkException();
        }
    }
}
