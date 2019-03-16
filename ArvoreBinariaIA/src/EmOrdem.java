public class EmOrdem implements IPercorre{
    public void percorre(Nodo nodo){
        if (nodo != null){
            percorre(nodo.getEsquerda());
            System.out.println(" Valor � " + nodo.getValor());
            percorre(nodo.getDireita());
        }
    }
}

//fonte da pesquisa https://precisoestudarsempre.blogspot.com/2015/01/arvore-binaria-implementacao-em-java.html