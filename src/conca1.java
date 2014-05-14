import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class conca1 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		boolean vuelta = true;
		int numconj = 0;
		int cont1=0;
		int cont2=0;
		//Primero recibimos el numero de conjuntos
		do {
			vuelta = false;
			System.out.println("INGRESE EL NUMERO DE CONJUNTOS ENTRE 0 Y 25");
			//con sus respectivas imitaciones
			try {
				// si es int, al ponerle letras nos dará un error que aprovecharemos con un try/catch
				numconj = Integer.parseInt(reader.readLine());
				if (numconj < 0 || numconj > 26) {
					System.out.println("SOLO numeros entre 0 y 25");
					vuelta = true;
				}
			} catch (Exception e) {
				System.out.println("solo entre 0 y 25 letras");
				vuelta = true;
			}
		} while (vuelta);
		
				
		}
		
		
		
	}

