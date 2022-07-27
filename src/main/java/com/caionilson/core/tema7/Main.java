package com.caionilson.core.tema7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
        Conversor conversor = new Conversor();
        Scanner sc = new Scanner(System.in);
        
        try{
        	System.out.println("Digite o numero ROMANO para converter em arábico: \n");
        	String numeroRomano = sc.nextLine().toUpperCase();  
        	System.out.println(conversor.romanoParaInteiro(numeroRomano));        	
        } catch (NumeroInvalidoException numeroInvalidoException) {
            System.out.println(numeroInvalidoException.getMessage());
        }
        

        try {
        	System.out.println("\nDigite um número INTEIRO entre 1 e 3999 para converter em romano: \n");
        	int numeroInteiro = sc.nextInt(); 
        	if (numeroInteiro<=0 || numeroInteiro>=4000) {
        		System.out.println("\nO número digitado não está entre 1 e 3999");
        	}else {
        		System.out.println(conversor.inteiroParaRomano(numeroInteiro));
        	}
        }catch(InputMismatchException e){
        	System.out.println("O número deve ser inteiro\n");
        }
	System.out.println("\nPrograma terminado");
	}
}
