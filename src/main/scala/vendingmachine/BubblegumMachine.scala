package vendingmachine

/**
 * Created by Ben
 */
class BubblegumMachine(override var stock: Int) extends VendingMachine[Bubblegum] {

  override def sellItem: Bubblegum = {
    if(stock == 0) {
      println("Machine is empty")
      return null
    }
    stock = stock -1;
    new Bubblegum("Stimorol", "FreshMint")}
}
