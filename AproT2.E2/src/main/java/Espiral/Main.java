package Espiral;

import java.util.Scanner;
import static Contagem.Contagem.*;
public class Main {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Dimensao Da Matriz: ");
	        int n = in.nextInt();
	        System.out.print("Numero B: ");
	        int b = in.nextInt();
	        
	        mostrarMatriz(Espiral.gerarMatrizEspiral(n, 1), n, n);
	    }
		
		 public static void mostrarMatriz(int[][] M, int f, int c) {
			 	
			 	
			 for (int i = 1; i <= f; i++) {
		            for (int j = 1; j <= c; j++) {
		                System.out.print("\t" + M[i][j]);
		            }
		            System.out.println();
		        }
		        System.out.println("     Contador : " +getCounter());
		    }
		
	
}

