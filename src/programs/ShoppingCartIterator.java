package programs;

import java.util.Iterator;

public class ShoppingCartIterator implements Iterator<Item> {

	ShoppingCart cart;
	int index = 0;
	
	public ShoppingCartIterator(ShoppingCart cart){
		this.cart = cart; 
	}
	
	@Override
	public boolean hasNext() {
		return index <= this.cart.cartSize() - 1;
	}

	@Override
	public Item next() {
		Item nextItem = this.cart.get(index);
		index++;
		
		return nextItem;
	}

}
