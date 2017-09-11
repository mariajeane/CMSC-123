class JeepneyTrip {
  double distance;
  int totalPassenger;
  int discountPassenger;
  
  // constants
  final double BASE_KM = 5.0;
  final double EXCESS_FARE = 0.5;
  final double DISCOUNTED_FARE = 6.0;
  final double BASE_FARE = 7.0;
  
  JeepneyTrip(double distance, int totalPassenger, int discountPassenger) {
    this.distance = distance;
    this.totalPassenger = totalPassenger;
    this.discountPassenger = discountPassenger;
  }
  
  /* -> double
   * Computes the excess distance and fare of this JeepneyTrip given the excess
   * fare for every kilometer greater than 5.
   */
  
  /* double excessDistance() {
   *   return 0.0;
   * }
   */
     
  double excessDistance() {
    if (this.distance > BASE_KM) {
      return ((this.distance - BASE_KM) * EXCESS_FARE);
    } else {
      return 0.0;
    }
  }
  
  /* -> int
   * Computes the number of regular passengers in this JeepneyTrip.
   */
  
  /* int regularPassenger() {
   *   return 0;
   * }
   */
  
  int regularPassenger() {
    return (this.totalPassenger - this.discountPassenger);
  }
  
  /*  -> double
   * Computes the total fare of the passengers in this JeepneyTrip
   */
  
  /* double totalFare() {
   *   return 0.0;
   * }
   */
  
  double totalFare() {
    return ((regularPassenger() * BASE_FARE) + (regularPassenger() * excessDistance())) 
              + ((this.discountPassenger * DISCOUNTED_FARE) + (this.discountPassenger * excessDistance()));
  }
  
  /* double -> double
   * Computes the change of a passeneger given a payment.
   */
  
  /* double fareChange(double payment) {
   *   return 0.0;
   * }
   */
  
  double fareChange(double payment) {
    return payment - totalFare();
  }
}