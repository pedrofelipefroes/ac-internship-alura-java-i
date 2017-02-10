import java.util.*;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		List<Integer> testeInt = new LinkedList<>();
		long inicio = System.currentTimeMillis();

		int total = 30000;

		long inicioAdd = System.currentTimeMillis();

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		long fimAdd = System.currentTimeMillis();

		System.out.println("Tempo gasto para adicionar: " + (fimAdd - inicioAdd));

		long inicioContains = System.currentTimeMillis();

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fimContains = System.currentTimeMillis();

		System.out.println("Tempo gasto para buscar: " + (fimContains - inicioContains));

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}
}
