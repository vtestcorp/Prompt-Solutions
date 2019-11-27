package com.PS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PS.base.Base;

public class CustomerDetails_Page extends Base {

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement email;

	@FindBy(xpath = "//div[@class='input-group']//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(xpath = "//button[@class='btn btn-green btn-lg btn-block']")
	public WebElement LoginBtn;

	@FindBy(xpath = "//h2[@class='text-center signup-wizard-hding ng-scope']")
	public WebElement CompanySetupWizardText;

	@FindBy(xpath = "//button[@class='btn-sm btn btn-default pull-left']")
	public WebElement SkipBtn;

	@FindBy(xpath = "//body[@class='ng-scope']/div[@id='page-container']/nav[@id='page-leftbar']/div/ul[@id='sidebar']/li[4]/a[3]")
	public WebElement CustomersMenuBtn;

	@FindBy(xpath = "//a[@class='btn btn-green']")
	public WebElement NewCustomer;
	@FindBy(xpath = "//input[@name='companyName']")
	public WebElement companyName;
	
	@FindBy(xpath = "//input[@id='s2id_autogen70']/..//b")
	public WebElement paymentTerm;
	@FindBy(xpath = "//input[@id='s2id_autogen70_search']")
	public WebElement paymentTermSearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-70']")
	public WebElement paymentTermSearchClick;
	
	@FindBy(xpath = "//input[@id='s2id_autogen72']/..//b")
	public WebElement customerType;
	@FindBy(xpath = "//input[@id='s2id_autogen72_search']")
	public WebElement customerTypeSearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-72']")
	public WebElement customerTypeSearchClick;
	
	@FindBy(xpath = "//input[@name='website']")
	public WebElement companyWebsite;
	
	@FindBy(xpath = "//input[@id='s2id_autogen74']/..//b")
	public WebElement customerSource;
	@FindBy(xpath = "//input[@id='s2id_autogen74_search']")
	public WebElement customerSourceSearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-74']")
	public WebElement customerSourceSearchClick;
	
	@FindBy(xpath = "//input[@id='s2id_autogen76']/..//b")
	public WebElement rateYourCompany;
	@FindBy(xpath = "//input[@id='s2id_autogen76_search']")
	public WebElement rateYourCompanySearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-76']")
	public WebElement rateYourCompanySearchClick;
	
	@FindBy(xpath = "//input[@id='s2id_autogen78']/..//b")
	public WebElement Industry;
	@FindBy(xpath = "//input[@id='s2id_autogen78_search']")
	public WebElement IndustrySearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-78']")
	public WebElement IndustrySearchClick;
	
	@FindBy(xpath = "//input[@name='billingStreetl']")
	public WebElement streetName;
	
	@FindBy(xpath = "//input[@name='billingCityName']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@name='billingStateId']")
	public WebElement state;
	@FindBy(xpath = "(//a[@class='select2-choice'])[4]")
	public WebElement stateName;
	@FindBy(xpath = "(//input[@class='select2-input'][@role='combobox'])[11]")
	public WebElement stateNameSearch;
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public WebElement stateNameSearchClick;
	
	@FindBy(xpath = "//input[@name='billingPinCode']")
	public WebElement zipcode;
	
	@FindBy(xpath = "//input[@type='checkbox'][@ng-model='popUp.customer.shippingAddressSameAsBilling']")
	public WebElement sameAsBillingAddress;
	
	@FindBy(xpath = "//a[@class='ng-binding'][contains(text(),'Contact')]")
	public WebElement contactsubmenu;
	
	@FindBy(xpath = "//input[@id='s2id_autogen84']/..//b")
	public WebElement title;
	@FindBy(xpath = "//input[@id='s2id_autogen84_search']")
	public WebElement titleSearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-84']")
	public WebElement titleSearchClick;
	
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstname;
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastname;
	@FindBy(xpath = "//input[@name='phoneNumber']")
	public WebElement phonename;
	@FindBy(xpath = "//input[@name='email']")
	public WebElement customerEmail;
	
	@FindBy(xpath = "//a[contains(text(),'Tax Information')]")
	public WebElement taxInfoSubmenu;
	@FindBy(xpath = "//input[@id='s2id_autogen86']/..//b")
	public WebElement GSTMech;
	@FindBy(xpath = "//input[@id='s2id_autogen86_search']")
	public WebElement GSTMechSearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-86']")
	public WebElement GSTMechSearchClick;
	
	@FindBy(xpath = "//input[@name='gstNumber']")
	public WebElement GSTIN;
	@FindBy(xpath = "//input[@name='panNumber']")
	public WebElement PAN;
	
	@FindBy(xpath = "//a[contains(text(),'Logo')]")
	public WebElement LogoSubmenu;
	@FindBy(xpath = "//input[@id='customerLogo']/..//span[contains(text(),'Select file')]/../..//div")
	public WebElement selectLogo;
	
	@FindBy(xpath = "//button[contains(text(),'Capture')]")
	public static WebElement Capture;

	@FindBy(xpath = "//button[@class='btn btn-green pull-right']")
	public WebElement save;
	
	@FindBy(xpath = "//div[@class='modal-body ng-scope']")
	public WebElement popupText;
	@FindBy(xpath = "//button[@class='btn btn-green']")
	public WebElement ConfirmationYES;
	
	@FindBy(xpath = "//div[@ng-if='totalItems > 1']/p")
	public WebElement totalCustomerCount;
	
	@FindBy(xpath ="//a[@class='btn btn-green dropdown-toggle']")
	public WebElement newCustomerDropdown;
	
	@FindBy(xpath = "//div[@id='page-container']//ul[@class='dropdown-menu']//a[1]")
	public WebElement importCustomer;
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	public WebElement Nextbtn;
	
	@FindBy(xpath = "(//input[@value='Next'])[2]")
	public WebElement Nextbtn2;
	
	@FindBy(xpath = "(//input[@value='Next'])[3]")
	public WebElement Nextbtn3;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-green center-block')]//i")
	public WebElement downloadTemplate;
	@FindBy(xpath = "//input[@type='file'][@name='file']")
	public WebElement chooseFile;
	@FindBy(xpath = "//span[contains(text(),'ImportCustomers.xls')]")
	public WebElement FileName;
	
	@FindBy(xpath = "//div[contains(@class,'pull-right')]//input[contains(@class,'finish btn-green btn')]")
	public WebElement uploadCustomers;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement searchbox;
	
	@FindBy(xpath = "(//div[@class='ui-grid-cell-contents ng-binding ng-scope']//a//strong)[1]")
	public WebElement searchedCust;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement hamburgerbtn;
	
	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[7]")
	public WebElement editCustomer;
	
	@FindBy(xpath = "//h3[@class='modal-title text-center ng-binding']")
	public WebElement CustomerTextVerify;
	
	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[2]")
	public static WebElement createSOInvoice;
	
	@FindBy(xpath = "//input[@id='s2id_autogen87']/..//b")
	public static WebElement CustomerSelection;
	
	@FindBy(xpath = "//input[@id='s2id_autogen87']/..//b")
	public WebElement ProjectName;
	@FindBy(xpath = "//input[@id='s2id_autogen87_search']")
	public static WebElement ProjectNameSearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-87']")
	public static WebElement ProjectNameSearchClick;
	
	@FindBy(xpath = "//label[contains(text(),'Select Place of Supply')]")
	public static WebElement PlaceOfSupply;
	@FindBy(xpath = "//span[contains(text(),'Select Place of Supply')]/..//b")
	public WebElement PlaceOFSupplyClick;
	@FindBy(xpath = "//input[@id='s2id_autogen77_search']")
	public static WebElement PlaceOFSupplyClickSearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-77']")
	public static WebElement PlaceOFSupplyClickClick;
	
	@FindBy(xpath = "(//input[@name='referenceNumber'])[1]")
	public static WebElement CustomerPO;
	@FindBy(xpath = "(//input[@name='referenceNumber'])[2]")
	public static WebElement ref;
	
	@FindBy(xpath = "//input[@id='s2id_autogen79']/..//b")
	public WebElement BillingAddress;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-79']")
	public WebElement BillingAddressAddNew;
	@FindBy(xpath = "//span[contains(text(),'×')]")
	public WebElement cancelIcon;
	
	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[9]/..//b")
	public WebElement payTerms;
	@FindBy(xpath = "//input[@id='s2id_autogen83_search']")
	public static WebElement payTermsSearch;
	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-83']")
	public static WebElement payTermsSearchClick;
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-pencil']/..")
	public WebElement pencilEditIcon;
	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[10]/..//b")
	public WebElement productName;
	@FindBy(xpath = "(//input[@type='text'][@role='combobox'])[15]")
	public static WebElement productNameSearch;
	@FindBy(xpath = "//div[@class='select2-result-label'][@role='option']")
	public static WebElement productNameSearchClick;
	
	@FindBy(xpath = "//input[@id='0-2'][@type='number']")
	public static WebElement quantity;
	@FindBy(xpath = "//input[@id='rate0'][@type='number']")
	public static WebElement rate;
	
	@FindBy(xpath = "//button[@class='btn btn-green pull-left']")
	public static WebElement InvoiceSave;
	
	@FindBy(xpath = "//p[@class='ng-binding']")
	public static WebElement ConfirmatioBox;
	
	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement YES;
	
	@FindBy(xpath = "//div[@class='modal-header ng-scope']//h3[@id='reportTitle']")
	public static WebElement ValidateSInvoice;
	
	@FindBy(xpath = "//div[@class='modal-header ng-scope']//button[@type='button']")
	public static WebElement InvoiceClose;
	
	@FindBy(xpath = "(//h4[@class='panel-title']//a[@accordion-transclude='heading'])//i[@class='pull-right fa fa-angle-left']")
	public static WebElement FilterToggle;
	
	@FindBy(xpath = "//input[@class='select2-input select2-default'][@type='text']")
	public static WebElement CustomerClick;
	@FindBy(xpath = "//ul[@class='select2-results']//li[1]")
	public static WebElement CustomerBox;
	
	@FindBy(xpath ="//button[@class='btn btn-green']")
	public static WebElement applyFilter;
	
	@FindBy(xpath = "//div[@id='page-container']//td[3]//a")
	public static WebElement getCustomerName;
	
	
	
	//By Nitin Borse
	
	@FindBy(xpath = "(//div[@class='ui-grid-cell-contents ng-binding ng-scope']//a//strong)[1]")
	public WebElement customerName;
	
	@FindBy(xpath = "(//button[@class='btn btn-default dropdown-toggle'])[1]")
	public WebElement togglebutton;
	
	@FindBy(xpath = "//div[contains(@class,'open')]//i[@class='fa fa-trash-o']")
	public WebElement deletebutton;
	
	@FindBy(xpath = "//div[contains(@class,'modal-body')]//p")
	public WebElement popuptext;
	
	@FindBy(xpath = "//button[@class='btn btn-green']")
	public WebElement yesbtn;
	
	@FindBy(xpath = "//h4[@class='ui-pnotify-title']")
	public WebElement popUpMessage;
	
	@FindBy(xpath = "//div[contains(@class,'open')]//a[contains(@ng-click,'ToSalesOrder')]")
	public WebElement createSO;
	
	@FindBy(xpath = "(//dd)[1]")
	public WebElement soCustname;
	
	@FindBy(xpath = "//add-my-ui-select[@placeholder='Billing Address']")
	public WebElement soAddressDrop;
	
	@FindBy(xpath = "//div[@id='select2-drop']//li[contains(@class,'-highlighted')]")
	public WebElement soDropValue;
	
	@FindBy(xpath = "//div[@class='input-group-btn']")
	public WebElement soDateIcon;	
	
	@FindBy(xpath = "//button[contains(@class,' btn-info active')]")
	public WebElement soDateSelect;	
	
	@FindBy(xpath = "//add-my-ui-select[@title='project Name']")
	public WebElement ProjNameDrop;	
	
	@FindBy(xpath = "//div[@id='select2-drop']//li[2]")
	public WebElement ProjSelect;	
		
	@FindBy(xpath = "//label[contains(text(),'Select place of supply')]")
	public WebElement soClickTable;
	
	@FindBy(xpath = "(//tr[@class='editable-custom-tr']//div[contains(@class,'customer-state')])[1]")
	public WebElement soClickPOS;
	
	@FindBy(xpath = "//option[contains(text(),'Assam')]")
	public WebElement soSelectPOS;
	
	@FindBy(xpath = "(//add-my-ui-select[@title='Source']//div)[1]")
	public WebElement soClickSource;
		
	@FindBy(xpath = "//option[contains(text(),'Email')]")////div[contains(@class,'soSource')]//span[contains(text(),'Email')]
	public WebElement soSelectSource;

	@FindBy(xpath = "//input[@name='customerPoNumber']")
	public WebElement custPoNumber;
	
	@FindBy(xpath = "//input[@name='referenceNumber']")
	public WebElement RefNo;
	
	@FindBy(xpath = "//add-my-ui-select[@title='Sales Person']")
	public WebElement salesPerson;
	
	@FindBy(xpath = "//option[contains(text(),'Jyoti Singh')]")
	public WebElement salesPersonVal;
	
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-pencil']")
	public WebElement clickInvoiceTable;
	
	@FindBy(xpath = "//product-and-service-select[@select-name='product0']") 
	public WebElement clickProduct;
	@FindBy(xpath = "//div[contains(@class,'product product')]//input[contains(@id,'search')]")
	public WebElement enterProductVal;
	@FindBy(xpath = "//ul[@class='select2-result-sub']//li[contains(@class,'highlighted')]")
	public WebElement selectProductVal;
	
	@FindBy(xpath = "//select[@name='product0']//option[3]")
	public WebElement clickProductVal;
	
	@FindBy(xpath = "//input[contains(@ng-model,'quantity')]")
	public WebElement clickQuantity;
	
	@FindBy(xpath = "(//add-my-ui-select[@title='UOM']//div)[1]")
	public WebElement clickUOM;	
	@FindBy(xpath = "//div[contains(@class,'productUOM')]//input[contains(@id,'search')]")
	public WebElement enterUOM;	
	@FindBy(xpath = "//ul[@class='select2-results']//li[contains(@class,'highlighted')]")
	public WebElement selectUOM;
	
	@FindBy(xpath = "//input[contains(@ng-model,'rate')]")
	public WebElement clickRate;
	
	@FindBy(xpath = "//input[contains(@ng-model,'discountPercent')]")
	public WebElement clickDiscount;
	
	@FindBy(xpath = "//add-my-ui-select[contains(@ng-model,'cgstTaxId')]")
	public WebElement clickCGST;
	@FindBy(xpath = "//div[contains(@class,'taxName1')]//input")
	public WebElement enterCGST;
	@FindBy(xpath = "//ul[@class='select2-results']//li[contains(@class,'highlighted')]")
	public WebElement selectCGST;
	
	
//	@FindBy(xpath = "//add-my-ui-select[contains(@ng-model,'cgstTaxId')]//option[3]")
//	public WebElement clickCGSTValue;
	
	@FindBy(xpath = "//add-my-ui-select[contains(@ng-model,'sgstTaxId')]")
	public WebElement clickSGST;
	@FindBy(xpath = "//div[contains(@class,'taxName2')]//input")
	public WebElement enterSGST;
	@FindBy(xpath = "//add-my-ui-select[contains(@ng-model,'sgstTaxId')]//option[3]")
	public WebElement selectSGSTValue;
	
	@FindBy(xpath = "//div[@class='container-fluid']//button[1]")
	public WebElement saveButton;

	@FindBy(xpath = "//div[contains(@data-ng-include,'confirmationPopup')]//button[text()='Yes']")
	public WebElement yesButton;
	
	
	//ActivityXpath
	@FindBy(xpath = "//div[contains(@class,'open')]//a[contains(@ng-click,'openNewActivityModal')]")
	public WebElement activityToggle;
	//div[contains(@class,'open')]//a[contains(@ng-click,'openNewCommunicationModal')]
	@FindBy(xpath = "//form[@name='newActivityForm']//input[@name='activityDetails']")
	public WebElement activityName;
	
	@FindBy(xpath = "//form[@name='newActivityForm']//input[@name='activityDescription']")
	public WebElement activityDescrp;

	@FindBy(xpath = "//form[@name='newActivityForm']//add-my-ui-select[@id-property='activityTypeId']")
	public WebElement activityType;
	
	@FindBy(xpath = "//div[contains(@class,'newCrmActivityType')]//input")
	public WebElement activityTypeInput;
	
	@FindBy(xpath = "//form[@name='newActivityForm']//add-my-ui-select[@id-property='activityStatusId']")
	public WebElement activityStatus;
	
	@FindBy(xpath = "//div[contains(@class,'crmActivityStatus')]//input")
	public WebElement activityStatusInput;
	
	@FindBy(xpath = "//form[@name='newActivityForm']//add-my-ui-select[@id-property='activityPriorityId']")
	public WebElement activityPriority;
	
	@FindBy(xpath = "//div[contains(@class,'crmActivityPriority')]//input")
	public WebElement activityPriorityInput;
	
	@FindBy(xpath = "//button[contains(@class,' active')]")
	public WebElement activitydateSelect;
	
	@FindBy(xpath = "//label[contains(text(),'Assign')]//following::div[contains(@id,'s2id_autogen')]")
	public WebElement activityAssignedTo;
	
	@FindBy(xpath = "//div[@id='select2-drop']//input")
	public WebElement activityAssignedToName;
	
	@FindBy(xpath = "//div[@id='select2-drop']//li[contains(@class,'highlighted')]")
	public WebElement activityAssignedToNameSelect;
	
	
	@FindBy(xpath = "//button[contains(@ng-click,'createActivity')]")
	public WebElement activityCreate;
	
	//Log Communication
	@FindBy(xpath = "//div[contains(@class,'open')]//a[contains(@ng-click,'openNewCommunicationModal')]")
	public WebElement communicateToggle;
	
	@FindBy(xpath = "//input[@name='communicationMode']")
	public WebElement communicateMode;
	
	@FindBy(xpath = "//input[@name='description']")
	public WebElement communicateDescript;

	@FindBy(xpath = "//input[@name='communicatedTo']")
	public WebElement communicateTo;
	
	@FindBy(xpath = "//label[contains(text(),'Communicated By')]//following::div[contains(@id,'s2id_autogen')]")
	public WebElement communicateBy;
	
	@FindBy(xpath = "//div[@id='select2-drop']//input")
	public WebElement communicateByName;

	@FindBy(xpath = "//div[@id='select2-drop']//li[contains(@class,'highlighted')]")
	public WebElement communicateByNameValue;
	
	@FindBy(xpath = "//div[@class='input-group-btn']")
	public WebElement commDateIcon;
	
	@FindBy(xpath = "//button[contains(@class,' btn-info active')]")
	public WebElement commDateSelect;	
	
	@FindBy(xpath = "//button[contains(@ng-click,'createCommunication')]")
	public WebElement commCreate;
	
	@FindBy(xpath = "//button[@class='btn btn-green']")
	public WebElement commYESButton;
	
	
	@FindBy(xpath = "(//div[@class='ui-grid-canvas']//div[@class='icheckbox_flat'])[6]")
	public WebElement checkbox1;
	@FindBy(xpath = "(//div[@class='ui-grid-canvas']//div[@class='icheckbox_flat'])[7]")
	public WebElement checkbox2;
	@FindBy(xpath = "(//div[@class='ui-grid-canvas']//div[@class='icheckbox_flat'])[8]")
	public WebElement checkbox3;
	
	
	@FindBy(xpath = "//button[@title='Download as PDF']")
	public WebElement pdfDownlaod;
	
	@FindBy(xpath = "//button[@title='Download as Excel']")
	public WebElement excelDownlaod;
	
	@FindBy(xpath = "//button[@title='Delete']")
	public WebElement deleteCustomers;
	
	
	
	public CustomerDetails_Page() {
		PageFactory.initElements(driver, this);
	}
}
