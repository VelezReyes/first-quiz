package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine, Drink {

    // Variable to keep track of the money that has been inserted.
    private static int insertedMoney = 0;

    // Variable that specifies the drink name.
    private String drinkName;

    // Variable that can either be true or false if the drink is fizzy or not.
    private boolean fizzy;

    // Returns the name of the instance of the drink
    @Override
    public String getName() {
        return drinkName;
    }

    // Returns either true or false depending if the drink is Fizzy or not.
    @Override
    public boolean isFizzy() {
        return fizzy;
    }

    // Constructor for creating a VendingMachine instance 
    public VendingMachineImpl() {}

    // Constructor for building drinks
    public VendingMachineImpl(String drinkName, boolean fizzy) {
        this.drinkName = drinkName;
        this.fizzy = fizzy;
    }

    // Static method to obtain an instance of the VendingMachine
    public static VendingMachine getInstance() {
        return new VendingMachineImpl();
    }

    // Here I used @Override to re-implement the already declared
    // methods 'insertQuarter' and 'pressButton' in the parent Vending Machine class

    // This method adds a quarter($25) to the 'insertedMoney' class variable.
    @Override
    public void insertQuarter() {
        VendingMachineImpl.insertedMoney += 25;
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        // Check if the requested drink name is 'ScottCola' 
        if (name == "ScottCola") {
            // Validate if there's enough money for this drink
            if (VendingMachineImpl.insertedMoney < 75) {
                throw new NotEnoughMoneyException();
            } else if (VendingMachineImpl.insertedMoney >= 75) {
                // Subtract $75 to the 'insertedMoney' variable and return an instance of this drink
                insertedMoney -= 75;
                Drink drink = new VendingMachineImpl(name, true);
                return drink;
            }
            // Ultimately check if the requested drink name is 'KarenTea'
        } else if (name == "KarenTea") {
            // Validate if there's enough money for this drink
            if (VendingMachineImpl.insertedMoney < 100) {
                throw new NotEnoughMoneyException();
            } else if (VendingMachineImpl.insertedMoney >= 100) {
                // Subtract $100 to the 'insertedMoney' variable and return an instance of this drink
                insertedMoney -= 100;
                Drink drink = new VendingMachineImpl(name, false);
                return drink;
            }
        } else {
            // Raise an exception for unknown drinks.
            throw new UnknownDrinkException();
        }
        return null;
    }
}
