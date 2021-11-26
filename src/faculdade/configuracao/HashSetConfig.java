package faculdade.configuracao;

import java.util.HashSet;

public class HashSetConfig {
	public void HashSetCalculo() {
		HashSet<Integer> hashSet = new HashSet<>();
		
	    for(int x = 1; x<=10000; x++){
	       hashSet.add(x);
	    }
	    
	    for(int x = 0; x < 5000; x++){
	      hashSet.remove(x);
	    }
	}
}
