package org.velezreyes.quiz.question6;
/**
 * The `VendingMachineImpl` class represents a vending machine that dispenses drinks
 * based on the inserted quarters. It implements the `VendingMachine` interface and
 * provides methods for inserting quarters and selecting drinks.
 */
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

    /**
     * Selects a drink based on its name and available balance. If the selected drink
     * matches "ScottCola" or "KarenTea," and the balance is sufficient, the drink is
     * dispensed, and the balance is adjusted accordingly.
     *
     * @param name The name of the selected drink.
     * @return The selected drink if available.
     * @throws NotEnoughMoneyException if the balance is insufficient.
     * @throws UnknownDrinkException if the selected drink is unknown.
     */
    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {

        if ("ScottCola".equals(name) || "KarenTea".equals(name)) {

            if ("ScottCola".equals(name) && balance.equals( ScottCola.getPrice() ) ) {
                balance -= ScottCola.getPrice();
                return new ScottCola();

            } else if ("KarenTea".equals(name) && balance.equals( KarenTea.getPrice() ) ) {
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
