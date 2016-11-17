package vendingmachine

/**
 * Created by Ben
 */
object BubblegumApp extends App{

  val bubblegumMachine: VendingMachine[Bubblegum] = new BubblegumMachine(100)

  println(bubblegumMachine.sellItem)

  println(bubblegumMachine.stock)

}
