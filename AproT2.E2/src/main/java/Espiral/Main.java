package Espiral;

import java.util.Scanner;
import static Contagem.Contagem.*;
public class Main {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dimensao Da Matriz: ");
        int n = entrada.nextInt();
        System.out.print("Valor de B: ");
        int b = entrada.nextInt();
        	
        int[] v = new int[2];
        v[0] = n;
        v[1] = b;

        
        int[] res = Espiral.entradaEspiral(v, 1);
        for(int i = 0; i < res.length; i++){
        	System.out.print("Valor de saída: " + res[i] + "  ");
        }
        

		        System.out.println("\n     Contador : " +getCounter());
		    }
		
}

