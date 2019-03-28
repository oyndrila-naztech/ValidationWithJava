package ValidPhoneEmail;

import java.util.Scanner;

public class phoneno {

	public static String validphn() {
		String phone = "01555113425";
		int x = phone.length();

		if (x == 11) {
			if (phone.startsWith("017") || phone.startsWith("015") || phone.startsWith("013") || phone.startsWith("014")
					|| phone.startsWith("018")) {
				return "Phone number is Correct";
//				System.out.println("Phone number is Correct");
			} else {
				return "Phone number is InCorrect for 017";
//				System.out.println("Phone number is InCorrect for 017");
			}
		} else {
			return "Phone number is invalid fro lenth";
//			System.out.println("Phone number is invalid fro lenth");
		}
	}

}
