public class Profundidade implements IPercorre{
    public void percorre(Nodo nodo){
        if(nodo != null){
            System.out.println(" Numero " + nodo.getValor());
            percorre(nodo.getEsquerda());
            percorre(nodo.getDireita());
        }
    }
}