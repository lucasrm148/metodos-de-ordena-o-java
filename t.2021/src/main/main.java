package main;

import java.util.ArrayList;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mage_Sort<Integer> mage =new Mage_Sort<>(10);
		RandomArryCreator<Integer> creator = new RandomArryCreator(1);
		
		ArrayList<Integer> arry=(ArrayList<Integer>)(creator.NumArray(5,"int"));
		for(int i = 0; i<arry.size();i++) {
			System.out.println(arry.get(i));
		}
		int teste = arry.size()-1;
		mage.sort(arry, 0,teste );
		for(int i = 0; i<arry.size();i++) {
			System.out.println(arry.get(i));
		}
	}

}
//long start = System.currentTimeMillis();

//faz o trabalho a ser medido

//long elapsed = System.currentTimeMillis() - start;