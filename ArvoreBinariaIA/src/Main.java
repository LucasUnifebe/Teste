public class Main{
    public static void main(String[] args) throws Exception{
        ArvoreBinaria ab = new ArvoreBinaria();

        ab.insere(5);
        ab.insere(3);
        ab.insere(4);
        ab.insere(7);
        ab.insere(6);
        ab.insere(17);
        ab.insere(12);
        ab.insere(25);
        
        ab.remover(7);
        	
        
        System.out.println("Em Ordem");
        	ab.percorre(new EmOrdem());
     
        	System.out.println("Profundidade");
        	ab.percorre(new Profundidade());
    
        	System.out.println("Nivel");
        	ab.percorre(new Nivel());
        	
        	
    		
    		
        	
        	    }      
    
    
}// fonte da pesquisa https://precisoestudarsempre.blogspot.com/2015/01/arvore-binaria-implementacao-em-java.html

// 
