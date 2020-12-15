package markov;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkovDataTest {


	@Test
	public void test() {
		String s = "Voici un petit message";
		MarkovData data = new MarkovData();
		data.learnWord("Voici", s);

		boolean result = data.renforceWord("Voici", s);
		assertTrue(result);
	}

	@Test
	public void testRead() {
		MarkovData data = new MarkovData();
		String s = "Voici un petit message";

		String expected = s;
		String actual = data.getKeyWord(0)+" "+data.getKeyWord(1)+" "+data.getKeyWord(2)+" "+data.getKeyWord(3);
		boolean result = data.renforceWord("Voici", s);
		assertTrue(result);
	}

}
