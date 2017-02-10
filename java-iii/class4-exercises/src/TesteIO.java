import java.io.*;
import java.util.Scanner;

public class TesteIO {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
//		String string = bufferedReader.readLine();
//
//		while (bufferedReader != null) {
//			System.out.println(string);
//			string = bufferedReader.readLine();
//		}
//
//		bufferedReader.close();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma mensagem:");
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}

		scanner.close();
	}
}