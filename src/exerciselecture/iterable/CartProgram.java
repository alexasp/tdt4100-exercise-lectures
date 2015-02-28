package exerciselecture.iterable;

import programs.Item;


public class CartProgram {

	public static void main(String[] args){
	
		ShoppingCart cart = new ShoppingCart();
		
		cart.add(new Item());
		cart.add(new Item());
		cart.add(new Item());
		
		for(Item currentItem : cart){
			//bruk currentItem-objektet
			
			System.out.println(currentItem);
		}
	
	}
	
}
