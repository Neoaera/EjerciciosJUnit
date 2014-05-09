import javax.swing.JOptionPane;

public class Intentos {

	public static void main(String[] args) {
		int njuegos = 2;
		String marinwins, jonawins,ajustar;
		String comprobar,asegurar="";
		int marintotal, jonatotal;
		

		while (njuegos != 0) {
			njuegos = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Ingrese el numero de juegos"));
			if (njuegos != 0) {
				String resultados = JOptionPane.showInputDialog(null,
						"Ingrese el resultado de los juegos");
				ajustar = resultados.replace(" ", "");
				comprobar= ajustar.replace("1", "");
				asegurar= ajustar.replace("0","");
				
				if (njuegos == ajustar.length()) {
					
					marinwins = ajustar.replace("0", "");
					jonawins = ajustar.replace("1", "");
					marintotal = njuegos - marinwins.length();
					jonatotal = njuegos - jonawins.length();

					System.out.println("mary won " + marintotal
							+ " times and, john won " + jonatotal + " times");
				} else {
					JOptionPane.showMessageDialog(null,"no ha ingresado la cantidad correcta de jugadas o ha ingresado un numero distinto a 0/1 HACES A MARIA LLORAR! D:<");
				}
			}else{
				JOptionPane.showMessageDialog(null,"las veces que jugaron no puede ser menor que cero MARIA Y YO ESTAMOS MUY DECEPCIONADOS! D:<");
				njuegos++;
			}

		}
	}
}