package org.pojo;

import org.base.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends HelperClass{
	
	public FbPojo() {
		PageFactory.initElements(driver, this);
	}
	//FbPojo f= new FbPojo();
	//f.txtuser
	
	@FindBy(id="email")
	private WebElement txtuser;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btn;
	@CacheLookup
	@FindBys({
	
	    @FindBy(id="email"),
		@FindBy(xpath="//input[@type=\"text\"]")
	})
	private WebElement txt;
	@CacheLookup
	@FindAll({
		@FindBy(id="pas"),
		@FindBy(xpath="//input[@name=\"pass\"]")
		
	})
	private WebElement pass; 

	public WebElement getPass() {
		return pass;
	}

	public WebElement getTxt() {
		return txt;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtn() {
		return btn;
	}
	
	
	
	
	
	//getter & setters setters->value   Getter-->set panna value get
}
