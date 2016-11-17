package vendingmachine

import org.scalatest.{Matchers, FunSuite}

/**
  * Created by Ben
  */
class BubblegumMachineTest extends FunSuite with Matchers {

  test("A vending machine can be created") {
    val vendingMachine = new BubblegumMachine(100)

    assert(vendingMachine != null)
  }

  test("Initial stock is set correctly") {
    val vendingMachine = new BubblegumMachine(10)
    assert(vendingMachine.stock == 10)
  }

  test("Stock is decreased when selling an item") {
    val vendingMachine = new BubblegumMachine(10)
    vendingMachine.sellItem
    assert(vendingMachine.stock == 9)
  }

  test("Stock can't be below zero") {
    val vendingMachine = new BubblegumMachine(1)
    vendingMachine.sellItem
    vendingMachine.sellItem
    assert(vendingMachine.stock == 0)
  }

  test("Cannot buy when stock is zero") {
    val vendingMachine = new BubblegumMachine(1)
    vendingMachine.sellItem
    val result = vendingMachine.sellItem
    assert(result == null)
  }

  //with Matchers:
  test("A vending machine can be created 2") {
    val vendingMachine = new BubblegumMachine(100)

    vendingMachine should not be null
  }

  test("Cannot buy when stock is zero 2") {
    val vendingMachine = new BubblegumMachine(1)
    vendingMachine.sellItem should not be (null)
    vendingMachine.sellItem should be (null)
  }




}
