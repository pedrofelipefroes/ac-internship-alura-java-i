/**
 * Created by pfroes on 1/30/17.
 */
public class Circulo implements AreaCalculavel {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return this.raio * this.raio * Math.PI;
	}
}
