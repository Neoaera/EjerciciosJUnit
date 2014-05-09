import javax.swing.JOptionPane;

public class Intentos {

	public static void main(String[] args) {
		int njuegos = 2;
		String marinwins, jonawins;
		String comprobar, asegurar = "";
		int marintotal, jonatotal;

		while (njuegos != 0) {
			try{
			njuegos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de juegos"));
			if (njuegos > 0) {
				String resultados = JOptionPane.showInputDialog(null,"Ingrese el resultado de los juegos");
				String ajustar = resultados.replace(" ", "");
				comprobar = ajustar.replace("1", "");
				asegurar = ajustar.replace("0", "");
				// Verificar que solo sean numeros
				if (!ajustar.replaceAll(" ", "").matches("([0-9]*)")) {
					JOptionPane.showMessageDialog(null, "INGRESE SOLO NUMEROS");
				}
				if (njuegos == ajustar.length()) {
					if (comprobar.length() != 0 || asegurar.length() != 0) {
						marinwins = ajustar.replace("0", "");
						jonawins = ajustar.replace("1", "");
						marintotal = njuegos - marinwins.length();
						jonatotal = njuegos - jonawins.length();

						System.out.println("mary won " + marintotal
								+ " times and, john won " + jonatotal
								+ " times");
						njuegos=0;
					}
				} else {
					JOptionPane.showMessageDialog(null,"no ha ingresado la cantidad correcta de jugadas o ha ingresado un numero distinto a 0/1 HACES A MARIA LLORAR! D:<");
				}
			} else {
				JOptionPane.showMessageDialog(null,"las veces que jugaron no puede ser menor que cero MARIA Y YO ESTAMOS MUY DECEPCIONADOS! D:<");
				njuegos++;
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"eres terrible, hiciste alque que no debias");
		}
		}
	}
}
