package vendingmachine

/**
 * Created by Ben
 */
trait VendingMachine[T] {

  var stock: Int

  def sellItem: T
}
