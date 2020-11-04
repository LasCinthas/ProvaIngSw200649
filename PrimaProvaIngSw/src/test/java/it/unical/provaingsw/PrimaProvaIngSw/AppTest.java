package it.unical.provaingsw.PrimaProvaIngSw;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.joda.time.LocalDateTime;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	MyListUtil ml;
	
	@Before
	public void inizializza() {
		ml = new MyListUtil();
	}
	
    @Test
    public void crescenteWorks()
    {
    	System.out.print("Test crescente inizio: ");
    	System.out.println(LocalDateTime.now());
    		
    	ArrayList<Integer> lista = new ArrayList<Integer>();
    	lista.add(1);
    	lista.add(5);
    	lista.add(3);
		
		int[] actuals = {1,3,5};
   
		assertArrayEquals(ml.ordinaLista(lista, "crescente"), actuals);
		
    	System.out.print("Test crescente fine: ");
    	System.out.println(LocalDateTime.now());

    }
    
    @Test
    public void decrescenteWorks()
    {
    	System.out.print("Test decrescente inizio: ");
    	System.out.println(LocalDateTime.now());
    	ArrayList<Integer> lista = new ArrayList<Integer>();
    	lista.add(1);
    	lista.add(5);
    	lista.add(3);
		
		int[] actuals = {5,3,1};
   
		assertArrayEquals(ml.ordinaLista(lista, "decrescente"), actuals);
		
		System.out.print("Test decrescente fine: ");
    	System.out.println(LocalDateTime.now());

    }
}
