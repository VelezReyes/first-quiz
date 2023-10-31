package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

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

        if ("ScottCola".equals(name) || "KarenTea".equals(name)) {

            if ("ScottCola".equals(name) && balance == ScottCola.getPrice()) {
                balance -= ScottCola.getPrice();
                return new ScottCola();

            } else if ("KarenTea".equals(name) && balance == KarenTea.getPrice()) {
                balance -= KarenTea.getPrice();
                return new KarenTea();

            } else {
                throw new NotEnoughMoneyException();
            }

        } else {
            throw new UnknownDrinkException();
        }
    }
}
