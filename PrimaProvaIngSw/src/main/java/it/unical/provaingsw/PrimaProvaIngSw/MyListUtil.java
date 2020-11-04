package it.unical.provaingsw.PrimaProvaIngSw;

import java.util.ArrayList;
import java.util.Comparator;

public class MyListUtil {
		
		
		Comparator<Integer> comparatore = new ComparatoreNumeri();
		Comparator<Integer> comparatoreDec = new ComparatoreNumeriDec();
		
		public int[] ordinaLista(ArrayList<Integer> numeri, String tipoOrdinamento) {
			if(tipoOrdinamento.equals("crescente")) {
				numeri.sort(comparatore);
				int[] lista = {0,0,0};
				for(int i = 0; i < numeri.size(); i++) {
					lista[i] = numeri.get(i);
				}
				return lista;
	
			}
			if(tipoOrdinamento.equals("decrescente")) {
				numeri.sort(comparatoreDec);
				int[] lista = {0,0,0};
				for(int i = 0; i < numeri.size(); i++) {
					lista[i] = numeri.get(i);
				}
				return lista;
			}
			
			return null;
		}
			
}
