import java.util.ArrayDeque;
import java.util.Deque;

public class Nivel implements IPercorre {
	public void percorre(Nodo nodo) {
		Deque<Nodo> array = new ArrayDeque<>();
		
		array.add(nodo);// adiciona a raiz no Array

		while (array.isEmpty() == false) {

			Nodo nivel = array.removeFirst();
			System.out.println(nivel.getValor());

			// pega esquerda do numero que está no array
			if (nivel.getEsquerda() != null) {
				array.add(nivel.getEsquerda());
			}

			// pega a direita filho do numero que está na lista
			if (nivel.getDireita() != null) {
				array.add(nivel.getDireita());
			}
		}
	}
}
