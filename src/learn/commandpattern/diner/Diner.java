package learn.commandpattern.diner;

public class Diner {
	
	public static void main(String[] args) {
		Cook cook = new Cook();
		Waitress waitress = new Waitress();
		Customer customer = new Customer(waitress);
		Order order = new BurgerAndShakeOrder(cook);
		
		customer.createOrder(order);
		customer.compeleteOrder();
		
	}
	
}
