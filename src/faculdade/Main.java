package faculdade;

import faculdade.configuracao.HashSetConfig;

public class Main {

	public static void main(String[] args) {
		 	
		    
		    long hashSetCaluloTempoIncial = System.currentTimeMillis();
		    
		    HashSetConfig hashSetConfig = new HashSetConfig();
		    hashSetConfig.HashSetCalculo();
		    
		    long tempoCalulo = System.currentTimeMillis() - hashSetCaluloTempoIncial;
		    System.out.printf("Tempo de execução: %d Milissegundos", tempoCalulo);


	}

}
