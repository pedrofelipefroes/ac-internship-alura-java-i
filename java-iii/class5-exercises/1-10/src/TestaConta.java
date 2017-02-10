import conta.Conta;
import conta.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(0, "Lucas Hanke");
		Conta cc2 = new ContaCorrente(0, "Lucas Hanke");

		//cc1.imprimeNome("Socorram-me, subi no ônibus em Marrocos");
		//cc1.imprimeNome("anotaram a data da maratona");

		System.out.println(cc1.converteString("762"));
	}

}
