import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Strategy strategy;
	private List<Item> items;
	
	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}

	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public void payWith(Strategy strategy){
		if(items.isEmpty()) throw new RuntimeException("Your shopping cart is empty");
		int amount = 0;
		for(Item item : items){
			amount += item.getPrice();
		}

        strategy.paywith(amount);


		items= new ArrayList<Item>();
		System.out.println("Thank you and goodbye");
		System.out.println("------------------");
	}
	

}