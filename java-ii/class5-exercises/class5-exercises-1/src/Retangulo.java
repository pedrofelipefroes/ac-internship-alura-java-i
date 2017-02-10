/**
 * Created by pfroes on 1/30/17.
 */
public class Retangulo implements AreaCalculavel {
	private int altura;
	private int largura;

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return this.altura * this.largura;
	}
}
