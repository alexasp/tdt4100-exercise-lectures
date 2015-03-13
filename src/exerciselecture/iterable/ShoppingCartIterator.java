package exerciselecture.iterable;

import java.util.Iterator;

import programs.Item;

public class ShoppingCartIterator implements Iterator<Item> {

	ShoppingCart cart;
	int index = 0;
	
	public ShoppingCartIterator(ShoppingCart cart){
		this.cart = cart; 
	}
	
	@Override
	public boolean hasNext() {
		return index < this.cart.cartSize();
	}

	@Override
	public Item next() {
		Item nextItem = this.cart.get(index);
		index++;
		
		return nextItem;
	}

}
