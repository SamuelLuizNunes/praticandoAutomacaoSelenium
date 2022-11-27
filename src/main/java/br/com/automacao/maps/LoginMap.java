package br.com.automacao.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
	@FindBy(id = "user-name")
	public WebElement iDUserName;

	@FindBy(id = "password")
	public WebElement iDPassword;

	@FindBy(id = "login-button")
	public WebElement iDBtnLogin;

	@FindBy(css = ".title")
	public WebElement paginaProdutos;

}
