package exerciselecture.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import programs.Item;

public class ShoppingCart implements Iterable<Item> {

	List<Item> items = new ArrayList<Item>();

	public void add(Item item){
		items.add(item);
	}
	
	public Item get(int index){
		return items.get(index);
	}
	
	public int cartSize(){
		return items.size();
	}

	@Override
	public Iterator<Item> iterator() {
		return new ShoppingCartIterator(this);
	}

	
}
