/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.StringReverse;

/**
 * @author SANDELS
 *
 */
class TestReverse {

	static StringReverse sr;
	
	@BeforeAll
	static void initiate() {
		sr = new StringReverse();
	}
	
	@Test
	void testNull1() {
		assertNull(sr.reverse(null));
	}
	@Test
	void testNull2() {
		assertEquals("", sr.reverse(""));
	}
	@Test
	void testSingleChar() {
		assertEquals("h", sr.reverse("h"));
	}
	@Test
	void testTwoChars() {
		assertEquals("eh", sr.reverse("he"));
	}
	@Test
	void testMoreThanTwo() {
		assertEquals("olleh", sr.reverse("hello"));
	}
}
