public class ClubBouncer {
	public static void main( String[] args ) {
		int age = 1;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "M";

		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
			System.out.println("You are allowed to enter the club.");
		}
		//System.out.println("C-C-C-COMBO BREAKER");
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}
	/*
	1. It does not compile with the message in between the if and else statements.
	*/
