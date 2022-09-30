package controller;

import br.edu.fateczl.filaobj.Fila;

public class ParqueController {

	public ParqueController() {
	}

	public void brinquedo(Fila fila) {
		try {
			Pessoa pessoa = (Pessoa) fila.remove();
			System.out.println(pessoa.Nome);
			
			if (pessoa.Idade > 16 && pessoa.Altura > 1.60) {
				System.out.println("Passou");
			} else if (pessoa.Idade < 16 && pessoa.Altura < 1.60) {
				System.out.println("Não passou: baixinho e de menor");
			} else if (pessoa.Idade < 16) {
				System.out.println("Não passou: de menor");
			} else {
				System.out.println("Não passou: baixinho");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
