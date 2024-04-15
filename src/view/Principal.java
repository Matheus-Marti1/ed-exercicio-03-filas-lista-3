package view;

import br.edu.fateczl.filaobj.Fila;
import controller.EscalonadorController;
import model.Processo;

public class Principal {

	public static void main(String[] args) {
		Fila p = new Fila();
		String[] entrada = { "notepad.exe;14", "write.exe;35", "chrome.exe;27", "acrobat.exe;52", "firefox.exe;18",
				"word.exe;25" };

		for (int i = 0; i < entrada.length; i++) {
			Processo processo = new Processo();
			String[] entradas = entrada[i].split(";");
			processo.Nome = entradas[0];
			processo.QtdRetornos = Integer.parseInt(entradas[1]);
			p.insert(processo);
		}

		EscalonadorController escalonadorController = new EscalonadorController();
		escalonadorController.Escalonador(p);

	}

}
