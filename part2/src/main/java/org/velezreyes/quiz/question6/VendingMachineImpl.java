package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  int quarters=0;

  public static VendingMachine getInstance() {

    return new VendingMachineImpl();
  }

  private VendingMachineImpl(){

  }

  public void insertQuarter(){
    quarters = quarters + 1;
  }

  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException{
    if(quarters==0){
      throw new NotEnoughMoneyException(); 
    }else if ( name=="ScottCola" && quarters<3 ){
      throw new NotEnoughMoneyException(); 
    }else if ( name=="ScottCola" && quarters>2 ){
      return new DrinkImpl(name, true);
    }else if ( name=="KarenTea" && quarters<4 ){
      throw new NotEnoughMoneyException(); 
    }else if ( name=="KarenTea" && quarters>3 ){
      return new DrinkImpl(name, false);
    }else{
      throw new UnknownDrinkException();
    }

  }

}
