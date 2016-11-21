package Espiral;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class EspiralTest {

	
	@Test(expected = IllegalArgumentException.class)
    public void testInvalidNumber() {
		int actual = Espiral.entradaT(-1,0);
    }
	
	@Test
	public void testCase1() {
		int[] expected = {1,3};
		int actual = Espiral.entradaT(3,3);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCase2() {
		int[] expected = {2,2};
		int actual = Espiral.entradaT(3,9);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCase3() {
		int[] expected = {3,1};
		int actual = Espiral.entradaT(3,7);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCase4() {
		int[] expected = {3,3};
		int actual = Espiral.entradaT(3,5);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCase5() {
		int[] expected = {2,1};
		int actual = Espiral.entradaT(3,8);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCase6() {
		int[] expected = {1,1};
		int actual = Espiral.entradaT(4,1);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCase7() {
		int[] expected = {1,1};
		int actual = Espiral.entradaT(10,1);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCase8() {
		int[] expected = {4,1};
		int actual = Espiral.entradaT(4,10);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCase9() {
		int[] expected = {10,9};
		int actual = Espiral.entradaT(10,20);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCaseEspiral() {
		int[] expected = {4,6};
		int actual = Espiral.entradaT(8,53);
		
		assertEquals(expected, actual);
		
	}
	

   

}
