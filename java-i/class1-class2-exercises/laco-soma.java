class LacoSoma {
	public static void main (String[] args) {
		int i = 1;
		int sum = 0;

		while (i <= 1000) {
			sum = i + sum;
			i++;
		}

		System.out.println(i+sum);
	}
}