package com.caionilson.core.tema7;

import org.junit.Test;

import junit.framework.Assert;

public class ConversorTest {
	
	private Conversor conversor = new Conversor();
	
	@Test
	public void converterArabicoParaRomano() {
		Assert.assertEquals("I", conversor.inteiroParaRomano(1));
		Assert.assertEquals("IV", conversor.inteiroParaRomano(4));
		Assert.assertEquals("XXIX", conversor.inteiroParaRomano(29));
		Assert.assertEquals("DCCCLXXIII", conversor.inteiroParaRomano(873));
		Assert.assertEquals("MMMCMXCIX", conversor.inteiroParaRomano(3999));
	}
	
	@Test
	public void converterRomanoParaArabico() throws NumeroInvalidoException {
		Assert.assertEquals(1, conversor.romanoParaInteiro("I"));
		Assert.assertEquals(4, conversor.romanoParaInteiro("IV"));
		Assert.assertEquals(29, conversor.romanoParaInteiro("XXIX"));
		Assert.assertEquals(873, conversor.romanoParaInteiro("DCCCLXXIII"));
		Assert.assertEquals(3999, conversor.romanoParaInteiro("MMMCMXCIX"));
	}
}
