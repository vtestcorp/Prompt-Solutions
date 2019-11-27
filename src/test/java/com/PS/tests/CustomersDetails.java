package com.PS.tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PS.base.Base;
import com.PS.pages.CustomerDetails_Page;
import com.PS.util.Utility;
import com.TestNG.listener.CustomListener;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(CustomListener.class)
public class CustomersDetails extends Base {

	CustomerDetails_Page custDetails;
	public String totalCustCount;

	@BeforeSuite
	public void createReport() {
		create_ext_report("PS " + Utility.Date_Time().toString());

	}

	@Parameters({ "Browser" })
	@BeforeMethod
	public void setup(String Browser) throws URISyntaxException, IOException, InterruptedException {
		driverInitilization(Browser);
		custDetails = new CustomerDetails_Page();

		Utility.enterText(custDetails.email, Utility.excelRead(1, 0));
		Utility.enterText(custDetails.password, Utility.excelRead(1, 1));
		Utility.implicitwait();
		Utility.click(custDetails.LoginBtn);
		Utility.implicitwait();
		if (custDetails.CompanySetupWizardText.isDisplayed()) {

			System.out.println("User is logged in");
		} else {
			System.out.println("User is not Logged in");
		}
		Utility.implicitwait();
		Utility.click(custDetails.SkipBtn);
		Utility.implicitwait();
	}

	@Test(priority=1,enabled = false)
	public void CreateCustomer() throws Exception {
		create_extent_test("Create customer, Search Customer, Update Customer Details");

		Utility.click(custDetails.CustomersMenuBtn);
		Thread.sleep(1000);

		Utility.JS_Scrolldown(custDetails.totalCustomerCount);
		Thread.sleep(1000);
		if (custDetails.totalCustomerCount.isDisplayed()) {
			totalCustCount = custDetails.totalCustomerCount.getText();
			System.out.println("Expected " + totalCustCount);
		} else {
			System.out.println("Not Displayed");
		}

		Thread.sleep(1000);
		Utility.click(custDetails.NewCustomer);
		Thread.sleep(2000);

		Utility.ExcelReadAndWrite(1, 2);
		Utility.implicitwait();
		Utility.enterText(custDetails.companyName, Utility.excelRead(1, 2));
		Thread.sleep(1000);

		Utility.click(custDetails.paymentTerm);
		Utility.enterText(custDetails.paymentTermSearch, Utility.excelRead(1, 3));
		Utility.click(custDetails.paymentTermSearchClick);

		Utility.click(custDetails.customerType);
		Utility.enterText(custDetails.customerTypeSearch, Utility.excelRead(1, 4));
		Utility.click(custDetails.customerTypeSearchClick);

		Utility.enterText(custDetails.companyWebsite, Utility.excelRead(1, 5));

		Utility.click(custDetails.customerSource);
		Utility.enterText(custDetails.customerSourceSearch, Utility.excelRead(1, 6));
		Utility.click(custDetails.customerSourceSearchClick);
		Thread.sleep(1000);
		Utility.click(custDetails.rateYourCompany);
		Utility.enterText(custDetails.rateYourCompanySearch, Utility.excelReadInt(1, 7));
		Utility.click(custDetails.rateYourCompanySearchClick);

		Utility.click(custDetails.Industry);
		Utility.enterText(custDetails.IndustrySearch, Utility.excelRead(1, 8));
		Utility.click(custDetails.IndustrySearchClick);

		Utility.enterText(custDetails.streetName, Utility.excelRead(1, 9));
		Utility.enterText(custDetails.city, Utility.excelRead(1, 10));

		Thread.sleep(1000);
		
//		if(driver.getPageSource().contains("name='billingStateId'")){
//			Utility.ActionClick(custDetails.state);
//			Utility.enterText(custDetails.state, Utility.excelRead(1, 11));
//			}
//		else{
//			Utility.ActionClick(custDetails.stateName);
//			Utility.enterText(custDetails.stateNameSearch, Utility.excelRead(1, 11));
//			Utility.ActionClick(custDetails.stateNameSearchClick);
//			}
		
		Utility.implicitwait();
		Utility.ActionClick(custDetails.sameAsBillingAddress);

		if(custDetails.zipcode.isDisplayed())
		{
		Utility.enterText(custDetails.zipcode, Utility.excelReadInt(1, 12));
		et.log(LogStatus.PASS, "Customer Details with Address information Entered", et.addScreenCapture(pass("Customer Details with Address information Entered")));
		
		} else {
			et.log(LogStatus.FAIL, "Customer Details with Address information not Entered", et.addScreenCapture(fail("Customer Details with Address information not Entered")));
		}
		
		Utility.click(custDetails.contactsubmenu);

		Utility.click(custDetails.title);
		Utility.enterText(custDetails.titleSearch, Utility.excelRead(1, 13));
		Utility.click(custDetails.titleSearchClick);

		Utility.enterText(custDetails.firstname, Utility.excelRead(1, 14));
		Utility.enterText(custDetails.lastname, Utility.excelRead(1, 15));
		Utility.enterText(custDetails.phonename, Utility.excelReadInt(1, 16));
		
		if(custDetails.customerEmail.isDisplayed())
		{
			Utility.enterText(custDetails.customerEmail, Utility.excelRead(1, 17));
		et.log(LogStatus.PASS, "Customer Details with contact information Entered", et.addScreenCapture(pass("Customer Details with contact information Entered")));
		
		} else {
			et.log(LogStatus.FAIL, "Customer Details with contact information not Entered", et.addScreenCapture(fail("Customer Details with contact information not Entered")));
		}
		
		Utility.click(custDetails.taxInfoSubmenu);
		Utility.click(custDetails.GSTMech);
		Utility.enterText(custDetails.GSTMechSearch, Utility.excelRead(1, 18));
		Utility.click(custDetails.GSTMechSearchClick);

		Utility.enterText(custDetails.GSTIN, Utility.excelReadInt(1, 19));
		
		if(custDetails.PAN.isDisplayed())
		{
		Utility.enterText(custDetails.PAN, Utility.excelReadInt(1, 20));
		et.log(LogStatus.PASS, "Customer Details with Tax information Entered", et.addScreenCapture(pass("Customer Details with tax information Entered")));
		
		} else {
			et.log(LogStatus.FAIL, "Customer Details with Tax information not Entered", et.addScreenCapture(fail("Customer Details with tax information not Entered")));
		}

		Utility.click(custDetails.LogoSubmenu);
		custDetails.selectLogo.click();
		
		Thread.sleep(3000);
		// below line execute the AutoIT script .
		System.out.println(System.getProperty("user.dir") + prop.getProperty("LogoFileUpload"));
		String UploadFileexe = System.getProperty("user.dir") + prop.getProperty("LogoFileUpload");
	    Runtime.getRuntime().exec(UploadFileexe);
	    
		Thread.sleep(5000);
		Utility.click(custDetails.Capture);
		
		Thread.sleep(2000);
		if(custDetails.save.isDisplayed())
		{
		et.log(LogStatus.PASS, "Company logo is selected", et.addScreenCapture(pass("Company logo is selected")));
		Utility.click(custDetails.save);
		}
		else {
			et.log(LogStatus.FAIL, "Company logo is not selected", et.addScreenCapture(fail("Company logo is not selected")));
		}
		if (custDetails.popupText.isDisplayed()) {
			et.log(LogStatus.PASS, "Confirmation pop up displayed", et.addScreenCapture(pass("Confirmation pop up displayed")));
			Utility.click(custDetails.ConfirmationYES);
		} 
		else {
			et.log(LogStatus.FAIL, "Confirmation pop up is not displayed", et.addScreenCapture(fail("Confirmation pop up is not displayed")));

		}

		String totalCustCountCurrent = custDetails.totalCustomerCount.getText();
		System.out.println("Actual" + totalCustCountCurrent);
		Thread.sleep(1000);
		try {
			
			Assert.assertNotEquals(totalCustCount, totalCustCountCurrent);
			System.out.println("count matched");
			et.log(LogStatus.PASS, "New Cusomter Created and count got increased",
					et.addScreenCapture(pass("New Customer is Created and count got increased")));

		} 
		catch (Exception ex) {
			System.out.println("count mismatched ");
			et.log(LogStatus.FAIL, "Customer Count hasn't increased",
					et.addScreenCapture(fail("Customer Count hasn't increased")));
		}

		Thread.sleep(1000);

		// Search by Customer name Customer name
		Utility.enterText(custDetails.searchbox, Utility.excelRead(1, 2));

		String expected = Utility.excelRead(1, 2);
		String custext = custDetails.searchedCust.getText();
		System.out.println(custext);
		Thread.sleep(1000);
		try {
			Assert.assertEquals(custext, expected);
			System.out.println("Search matched");
			et.log(LogStatus.PASS, "New created customer name found", et.addScreenCapture(fail("New created customer name found")));
		} catch (Exception ex) {
			et.log(LogStatus.FAIL, "New created customer name found", et.addScreenCapture(pass("New created customer name not found")));
			System.out.println("search mismatched ");
		}

		// update Customer details
		Thread.sleep(1000);
		Utility.click(custDetails.hamburgerbtn);
		Utility.click(custDetails.editCustomer);
		Thread.sleep(1000);
		if (custDetails.CustomerTextVerify.isDisplayed()) {
			et.log(LogStatus.PASS, "Customer Information pop up is loaded",
					et.addScreenCapture(pass("Customer Information pop up is loaded")));
		} else {
			et.log(LogStatus.FAIL, "Customer Information pop up is not loaded",
					et.addScreenCapture(pass("Customer Information pop up is not loaded")));
		}
		Utility.ExcelReadAndWrite(1, 2);
		Utility.enterText(custDetails.companyName, Utility.excelRead(1, 2));
		String updatedCust = Utility.excelRead(1, 2);
		Utility.click(custDetails.save);
		if (custDetails.popupText.isDisplayed()) {
			et.log(LogStatus.PASS, "Confirmation pop up displayed", et.addScreenCapture(pass("Confirmation pop up displayed")));
			Utility.click(custDetails.ConfirmationYES);
		} else {
			et.log(LogStatus.FAIL, "Confirmation pop up is not displayed", et.addScreenCapture(fail("Confirmation pop up is not displayed")));

		}
		Thread.sleep(3000);
		Utility.enterText(custDetails.searchbox, Utility.excelRead(1, 2));
		System.out.println(updatedCust);
		System.out.println("Expected" + Utility.excelRead(1, 2));
		String updatedCustName = custDetails.searchedCust.getText();

		System.out.println(updatedCustName);
		Thread.sleep(1000);
		try {
			Assert.assertEquals(updatedCust, updatedCustName);
			System.out.println("Updated customer name is displayed");
			et.log(LogStatus.PASS, "Updated customer name is displayed",
					et.addScreenCapture(fail("Updated customer name is displayed")));
		} catch (Exception ex) {
			et.log(LogStatus.FAIL, "Updated customer name is not displayed",
					et.addScreenCapture(pass("Updated customer name is not displayed")));
			System.out.println("Search Mismatched");
		}

		System.out.println("Passed");

	}

	@Test(priority=2,enabled = false)
	public void UploadCustomer() throws InterruptedException, IOException {

		create_extent_test("Upload customer details");
		
		Utility.click(custDetails.CustomersMenuBtn);

		Utility.click(custDetails.newCustomerDropdown);

		if (custDetails.importCustomer.isDisplayed()) {
			et.log(LogStatus.PASS, "Import Customers Text displayed",
					et.addScreenCapture(pass("Import Customers Text displayed")));
			Utility.click(custDetails.importCustomer);
		} else {
			et.log(LogStatus.FAIL, "Import Customers Text is not displayed",
					et.addScreenCapture(fail("Import Customers Text is not displayed")));
		}
		Utility.JS_Scrolldown(custDetails.Nextbtn);
		if (custDetails.Nextbtn.isDisplayed()) {
			et.log(LogStatus.PASS, "Import Customers Steps displayed",
					et.addScreenCapture(pass("Import Customers Steps displayed")));
			Utility.click(custDetails.Nextbtn);
		} else {
			et.log(LogStatus.FAIL, "Import Customers Steps is not displayed",
					et.addScreenCapture(fail("Import Customers Steps is not displayed")));
		}

		Thread.sleep(1000);
		Utility.click(custDetails.paymentTerm);
		Utility.enterText(custDetails.paymentTermSearch, Utility.excelRead(1, 8));
		Utility.click(custDetails.paymentTermSearchClick);

		Utility.implicitwait();
		Thread.sleep(2000);
		Utility.click(custDetails.customerType);
		Utility.enterText(custDetails.customerTypeSearch, Utility.excelRead(1, 4));
		Utility.click(custDetails.customerTypeSearchClick);

		Utility.implicitwait();
		Utility.click(custDetails.customerSource);
		Utility.enterText(custDetails.customerSourceSearch, Utility.excelRead(1, 6));
		Utility.click(custDetails.customerSourceSearchClick);

		Thread.sleep(2000);
		Utility.click(custDetails.rateYourCompany);
		Utility.enterText(custDetails.rateYourCompanySearch, Utility.excelRead(1, 3));
		Utility.click(custDetails.rateYourCompanySearchClick);

		Utility.implicitwait();
		if(custDetails.Nextbtn2.isDisplayed()) {
			et.log(LogStatus.PASS, "Step 1 Setup Data for Import information are filled",
				et.addScreenCapture(pass("Step 1 Setup Data for Import information are filled")));
			Utility.implicitwait();
			custDetails.Nextbtn2.click();
		} else {
			et.log(LogStatus.FAIL, "Step 1 Setup Data for Import information are not filled",
					et.addScreenCapture(fail("Step 1 Setup Data for Import information are not filled")));
		}
		Utility.click(custDetails.downloadTemplate);
		Thread.sleep(1000);
		Utility.implicitwait();
		Utility.implicitwait();
		if(custDetails.Nextbtn3.isDisplayed()) {
		
			et.log(LogStatus.PASS, "Step 2 Template Downloaded successfully",
					et.addScreenCapture(pass("Step 2 Template Downloaded successfully")));
			custDetails.Nextbtn3.click();
		} else {
			et.log(LogStatus.FAIL, "Step 2 Template Downloading Failed",
					et.addScreenCapture(fail("Step 2 Template Downloading failed")));
		}
		

		Utility.implicitwait();
		Thread.sleep(3000);
		Utility.JS_ScrollUP();
		Utility.ActionClick(custDetails.chooseFile);
		Utility.implicitwait();
		Thread.sleep(2000);
		// below line execute the AutoIT script .
		System.out.println(System.getProperty("user.dir") + prop.getProperty("ImportCustomers"));
		String Uploadexe = System.getProperty("user.dir") + prop.getProperty("ImportCustomers");
	    Runtime.getRuntime().exec(Uploadexe);
		
	    Utility.implicitwait();
		if(custDetails.FileName.isDisplayed()) {
			et.log(LogStatus.PASS, "Uploaded File name displayed",
					et.addScreenCapture(pass("Uploaded File name displayed")));
			Utility.implicitwait();
		} else {
			et.log(LogStatus.FAIL, "Uploaded file name is not displayed",
					et.addScreenCapture(fail("Uploaded file name is not displayed")));
		}	
		Utility.implicitwait();

		if(custDetails.uploadCustomers.isDisplayed()) {
			et.log(LogStatus.PASS, "Step 3 File uploaded successfully",
					et.addScreenCapture(pass("Step 3 File uploaded successfully")));
			custDetails.uploadCustomers.click();
		} else {
			et.log(LogStatus.FAIL, "Step 3 File uploaded Failed",
					et.addScreenCapture(fail("Step 3 File uploaded Failed")));
		}

	}

	@Test(priority=3,enabled = false)
	public void CreateSalesInvoice() throws Exception {
		create_extent_test("Create Sales Invoice");
		
		Utility.click(custDetails.CustomersMenuBtn);
		Utility.implicitwait();

		Utility.click(custDetails.hamburgerbtn);
		if (custDetails.createSOInvoice.isDisplayed()) {
			et.log(LogStatus.PASS, "Create SO Invoice Text displayed",
					et.addScreenCapture(pass("Create SO Invoice Text displayed")));
			Utility.click(CustomerDetails_Page.createSOInvoice);
		} else {
			et.log(LogStatus.FAIL, "Create SO Invoice is not displayed",
					et.addScreenCapture(fail("Create SO Invoice Text is not displayed")));
		}

		Utility.implicitwait();

		Utility.click(custDetails.ProjectName);
		Utility.enterText(custDetails.ProjectNameSearch, Utility.excelRead(1, 21));
		Utility.click(custDetails.ProjectNameSearchClick);

		Utility.click(custDetails.PlaceOfSupply);
		Thread.sleep(1000);
		Utility.ActionClick(custDetails.PlaceOFSupplyClick);

		Utility.enterText(custDetails.PlaceOFSupplyClickSearch, Utility.excelRead(1, 11));
		Utility.click(custDetails.PlaceOFSupplyClickClick);

		Utility.enterText(custDetails.CustomerPO, Utility.excelReadInt(1, 22));
		Utility.enterText(custDetails.ref, Utility.excelReadInt(1, 23));

		Utility.click(custDetails.BillingAddress);
		Utility.click(custDetails.BillingAddressAddNew);
		Utility.click(custDetails.cancelIcon);

		Thread.sleep(1000);
		Utility.implicitwait();
		Utility.wait(custDetails.pencilEditIcon);
		if (custDetails.pencilEditIcon.isDisplayed()) {
			et.log(LogStatus.PASS, "Billing Invoice information filled",
					et.addScreenCapture(pass("Billing Invoice information filled")));
		} else {
			et.log(LogStatus.FAIL, "Billing Invoice information not filled",
					et.addScreenCapture(fail("Billing Invoice information not filled")));
		}

		Utility.click(custDetails.pencilEditIcon);
		Utility.implicitwait();
		Utility.click(custDetails.productName);
		Utility.enterText(custDetails.productNameSearch, Utility.excelRead(1, 24));
		Utility.click(custDetails.productNameSearchClick);

		Utility.enterText(custDetails.quantity, Utility.excelReadInt(1, 25));
		Utility.enterText(custDetails.rate, Utility.excelReadInt(1, 26));

		Utility.implicitwait();
		Utility.JS_Scrolldown(custDetails.InvoiceSave);
		Utility.implicitwait();

		if (custDetails.InvoiceSave.isDisplayed()) {
			et.log(LogStatus.PASS, "Product, Quantity, Rate information filled",
					et.addScreenCapture(pass("Product, Quantity, Rate information filled")));
			Utility.click(custDetails.InvoiceSave);
		} else {
			et.log(LogStatus.FAIL, "Product, Quantity, Rate information not filled",
					et.addScreenCapture(fail("Product, Quantity, Rate information not filled")));
		}

		if (custDetails.ConfirmatioBox.isDisplayed()) {
			et.log(LogStatus.PASS, "Sales Invoice Details Filled Successfully",
					et.addScreenCapture(pass("Sales Invoice Details Filled Successfully")));
			Utility.implicitwait();
			Utility.click(custDetails.YES);
			System.out.println("Clicked");
			Utility.implicitwait();
		} else {
			et.log(LogStatus.FAIL, "Sales Invoice Details is not Filled",
					et.addScreenCapture(fail("Sales Invoice Details is not Filled")));

		}
		Thread.sleep(4000);
		Utility.wait(custDetails.ValidateSInvoice);
		if (custDetails.ValidateSInvoice.isDisplayed()) {
			et.log(LogStatus.PASS, "Sales Invoice is Created Sucessfully",
					et.addScreenCapture(pass("Sales Invoice is Created Sucessfully")));
			Utility.wait(custDetails.InvoiceClose);
			Utility.implicitwait();
			Thread.sleep(2000);
			Utility.implicitwait();
			Utility.click(custDetails.InvoiceClose);
		} else {
			et.log(LogStatus.FAIL, "Sales Invoice is not Created",
					et.addScreenCapture(fail("Sales Invoice is not Created")));

		}
		Utility.implicitwait();

		Thread.sleep(1000);
		Utility.JS_ScrollUP();
		Thread.sleep(2000);
		if(custDetails.FilterToggle.isDisplayed())
		{
			Utility.ActionClick(custDetails.FilterToggle);
			et.log(LogStatus.PASS, "Customer Sales Invoice Found", et.addScreenCapture(pass("Customer Sales Invoice Found")));
		} 
		else {
			et.log(LogStatus.FAIL, "Customer Sales Invoice is not Found", et.addScreenCapture(fail("Customer Sales Invoice is not Found")));

		}
		Utility.implicitwait();
		Utility.click(custDetails.CustomerClick);
		Utility.click(custDetails.CustomerBox);
		String expectedName = Utility.excelRead(1, 2);
		System.out.println("Expected Name :" +expectedName);
		
		Utility.click(custDetails.applyFilter);
		Utility.implicitwait();
		
		String actualName = custDetails.getCustomerName.getText();
		System.out.println("Actual Name :" + actualName);
		
		try {
			Assert.assertEquals(actualName, expectedName);
			et.log(LogStatus.PASS, "Customer Sales Invoice Found", et.addScreenCapture(pass("Customer Sales Invoice Found")));
		} 
		catch (Exception ex){
			et.log(LogStatus.FAIL, "Customer Sales Invoice is not Found", et.addScreenCapture(fail("Customer Sales Invoice is not Found")));

		}
	}

	//By Nitin Borse
	@Test(enabled= false)
	public void deleteCustomer() throws Exception{
		
		create_extent_test("Delete customer");
	
		Utility.click(custDetails.CustomersMenuBtn);
			
		Utility.implicitwait();
		
		String custName = custDetails.customerName.getText();
		System.out.println(custName);
		
		String totalCustCount = custDetails.totalCustomerCount.getText();
		System.out.println(totalCustCount.substring(3, 9));
		
		Utility.click(custDetails.togglebutton);
		Utility.click(custDetails.deletebutton);
		
		String popuptxt = custDetails.popuptext.getText();
		System.out.println(popuptxt);
		String actual = "Are you sure you want to delete customer?";
		
		if(popuptxt.equals(actual)) {
			et.log(LogStatus.PASS, "Popup message is as Expected",
					et.addScreenCapture(fail("Popup message is as Expected")));
			Utility.click(custDetails.yesbtn);
			String popupMsg = custDetails.popUpMessage.getText();
			if(popupMsg.equals("Success")) {
				System.out.println("Deleted successfull");	
				et.log(LogStatus.PASS, "Customer Deleted Successfully",
						et.addScreenCapture(fail("Customer Deleted Successfully")));
			}
			else {
				System.out.println("Transaction Exist, Customer deleted Unsuccessfully");
				et.log(LogStatus.FAIL, "Customer deleted Unsuccessfully",
						et.addScreenCapture(pass("Customer deleted Unsuccessfully")));
			}
			
		}
		else {
			System.out.println("Error");
			et.log(LogStatus.FAIL, "Popup Message is Wrong",
					et.addScreenCapture(pass("Popup Message is Wrong")));
		}
				
	}
	
	@Test(enabled= false)
	public void createSO() throws Exception{
	
		create_extent_test("Create Sales Order");
		
		
		Utility.click(custDetails.CustomersMenuBtn);
				
		Utility.implicitwait();		
		String custName = custDetails.customerName.getText();
		System.out.println(custName);		
		String totalCustCount = custDetails.totalCustomerCount.getText();
		System.out.println(totalCustCount.substring(3, 9));
		
		Utility.click(custDetails.togglebutton);
		Utility.click(custDetails.createSO);
		Utility.implicitwait();
		
		if(custName.equals(custDetails.soCustname.getText()))
		{
			et.log(LogStatus.PASS, "Customer Name is Same",
					et.addScreenCapture(pass("Customer Name is Same")));
			System.out.println("Customer Name is Same");
			Utility.click(custDetails.soAddressDrop);
			Utility.click(custDetails.soDropValue);

			Utility.click(custDetails.soDateIcon);
			Utility.click(custDetails.soDateSelect);
			
			Utility.click(custDetails.ProjNameDrop);
			Utility.implicitwait();
			Utility.click(custDetails.ProjSelect);
			Utility.implicitwait();
						
			Utility.click(custDetails.clickInvoiceTable);
			if (custDetails.clickProduct.isDisplayed()) {
				et.log(LogStatus.PASS, "Product table is Enabled",
						et.addScreenCapture(pass("Product table is Enabled")));
			} else {
				et.log(LogStatus.FAIL, "Product table is Disabled",
						et.addScreenCapture(fail("Billing Invoice information not filled")));
			}
			Utility.implicitwait();
			Utility.click(custDetails.clickProduct);
			Utility.enterText(custDetails.enterProductVal, Utility.excelRead(1, 24));
			Utility.implicitwait();
			Utility.click(custDetails.selectProductVal);	
			
			Utility.enterText(custDetails.clickQuantity, Utility.excelReadInt(1, 36));	
			
			Utility.enterText(custDetails.clickRate, Utility.excelReadInt(1, 37));
			Utility.enterText(custDetails.clickDiscount, Utility.excelReadInt(1, 38));
			
			Utility.click(custDetails.clickUOM);
			Utility.enterText(custDetails.enterUOM, Utility.excelRead(1, 39));
			Utility.click(custDetails.selectUOM);
			
			Utility.implicitwait();
			
			Utility.click(custDetails.clickCGST);
			Utility.enterText(custDetails.enterCGST, Utility.excelReadInt(1, 40));
			Utility.click(custDetails.selectCGST);
			
			Utility.click(custDetails.clickSGST);
			Utility.enterText(custDetails.enterSGST, Utility.excelReadInt(1, 40));
			Utility.click(custDetails.selectSGSTValue);
			
			
			Utility.JS_ScrollDown();
			Utility.implicitwait();
			Utility.click(custDetails.saveButton);
			Utility.implicitwait();

			if (custDetails.yesButton.isDisplayed()) {
				et.log(LogStatus.PASS, "Customers Sales Order is Created Sucessfully",
						et.addScreenCapture(pass("Customers Sales Order is Created Sucessfully")));
				Utility.click(custDetails.yesButton);
			} else {
				et.log(LogStatus.FAIL, "Customers Sales Order is not Created",
						et.addScreenCapture(fail("Customers Sales Order is not Created")));
			}
			
		}
		else {
			et.log(LogStatus.FAIL, "Customer Name is not Same",
					et.addScreenCapture(fail("Customer Name is not Same")));
			System.out.println("Customer Name is not Same.");
			Utility.closeCurrentBrowser();
		}
	
	}
	
	@Test(enabled= false)
	public void logActivity() throws Exception{
	
		create_extent_test("Log Activity");

		Utility.click(custDetails.CustomersMenuBtn);
				
		Utility.implicitwait();		
		String custName = custDetails.customerName.getText();
		System.out.println(custName);		
		String totalCustCount = custDetails.totalCustomerCount.getText();
		System.out.println(totalCustCount.substring(3, 9));
		
		Utility.click(custDetails.togglebutton);
		Utility.click(custDetails.activityToggle);
		Utility.implicitwait();
		
		if(custDetails.activityName.isDisplayed()) {
			
			et.log(LogStatus.PASS, "New Activity Popup Appeaars",
					et.addScreenCapture(pass("New Activity Popup Appeaars")));
				Utility.enterText(custDetails.activityName, Utility.excelRead(1, 42));
				Utility.enterText(custDetails.activityDescrp, Utility.excelRead(1, 43));
				
				Utility.click(custDetails.activityType);
				Utility.enterText(custDetails.activityTypeInput, Utility.excelRead(1, 44));
				Utility.click(custDetails.selectCGST);
				
				Utility.click(custDetails.activityStatus);
				Utility.enterText(custDetails.activityStatusInput, Utility.excelRead(1, 45));
				Utility.click(custDetails.selectCGST);
				
				Utility.click(custDetails.activityPriority);
				Utility.enterText(custDetails.activityPriorityInput, Utility.excelRead(1, 46));
				Utility.click(custDetails.selectCGST);
				
				Utility.click(custDetails.soDateIcon);
				Utility.click(custDetails.activitydateSelect);
				
				Utility.click(custDetails.activityAssignedTo);
				Utility.enterText(custDetails.activityAssignedToName, Utility.excelRead(1, 47));
				Utility.click(custDetails.activityAssignedToNameSelect);
				
				Utility.implicitwait();
				Utility.click(custDetails.activityCreate);
				Utility.implicitwait();
				
				if (custDetails.yesButton.isDisplayed()) {
					et.log(LogStatus.PASS, "New Activity is Created Sucessfully",
							et.addScreenCapture(pass("New Activity is Created Sucessfully")));
					Utility.click(custDetails.yesButton);
				} else {
					et.log(LogStatus.FAIL, "New Activity is not Created Sucessfully",
							et.addScreenCapture(fail("New Activity is not Created Sucessfully")));
				}
		}
		else {
			et.log(LogStatus.FAIL, "New Activity Popup is not Appeaar",
					et.addScreenCapture(fail("New Activity Popup is not Appeaar")));
		}
		
	}
	
	@Test(enabled= false)
	public void logCommunication() throws Exception{
	
		create_extent_test("Log Activity");

		Utility.click(custDetails.CustomersMenuBtn);
				
		Utility.implicitwait();		
		String custName = custDetails.customerName.getText();
		System.out.println(custName);		
		String totalCustCount = custDetails.totalCustomerCount.getText();
		System.out.println(totalCustCount.substring(3, 9));
		
		Utility.click(custDetails.togglebutton);
		Utility.implicitwait();
		
		if (custDetails.communicateToggle.isDisplayed()) {
			et.log(LogStatus.PASS, "Log Communication displayed",
					et.addScreenCapture(pass("Log Communication displayed")));
			Utility.click(custDetails.communicateToggle);
			
			Utility.enterText(custDetails.communicateMode, Utility.excelRead(1, 48));
			Utility.enterText(custDetails.communicateDescript, Utility.excelRead(1, 49));
			Utility.enterText(custDetails.communicateTo, Utility.excelRead(1, 50));
			
			Utility.click(custDetails.communicateBy);
			Utility.enterText(custDetails.communicateByName, Utility.excelRead(1, 47));
			Utility.click(custDetails.communicateByNameValue);
			
			Utility.click(custDetails.commDateIcon);
			Utility.click(custDetails.commDateSelect);
		
			Utility.click(custDetails.commCreate);
			
			Utility.implicitwait();
			if (custDetails.commYESButton.isDisplayed()) {
				et.log(LogStatus.PASS, "New Communication is Created Sucessfully",
						et.addScreenCapture(pass("New Communication is Created Sucessfully")));
				Utility.click(custDetails.commYESButton);
			} else {
				et.log(LogStatus.FAIL, "New Communication is not Created Sucessfully",
						et.addScreenCapture(fail("New Communication is not Created Sucessfully")));
			}
			
		} else {
			et.log(LogStatus.FAIL, "Log Communication is not displayed",
					et.addScreenCapture(fail("Log Communication is not displayed")));
		}
		
	}
	
	@Test(enabled= false)
	public void ActionPerform() throws Exception{
	
		create_extent_test("Log Activity");

		Utility.click(custDetails.CustomersMenuBtn);
		Utility.implicitwait();	
		
		Utility.JS_ScrollDown();
		
		Utility.click(custDetails.checkbox1);
		Utility.click(custDetails.checkbox2);
		Utility.click(custDetails.checkbox3);
		Utility.JS_ScrollUP();
		Utility.implicitwait();	
		
		if (custDetails.pdfDownlaod.isDisplayed()) {
			et.log(LogStatus.PASS, "PDF Downloaded Sucessfully",
					et.addScreenCapture(pass("PDF Downloaded Sucessfully")));
			Utility.click(custDetails.pdfDownlaod);
			System.out.println("Pdf downloaded");
		} else {
			et.log(LogStatus.FAIL, "PDF Downloaded Fail",
					et.addScreenCapture(fail("PDF Downloaded Fail")));
		}
		Utility.implicitwait();
		
		
		
		if (custDetails.excelDownlaod.isDisplayed()) {
			et.log(LogStatus.PASS, "cDownloaded Sucessfully",
					et.addScreenCapture(pass("Excel Downloaded Sucessfully")));
			Utility.click(custDetails.excelDownlaod);
			System.out.println("Excel download");
		} else {
			et.log(LogStatus.FAIL, "Excel Downloaded Fail",
					et.addScreenCapture(fail("Excel Downloaded Fail")));
		}
		
		Utility.click(custDetails.deleteCustomers);
		Utility.click(custDetails.yesButton);
		String popupMsg = custDetails.popUpMessage.getText();
		if(popupMsg.equals("Success")) {
			et.log(LogStatus.PASS, "Customers Deleted successfully",
					et.addScreenCapture(pass("Customers Deleted successfully")));
			System.out.println("Deleted successfully");				
		}
		else {
			et.log(LogStatus.FAIL, "Customers Deleted Unsuccessfully",
					et.addScreenCapture(fail("Customers Deleted Unsuccessfully")));
			System.out.println("Deleted Unsuccessfully");
		}
		Utility.implicitwait();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}

	@AfterSuite
	public void closeReport() {
		if (driver != null) {
			driver.quit();
		}
		close_ext_Report();
		Utility.closeAllOpenBrowser();
	}

}
