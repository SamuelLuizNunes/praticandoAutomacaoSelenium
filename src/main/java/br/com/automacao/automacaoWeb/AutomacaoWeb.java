package br.com.automacao.automacaoWeb;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.automacao.core.Driver;
import br.com.automacao.pages.LoginPage;
import br.com.automacao.utils.Browser;

public class AutomacaoWeb {
	Driver driver;
	LoginPage loginPage;
	
	@Before
	public void iniciaTeste() {
		driver =  new Driver(Browser.EDGE);
		driver.getDriver().get("https://www.saucedemo.com");
		loginPage = new LoginPage(driver.getDriver());
	}
	
	@After
	public void finalizaTeste() {
		driver.getDriver().quit();		
	}
	
	@Test
	public void realizarLogin() {
		loginPage.escreverUser("standard_user");
		loginPage.escreverPassword("secret_sauce");
		loginPage.clicarLogin();
		assertEquals("PRODUCTS", loginPage.getTituloLogado());
	}
}
