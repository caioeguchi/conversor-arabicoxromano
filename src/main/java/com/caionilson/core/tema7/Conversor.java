package com.caionilson.core.tema7;

import java.util.HashMap;
import java.util.Map;

public class Conversor {
	public String inteiroParaRomano(int inteiro) {
		
		String m[] = {"", "M", "MM", "MMM"}; 
		String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
		String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; 
		String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; 
          
		String milhar = m[inteiro/1000]; 
		String centena = c[(inteiro%1000)/100]; 
		String dezena = x[(inteiro%100)/10]; 
		String unidade = i[inteiro%10]; 
          
		String romano = milhar+centena+dezena+unidade; 
		
		return romano; 
	} 
	
	public int romanoParaInteiro(String numeroRomano) throws NumeroInvalidoException {
		if(!validarNumeroRomano(numeroRomano)) {
			throw new NumeroInvalidoException();
		}
		
        Map<Character, Integer> charRomano = new HashMap<Character, Integer>();
        charRomano.put('I', 1);
        charRomano.put('V', 5);
        charRomano.put('X', 10);
        charRomano.put('L', 50);
        charRomano.put('C', 100);
        charRomano.put('D', 500);
        charRomano.put('M', 1000);
        
        int inteiro = 0;
        for (int i = 0; i < numeroRomano.length(); i += 1) {
            if (i == 0 || charRomano.get(numeroRomano.charAt(i)) <= charRomano.get(numeroRomano.charAt(i - 1)))
                inteiro += charRomano.get(numeroRomano.charAt(i));
            else
                inteiro += charRomano.get(numeroRomano.charAt(i)) - 2 * charRomano.get(numeroRomano.charAt(i - 1));
        }
        return inteiro;
	}
	
	
	public boolean validarNumeroRomano(String numeroRomano) {
        boolean validacao = true;
        for(String letra : numeroRomano.split("")){
            if(!validacao)
                break;
            validacao = 
            		letra.equals("I") ||
            		letra.equals("V") ||
            		letra.equals("X") ||
            		letra.equals("L") ||
            		letra.equals("C") ||
            		letra.equals("D") ||
            		letra.equals("M");
        }
        return validacao;
    }
}
