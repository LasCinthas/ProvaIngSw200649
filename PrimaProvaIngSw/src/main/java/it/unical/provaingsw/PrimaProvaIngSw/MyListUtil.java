package it.unical.provaingsw.PrimaProvaIngSw;

import java.util.ArrayList;
import java.util.Comparator;

public class MyListUtil {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		Comparator<Integer> comparatore = new ComparatoreNumeri();
		Comparator<Integer> comparatoreDec = new ComparatoreNumeriDec();
		
		public ArrayList<Integer> ordinaLista(ArrayList<Integer> numeri, String tipoOrdinamento) {
			if(tipoOrdinamento.equals("crescente")) {
				numeri.sort(comparatore);
				return numeri;
			}
			if(tipoOrdinamento.equals("decrescente")) {
				numeri.sort(comparatoreDec);
				return numeri;
			}
			
			return null;
		}
		
/*		public static void main(String[] args) {
			ArrayList<Integer> test = new ArrayList<Integer>();
			test.add(1);
			test.add(5);
			test.add(3);
			MyListUtil ml = new MyListUtil();
			ml.ordinaLista(test, "decrescente");
			System.out.println(test.get(0));
			System.out.println(test.get(1));
			System.out.println(test.get(2));
		}
*/		
}
