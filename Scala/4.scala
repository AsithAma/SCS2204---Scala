object Question4 {
    val performanceCost = 500;
    val attendeeCost = 3;
    def main(args: Array[String]) = {
        println("The best ticket price is " + bestTicketPrice(10, 140, 0));
    }
    def bestTicketPrice(
                        ticketPrice: Float, 
                        attendance: Int,
                        oldProfit: Float): Float = {
                            val totalCost = performanceCost + (attendance * attendeeCost);
                            val newProfit = (ticketPrice * attendance) - totalCost;

                            if (oldProfit < newProfit) {
                                bestTicketPrice(ticketPrice + 5, attendance - 20, newProfit);
                            } else {
                                ticketPrice - 5;
                            }
                        }
}