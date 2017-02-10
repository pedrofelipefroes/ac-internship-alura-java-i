package banco;

import conta.Conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	private List<Conta> listaDeContas = new ArrayList<>();
	private Map<String, Conta> mapaDeContas = new HashMap<>();

	public void adiciona(Conta c) {
		this.listaDeContas.add(c);
		this.mapaDeContas.put(c.getNome(), c);
	}

	public Conta pega(int x) {
		return this.listaDeContas.get(x);
	}

	public int pegaQuantidadeDeContas() {
		return this.listaDeContas.size();
	}

	public Conta buscaPorNome(String nome) {
		return this.mapaDeContas.get(nome);
	}
}
