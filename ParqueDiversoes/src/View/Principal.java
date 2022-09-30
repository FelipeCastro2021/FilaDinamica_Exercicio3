package View;

import java.util.Random;

import br.edu.fateczl.filaobj.Fila;
import controller.ParqueController;
import controller.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Random random = new Random();
		ParqueController pc = new ParqueController();
		
		for (int i = 0; i < 30; i++) {
			fila.insert(new Pessoa("Pessoa"+i, Math.abs(random.nextInt(30)) + 10, ((float)Math.abs(random.nextInt(65) + 135) / 100)));
		}

		while (!fila.isEmpty()) {
			pc.brinquedo(fila);			
		}
	}

}
