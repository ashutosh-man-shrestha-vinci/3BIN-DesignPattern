public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		 Paiement bycard = new PaiementByCart("2121","az",12);

        Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
        Paiement byPaypal = new PaiementbyPaypal("az","ash");

        cart.addItem(item1);
		cart.addItem(item2);

		//pay by paypal
        cart.pay(byPaypal);

		ShoppingCart cart2 = new ShoppingCart();
		
		cart2.addItem(item1);
		cart2.addItem(item1);
		//pay by credit card
		cart2.pay(bycard);

	}

}