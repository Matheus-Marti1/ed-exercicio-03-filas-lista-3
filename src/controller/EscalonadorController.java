package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Processo;

public class EscalonadorController {

	public EscalonadorController() {
		super();
	}

	public void Escalonador(Fila p) {
		while (!p.isEmpty()) {
			try {
				Processo pr = (Processo) p.remove();
				if (pr.QtdRetornos > 1) {
					pr.QtdRetornos--;
					if (pr.QtdRetornos > 1) {
						p.insert(pr);
						System.out.println(pr + " retornou.");
					} else {
						System.out.println(pr + " finalizou.");
					}
				} else {
					System.out.println(pr + " finalizou.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
