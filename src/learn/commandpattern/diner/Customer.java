package learn.commandpattern.diner;

public class Customer {
	Waitress waitress;
	Order order;
	
	public Customer(Waitress waitress){
		this.waitress = waitress;
	}
	
	public void createOrder(Order order){
		this.order = order;
	}
	
	public void compeleteOrder(){
		this.waitress.takeOrder(order);
	}
}
