import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SQL {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cree una tabla de SQL");
		try {
			String a= reader.readLine();
		} catch (IOException e) {
			System.out.println("ERROR");
		}
		//TODO - hacer replace del string a

	}

}
