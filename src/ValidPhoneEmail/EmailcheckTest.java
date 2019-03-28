package ValidPhoneEmail;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailcheckTest {

	@Test
	void test() {
		
		EmailCheck email = new EmailCheck();
	    assertEquals("valid",email.emailaddress());
	}

}
