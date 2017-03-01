package commandpattern;
/**
 * 
 * @author Administrator
 *
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		
	      Stock abcStock = new Stock("中国中车",1000);

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);

	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);

	      broker.placeOrders();
	}
}
