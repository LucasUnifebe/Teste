
public class ArvoreBinaria {
	private Nodo raiz;
	

	public boolean insere(int value) {
		if (raiz == null) {
			System.out.println(value + " eh a raiz da arvore");
			// System.out.println("Raiz da Arvore: "+value);
			raiz = new Nodo(value);
			return true;
		} else {
			return raiz.insere(value);
		}
	}

	public Nodo remover(int valor) throws Exception {
		return remover(this.raiz, valor);
	}

	private Nodo remover(Nodo nodo, int valor) throws Exception {
		if (this.raiz == null) {
			throw new Exception("Árvore vazia");
		} else {
			if (valor < nodo.getValor()) {
				nodo.setEsquerda(remover(nodo.getEsquerda(), valor));

			}

			else if (valor > nodo.getValor()) {
				nodo.setDireita(remover(nodo.getDireita(), valor));
			} else if (nodo.getEsquerda() != null && nodo.getDireita() != null) {
				System.out.println("");
				System.out.println("Removeu No" + nodo.getValor());
				System.out.println("");
				nodo.setValor(encontraMinimo(nodo.getDireita()).getValor());
				nodo.setDireita(removeMinimo(nodo.getDireita()));
			} else {
				System.out.println("");
				System.out.println("  Removeu No " + nodo.getValor());
				System.out.println("");
				nodo = (nodo.getEsquerda() != null) ? nodo.getEsquerda() : nodo.getDireita();

			}

			return nodo;

		}
	}

	private Nodo removeMinimo(Nodo nodo) {
		if (nodo == null) {
			System.out.println("  ERRO ");
		} else if (nodo.getEsquerda() != null) {
			nodo.setEsquerda(removeMinimo(nodo.getEsquerda()));
			return nodo;
		} else {
			return nodo.getDireita();
		}
		return null;
	}

	private Nodo encontraMinimo(Nodo nodo) {
		if (nodo != null) {
			while (nodo.getEsquerda() != null) {
				nodo = nodo.getEsquerda();
			}
		}
		return nodo;
	}

	// fonte da pesquisa
	// https://precisoestudarsempre.blogspot.com/2015/01/arvore-binaria-implementacao-em-java.html

	public void percorre(IPercorre metodo) {
		metodo.percorre(raiz);
	}
}