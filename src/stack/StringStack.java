package stack;

import java.util.ArrayList;
import java.util.List;

public class StringStack {

	private ArrayList<String> lagretStrenger = new ArrayList<String>();

	public void push(String streng) {
		lagretStrenger.add(streng);
	}

	public String pop() {
		String verdi = lagretStrenger.remove(lagretStrenger.size() - 1);
		return verdi;
	}

}
