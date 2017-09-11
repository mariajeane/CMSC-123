class Item {
  double itemPrice;
  double discount;
  
  //constant
  final int PRICE_LIMIT = 1000;
  
  Item(double itemPrice, double discount) {
    this.itemPrice = itemPrice;
    this.discount = discount;
  }
  
  /* -> double
   * Returns the total discount of this Item.
   */
  
 /* double totalDiscount() {
  *   return 0.0;
  * }
  */
  
  double totalDiscount() {
    return (this.itemPrice * this.discount);
  }
  
  /* -> double
   * Returns the salePrice of an item if the item price is greater than 1000.
   * If not, returns the regular price of the item.
   */
  
 /* double salePrice() {
  *   return 0.0;
  * }
  */
  
  double salePrice() {
    if (this.itemPrice > PRICE_LIMIT) {
      return this.itemPrice - (totalDiscount());
    } else {
      return this.itemPrice;
    }
  }
}
  