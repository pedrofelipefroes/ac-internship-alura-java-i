class LacoFatorial {
	public static void main (String[] args) {
		long fatorial = 1;

		for (int i = 1; i < 40; i++) {
			System.out.println(i*fatorial);
			fatorial = i*fatorial;
		}
	}
}