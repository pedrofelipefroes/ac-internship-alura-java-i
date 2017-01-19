class Program {
	public static void main (String[] args) {

		// visiting

		int ageJohn =  18;
		int ageMary = 21;

		int ageSum = ageJohn + ageMary;
		System.out.println(ageSum);

		double pi = 3.1415;
		double piDouble = 2*pi;
		System.out.println(piDouble);

		boolean friend = true;
		boolean enemy = !friend;
		boolean underage = ageJohn <= 18; //true

		char letter = 'M';

		String fullName = "John Wayne";

		int smallNum = 3200;
		long longNum = 99999999999999L;
		float pi = 3.14; // we can assign int to long, but not the other way around

		long copyNum = (int) longNum; // casting

		boolean friendOfOwner = true;

		// conditionals

		if (ageJohn >= 18 && friendOfOwner) {
			System.out.println("Have fun!");
		} else {
			System.out.println("Go home!");
		}

		// loops

		for (int i = 0; i < 5; i++) {
			System.out.println("Congrats on your " + i + "th birthday!");
		}

		int j = 1;

		while (j <= 5) {
			if (j%2 == 0) {
				System.out.println("Congrats on your " + i + "th birthday!");
				j++;
			}
		}

		
	}
}