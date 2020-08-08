package learn.commandpattern.diner;

public class Waitress {
	
	Order order;
	
	public Waitress(){}
	
	public void takeOrder(Order order){
		this.order = order;
		this.order.orderUp();
	}
}
