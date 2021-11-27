package main;

import java.util.ArrayList;

public class Mage_Sort<t> {
	t obj;
	public Mage_Sort(t amostra) {
		this.obj = amostra;
	}
	
	public  void ordenar(ArrayList<t> arry){
		int meio = arry.size();	
	}
	
	void merge(ArrayList<t> arry, int esquerda, int meio, int direita){
		int n1 = meio - esquerda + 1;
	    int n2 = direita - meio; 
	     ArrayList<t> Esquerda = new ArrayList<>();
	     ArrayList<t> Direita = new ArrayList<>();
	    
	     for (int i = 0; i < n1; ++i) {
	    	 Esquerda.add(arry.get(esquerda +i));
	     }
	     for (int j = 0; j < n2; ++j) {
	    	 Direita.add(arry.get(meio+1+j));
	     }
	   
	     int i = 0, j = 0;
	     int k = esquerda;
	    
	     if("java.lang.Integer"==obj.getClass().getName()) {
	    	
	    	 System.out.println("esquerda:"+esquerda+"  meio0:"+meio+"  direita:"+direita+ "  esteve aqui"); 
	    	 while (i < n1 && j < n2) {
		    	 
	    		 if( (Integer)Esquerda.get(i) <= (Integer)Direita.get(j) ) {
		    		 arry.set(k,Esquerda.get(i));
		             i++;
		         }else {
		        	 arry.set(k,Direita.get(j));
		             j++;
		         }
		         	k++;
		     }	 
	     }
	     while (i < n1) {
	    	 arry.set(k, Esquerda.get(i));
	         i++;
	         k++;
	     }
	     while (j < n2) {
	    	 arry.set(k,Direita.get(j));
	         j++;
	         k++;
	    }
}
	void sort(ArrayList<t> arry, int esquerda, int direita){
		if (esquerda < direita) {
            int meio =esquerda+ ((direita-esquerda) /2);
           
            //System.out.println("esquerda:"+esquerda+"  meio0:"+meio+"  direita:"+direita);
            sort(arry,esquerda,meio);
           
            sort(arry, meio + 1, direita);
            merge(arry, esquerda,meio, direita);
        }
		
	}
	
	
}
