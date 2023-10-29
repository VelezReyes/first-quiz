package org.velezreyes.quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.velezreyes.quiz.question6.Drink;
import org.velezreyes.quiz.question6.NotEnoughMoneyException;
import org.velezreyes.quiz.question6.UnknownDrinkException;
import org.velezreyes.quiz.question6.VendingMachine;
import org.velezreyes.quiz.question6.VendingMachineImpl;

public class Question6Test {

  @Test
  public void canCreateVendingMachineInstance() {
    VendingMachine vm = VendingMachineImpl.getInstance();
    assertNotNull(vm);
  }

  @Test
  public void drinkNotFree() {
    VendingMachine vm = VendingMachineImpl.getInstance();

    Exception exception = assertThrows(NotEnoughMoneyException.class, () -> {
      vm.pressButton("ScottCola");
    });
  }

  @Test
  public void canGetScottColaFor75Cents() throws Exception {
    VendingMachine vm = VendingMachineImpl.getInstance();

    vm.insertQuarter();
    vm.insertQuarter();
    vm.insertQuarter();

    Drink drink = vm.pressButton("ScottCola");
    
    assertTrue(drink.isFizzy());
    assertEquals(drink.getName(), "ScottCola");
  }

  public void machineResets() throws Exception {
    VendingMachine vm = VendingMachineImpl.getInstance();

    vm.insertQuarter();
    vm.insertQuarter();
    vm.insertQuarter();

    Drink drink = vm.pressButton("ScottCola");
    assertNotNull(drink);

    Exception exception = assertThrows(NotEnoughMoneyException.class, () -> {
      vm.pressButton("ScottCola");
    });
  }

  @Test
  public void canGetKarenTeaForOneDollar() throws Exception {
    VendingMachine vm = VendingMachineImpl.getInstance();

    vm.insertQuarter();
    vm.insertQuarter();
    vm.insertQuarter();

    // Test that KarenTea costs more than 75 cents.
    assertThrows(NotEnoughMoneyException.class, () -> {
      vm.pressButton("KarenTea");
    });

    vm.insertQuarter();

    Drink drink = vm.pressButton("KarenTea");
    assertFalse(drink.isFizzy());
    assertEquals(drink.getName(), "KarenTea");
  }

  @Test
  public void otherDrinksUnknown() throws Exception {
    VendingMachine vm = VendingMachineImpl.getInstance();

    vm.insertQuarter();
    vm.insertQuarter();
    vm.insertQuarter();
    vm.insertQuarter();

    assertThrows(UnknownDrinkException.class, () -> {
      vm.pressButton("BessieBooze");
    });
  }
}
