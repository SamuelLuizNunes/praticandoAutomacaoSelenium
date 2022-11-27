package br.com.automacao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.automacao.maps.LoginMap;

public class LoginPage {
	WebDriver driver;
	LoginMap loginMap;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		loginMap = new LoginMap();
		PageFactory.initElements(driver, loginMap);
	}

	
	public void escreverUser(String user) {
		loginMap.iDUserName.sendKeys(user);
	}
	
	public void escreverPassword(String password) {
		loginMap.iDPassword.sendKeys(password);
	}
	
	public void clicarLogin() {
		loginMap.iDBtnLogin.click();
	}
	
	public String getTituloLogado() {
		return loginMap.paginaProdutos.getText();
		
	}
}
