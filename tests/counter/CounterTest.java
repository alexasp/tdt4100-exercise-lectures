package counter;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(
		description="A class that counts from a <b>start</b> to an <b>end</b> value. " +
				"The counting is limited by the constructor and performed by the <b>count()</b> method."
)
public class CounterTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	private void testCounter(Counter counter, int end) {
		while (counter.counter < end) {
			int i = counter.counter;
			counter.count();
			assertEquals(i + 1, counter.counter);
		}
		assertEquals(end, counter.counter);
		counter.count();
		assertEquals(end, counter.counter);
	}
	
	@JExercise(
			tests="Counter(int,int)",
			description="A constructor that initializes class named Counter with the provided start and end value. The <b>counter</b> field should be assigned the start value, and the <b>end</b> field should be assigned the end value."
	)
	public void testCounter() {
		Counter counter = new Counter(1, 3);
		assertEquals(1, counter.counter);
	}
	
	@JExercise(
			tests="count()",
			description="A method that steps the <b>counter</b> field, unless it has reached the value in the <b>end</b> field."
	)
	public void testCount() {
		Counter counter = new Counter(1, 3);
		testCounter(counter, 3);
	}
}
