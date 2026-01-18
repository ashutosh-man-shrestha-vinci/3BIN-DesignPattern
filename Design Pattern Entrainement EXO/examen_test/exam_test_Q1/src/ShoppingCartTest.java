public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);

		//pay by paypal
        Strategy paypal = new Paypal("123","ashutosh@gmail.com");
		cart.payWith(paypal);
		
		ShoppingCart cart2 = new ShoppingCart();
		
		cart2.addItem(item1);
		cart2.addItem(item1);
		//pay by credit card
        Strategy creditCard = new Credit("123","ashutosh@gmail.com","12");

        cart2.payWith(creditCard);

	}

}