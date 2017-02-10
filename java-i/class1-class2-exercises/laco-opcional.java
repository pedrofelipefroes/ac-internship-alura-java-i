class LacoOpcional {
	public static void main (String[] args) {
		int x = 13;

		while (true) {
			System.out.print(x);
			if (x == 1) {
				System.out.print("\n");
				break;
			} else if (x%2 == 0) {
				x = x/2;
			} else {
				x = 3*x + 1;
			}
			System.out.print(" > ");
		}
	}
}