import java.util.*;

public class TestaTreeSet {
	public static void main(String[] args) {
		// Exercício 18
//		TreeSet<Integer> intList = new TreeSet<>();
//
//		for (int i = 0; i < 1000; i++) {
//			intList.add(i);
//		}
//
//		for (Integer j : intList.descendingSet()) {
//			System.out.println(j);
//		};

		// Exercício 19
		List<Integer> intArrayList = new ArrayList<>();

		for (int i = 0; i <= 1000; i++) {
			intArrayList.add(i);
		}

		Collections.reverse(intArrayList);

		System.out.println(intArrayList);
	}
}
