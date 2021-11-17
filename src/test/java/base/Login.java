package base;

import org.junit.Assert;
import org.testng.annotations.Test;


public class Login extends BaseClass{
	
	@Test(priority = 0)
	public void logInTest() throws InterruptedException {

		lP.inputUsername("standard_user");
		lP.inputPassword("secret_sauce");
		lP.clickLoginButton();
		Thread.sleep(2000);
		Assert.assertEquals(pP.getProductsHeaderText(), "Products");
	}

	@Test(priority = 3)
	public void orderingTests() throws InterruptedException {
		
		logInTest();
		
		pP.addFirstProduct();
		pP.goToShoppingCart();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(cP.getProdName(), "Sauce Labs Backpack");
		Assert.assertEquals(cP.getProdQuantity(), "1");
		Thread.sleep(2000);

		cP.checkOut();
		Thread.sleep(2000);
		cInfoP.fillIn("Test User", "Here", "03063");
		cInfoP.submit();

		Thread.sleep(2000);
		Assert.assertEquals(coutP.finishButtonText(), "FINISH");
		coutP.finalizePurchase();

		Thread.sleep(2000);
		Assert.assertEquals(confirmP.orderConfirmText(), confirmP.getAssertText());
	}

}
