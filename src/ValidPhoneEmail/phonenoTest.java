package ValidPhoneEmail;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class phonenoTest {

	@Test
	void testEquals() {
		phoneno mn = new phoneno();
		assertEquals("Phone number is Correct", mn.validphn());

	}

}
