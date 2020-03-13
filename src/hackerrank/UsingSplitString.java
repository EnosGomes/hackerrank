package ineventapp;

public class UsingSplitString {

	public static StringBuilder retornaNomeReduzido(String nome) {

		int tamanhoNovoNome = 0;

		if (nome.length() < 14) {
			StringBuilder antigoNome = new StringBuilder(nome);
			System.out.println("Nome já reduzido");
			return antigoNome;
		} else {

			String[] nomeReduzido = nome.split(" ");

			StringBuilder novoNome = new StringBuilder();

			int size = nome.length();
			int a = nomeReduzido.length - 1;

			do {

				nomeReduzido[a] = nomeReduzido[a].substring(0, 1) + ".";

				for (int i = nomeReduzido.length - 1; i >= 0; i--) {
					size = size + nomeReduzido[i].length();
					novoNome.append(nomeReduzido[i] + " ");
				}

				tamanhoNovoNome = novoNome.length();

				if (tamanhoNovoNome > 14) {
					novoNome = new StringBuilder();
					a--;
				}

			} while (tamanhoNovoNome >= 14);

			String[] arrayReordenado = novoNome.toString().split(" ");
			StringBuilder novoNomeReordenado = new StringBuilder();
			for (int j = arrayReordenado.length - 1; j >= 0; j--) {
				novoNomeReordenado.append(arrayReordenado[j] + " ");
			}

			return novoNomeReordenado;
		}
	}

	public static void main(String[] args) {

		String nome = "Enoss ";
		
		System.out.println("Nome digitado: " + nome);

		System.out.println("Nome Reduzido: " + retornaNomeReduzido(nome));

	}

}
