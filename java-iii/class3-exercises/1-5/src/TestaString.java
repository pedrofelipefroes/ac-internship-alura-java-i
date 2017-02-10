import javax.sound.midi.SysexMessage;
import java.io.PrintStream;

public class TestaString {
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		System.out.println(x1);
		System.out.println(x1.toString());

		String example = "12a34";
		Integer x3 = new Integer(0);
		x3 = x3.parseInt(example);
		System.out.println(x3);

		PrintStream saida = System.out;
		saida.println("ola");

	}
}
