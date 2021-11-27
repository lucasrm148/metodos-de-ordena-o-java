package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Integer;
public class RandomArryCreator<t>{
	Random aleatorio = new Random();
	t obj;
	public  RandomArryCreator(t obj) {
		this.obj = obj;
	}
	public List<t> NumArray2() {
		System.out.println(obj.getClass().getName());
		
		return null;
	}
	public List< ?> NumArray(int tamanho,String tipo) {
		ArrayList<Object> arry = new ArrayList<>();
		
		for(int i=0 ; i <tamanho; i++) {
			if(tipo == "int")
				arry.add(aleatorio.nextInt(100));
			else {
				if(tipo == "double")
					arry.add(aleatorio.nextFloat());
				else
					arry.add(aleatorio.nextDouble());
			}
		}
		return arry;
	}
	public ArrayList<String> StringArray(int Ndigitos, int tamanho) {
		ArrayList<String> arry = new ArrayList<>();
		String var ="";
		int naleatorio;
		for(int i=0 ; i <tamanho; i++) {
			naleatorio= aleatorio.nextInt (Ndigitos)+1;
			var ="";
			for(int j=0; j< naleatorio; j++ ) {
				var = var+ (char) (aleatorio.nextInt(25) + 97);
			}
			arry.add(var);
		}
		return arry; 
	}

}
