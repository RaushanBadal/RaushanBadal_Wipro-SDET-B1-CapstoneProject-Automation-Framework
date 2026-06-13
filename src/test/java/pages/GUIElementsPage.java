package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitUtils;

public class GUIElementsPage {

    /** WebDriver instance shared across all page methods. */
    private final WebDriver driver;

    
    public GUIElementsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // =========================================================================
    // REGION 1 – TEXT FIELDS
    // =========================================================================

    @FindBy(id = "name")
    private WebElement txtName;

    @FindBy(id = "email")
    private WebElement txtEmail;

    @FindBy(id = "phone")
    private WebElement txtPhone;

    @FindBy(id = "textarea")
    private WebElement txtAddress;

    // =========================================================================
    // REGION 2 – RADIO BUTTONS (Gender)
    // =========================================================================

    @FindBy(id = "male")
    private WebElement maleRadio;

    @FindBy(id = "female")
    private WebElement femaleRadio;

    // =========================================================================
    // REGION 3 – CHECKBOXES (Days)
    // =========================================================================

    @FindBy(id = "monday")
    private WebElement monday;

    @FindBy(id = "wednesday")
    private WebElement wednesday;

    @FindBy(id = "friday")
    private WebElement friday;

    // =========================================================================
    // REGION 4 – DROPDOWNS
    // =========================================================================

    @FindBy(id = "country")
    private WebElement countryDropdown;

    @FindBy(id = "colors")
    private WebElement colorsDropdown;

    @FindBy(id = "animals")
    private WebElement animalsDropdown;

    // =========================================================================
    // REGION 5 – DATE PICKERS
    // =========================================================================

    @FindBy(id = "datepicker")
    private WebElement datePicker1;

    @FindBy(id = "txtDate")
    private WebElement datePicker2;

    @FindBy(id = "start-date")
    private WebElement startDate;

    @FindBy(id = "end-date")
    private WebElement endDate;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitDateRange;

    // =========================================================================
    // REGION 6 – FILE UPLOAD
    // =========================================================================

    @FindBy(id = "singleFileInput")
    private WebElement singleFileInput;

    @FindBy(id = "multipleFilesInput")
    private WebElement multipleFilesInput;

    @FindBy(xpath = "//button[text()='Upload Single File']")
    private WebElement uploadSingleButton;

    @FindBy(xpath = "//button[text()='Upload Multiple Files']")
    private WebElement uploadMultipleButton;

    // =========================================================================
    // REGION 7 – SLIDER
    // =========================================================================

    /** Second slider handle; index [2] targets the right-side handle on a range slider. */
    @FindBy(xpath = "(//span[contains(@class,'ui-slider-handle')])[2]")
    private WebElement sliderHandle;

    // =========================================================================
    // REGION 8 – ALERTS
    // =========================================================================

    @FindBy(id = "alertBtn")
    private WebElement simpleAlertBtn;

    @FindBy(id = "confirmBtn")
    private WebElement confirmationAlertBtn;

    @FindBy(id = "promptBtn")
    private WebElement promptAlertBtn;

    // =========================================================================
    // REGION 9 – MOUSE HOVER
    // =========================================================================

    @FindBy(xpath = "//button[text()='Point Me']")
    private WebElement pointMeButton;

    // =========================================================================
    // REGION 10 – DOUBLE CLICK
    // =========================================================================

    @FindBy(id = "field1")
    private WebElement field1;

    @FindBy(id = "field2")
    private WebElement field2;

    @FindBy(xpath = "//button[text()='Copy Text']")
    private WebElement copyTextButton;

    // =========================================================================
    // REGION 11 – DRAG AND DROP
    // =========================================================================

    @FindBy(id = "draggable")
    private WebElement draggable;

    @FindBy(id = "droppable")
    private WebElement droppable;

    // =========================================================================
    // REGION 12 – FORM SECTIONS (Section 1 / 2 / 3)
    // =========================================================================

    @FindBy(id = "input1")
    private WebElement input1;

    @FindBy(id = "btn1")
    private WebElement btn1;

    @FindBy(id = "input2")
    private WebElement input2;

    @FindBy(id = "btn2")
    private WebElement btn2;

    @FindBy(id = "input3")
    private WebElement input3;

    @FindBy(id = "btn3")
    private WebElement btn3;

 // =========================================================================
 // REGION 13 – DOWNLOAD FILES
 // =========================================================================

 @FindBy(tagName = "textarea")
 private WebElement downloadTextArea;

 @FindBy(id = "generateTxt")
 private WebElement generateTxtBtn;

 @FindBy(id = "generatePdf")
 private WebElement generatePdfBtn;

 @FindBy(id = "pdfDownloadLink")
 private WebElement pdfDownloadLink;

 @FindBy(xpath = "//button[text()='Download PDF File']")
 private WebElement browserPdfBtn;
 
//=========================================================================
//REGION 14 – DYNAMIC BUTTON
//=========================================================================

@FindBy(xpath ="//button[text()='START' or text()='STOP']")
private WebElement toggleButton;

    // =========================================================================
    // METHODS – TEXT FIELDS
    // =========================================================================

    public void enterName(String name) {
        WaitUtils.waitForVisibility(driver, txtName);
        txtName.clear();
        txtName.sendKeys(name);
    }

    public void enterEmail(String email) {
        WaitUtils.waitForVisibility(driver, txtEmail);
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void enterPhone(String phone) {
        WaitUtils.waitForVisibility(driver, txtPhone);
        txtPhone.clear();
        txtPhone.sendKeys(phone);
    }

    public void enterAddress(String address) {
        WaitUtils.waitForVisibility(driver, txtAddress);
        txtAddress.clear();
        txtAddress.sendKeys(address);
    }

    public String getNameValue() {
        return txtName.getAttribute("value");
    }

    public String getEmailValue() {
        return txtEmail.getAttribute("value");
    }

    public String getPhoneValue() {
        return txtPhone.getAttribute("value");
    }

    public String getAddressValue() {
        return txtAddress.getAttribute("value");
    }


    // =========================================================================
    // METHODS – RADIO BUTTONS
    // =========================================================================

    public void selectMale() {
        WaitUtils.waitForVisibility(driver, maleRadio);
        maleRadio.click();
    }

    public void selectFemale() {
        WaitUtils.waitForVisibility(driver, femaleRadio);
        femaleRadio.click();
    }

    public boolean isMaleSelected() {
        return maleRadio.isSelected();
    }

    public boolean isFemaleSelected() {
        return femaleRadio.isSelected();
    }


    // =========================================================================
    // METHODS – CHECKBOXES
    // =========================================================================

    public void selectMonday() {
        WaitUtils.waitForVisibility(driver, monday);
        if (!monday.isSelected()) {
            monday.click();
        }
    }

    public void selectWednesday() {
        WaitUtils.waitForVisibility(driver, wednesday);
        if (!wednesday.isSelected()) {
            wednesday.click();
        }
    }

    public void selectFriday() {
        WaitUtils.waitForVisibility(driver, friday);
        if (!friday.isSelected()) {
            friday.click();
        }
    }

    public boolean isMondaySelected() {
        return monday.isSelected();
    }

    public boolean isWednesdaySelected() {
        return wednesday.isSelected();
    }

    public boolean isFridaySelected() {
        return friday.isSelected();
    }


    // =========================================================================
    // METHODS – DROPDOWNS
    // =========================================================================

    public void selectCountry(String country) {
        WaitUtils.waitForVisibility(driver, countryDropdown);
        new Select(countryDropdown).selectByVisibleText(country);
    }

    public void selectColor(String color) {
        WaitUtils.waitForVisibility(driver, colorsDropdown);
        new Select(colorsDropdown).selectByVisibleText(color);
    }

    public void selectAnimal(String animal) {
        WaitUtils.waitForVisibility(driver, animalsDropdown);
        new Select(animalsDropdown).selectByVisibleText(animal);
    }

    public String getSelectedCountry() {
        return new Select(countryDropdown).getFirstSelectedOption().getText();
    }

    public String getSelectedColor() {
        return new Select(colorsDropdown).getFirstSelectedOption().getText();
    }

    public String getSelectedAnimal() {
        return new Select(animalsDropdown).getFirstSelectedOption().getText();
    }


    // =========================================================================
    // METHODS – DATE PICKERS
    // =========================================================================

    public void enterDatePicker1(String date) {
        WaitUtils.waitForVisibility(driver, datePicker1);
        datePicker1.clear();
        datePicker1.sendKeys(date);
    }


    public void enterDatePicker2(String date) {
        WaitUtils.waitForVisibility(driver, datePicker2);
        datePicker2.sendKeys(date);
    }

 
    public void enterStartDate(String date) {
        WaitUtils.waitForVisibility(driver, startDate);
        startDate.sendKeys(date);
    }


    public void enterEndDate(String date) {
        WaitUtils.waitForVisibility(driver, endDate);
        endDate.sendKeys(date);
    }

    public void clickDateSubmit() {
        WaitUtils.waitForVisibility(driver, submitDateRange);
        submitDateRange.click();
    }


    // =========================================================================
    // METHODS – FILE UPLOAD
    // =========================================================================

    public void uploadSingleFile(String filePath) {
        WaitUtils.waitForVisibility(driver, singleFileInput);
        singleFileInput.sendKeys(filePath);
    }

    /** Clicks the 'Upload Single File' button after the file path has been set. */
    public void clickUploadSingleFile() {
        WaitUtils.waitForVisibility(driver, uploadSingleButton);
        uploadSingleButton.click();
    }

    public void uploadMultipleFiles(String filesPaths) {
        WaitUtils.waitForVisibility(driver, multipleFilesInput);
        multipleFilesInput.sendKeys(filesPaths);
    }

    /** Clicks the 'Upload Multiple Files' button after file paths have been set. */
    public void clickUploadMultipleFiles() {
        WaitUtils.waitForVisibility(driver, uploadMultipleButton);
        uploadMultipleButton.click();
    }


    // =========================================================================
    // METHODS – SLIDER
    // =========================================================================

    public void moveSlider() {
        WaitUtils.waitForVisibility(driver, sliderHandle);
        new Actions(driver)
                .dragAndDropBy(sliderHandle, -50, 0)
                .perform();
    }


    // =========================================================================
    // METHODS – ALERTS
    // =========================================================================

    public void clickSimpleAlert() {
        WaitUtils.waitForVisibility(driver, simpleAlertBtn);
        simpleAlertBtn.click();
    }

    public void clickConfirmationAlert() {
        WaitUtils.waitForVisibility(driver, confirmationAlertBtn);
        confirmationAlertBtn.click();
    }


    public void clickPromptAlert() {
        WaitUtils.waitForVisibility(driver, promptAlertBtn);
        promptAlertBtn.click();
    }


    // =========================================================================
    // METHODS – MOUSE HOVER
    // =========================================================================


    public void performMouseHover() {
        WaitUtils.waitForVisibility(driver, pointMeButton);
        new Actions(driver)
                .moveToElement(pointMeButton)
                .perform();
    }


    // =========================================================================
    // METHODS – DOUBLE CLICK
    // =========================================================================

    public void performDoubleClick() {
        WaitUtils.waitForVisibility(driver, copyTextButton);
        new Actions(driver)
                .doubleClick(copyTextButton)
                .perform();
    }

    /** @return the current value attribute of the source text field (field1) */
    public String getField1Text() {
        return field1.getAttribute("value");
    }

    /** @return the current value attribute of the destination text field (field2) */
    public String getField2Text() {
        return field2.getAttribute("value");
    }


    // =========================================================================
    // METHODS – DRAG AND DROP
    // =========================================================================

    public void performDragAndDrop() {
        WaitUtils.waitForVisibility(driver, draggable);
        new Actions(driver)
                .clickAndHold(draggable)
                .moveToElement(droppable)
                .release()
                .build()
                .perform();
    }

    public String getDropText() {
        return droppable.getText();
    }


    // =========================================================================
    // METHODS – FORM SECTION 1
    // =========================================================================

    public void enterSection1Text(String text) {
        WaitUtils.waitForVisibility(driver, input1);
        input1.clear();
        input1.sendKeys(text);
    }

    /** Clicks the Section 1 Submit button. */
    public void clickSection1Submit() {
        WaitUtils.waitForVisibility(driver, btn1);
        btn1.click();
    }

    /** @return current value of the Section 1 input field */
    public String getSection1Value() {
        return input1.getAttribute("value");
    }


    // =========================================================================
    // METHODS – FORM SECTION 2
    // =========================================================================

    public void enterSection2Text(String text) {
        WaitUtils.waitForVisibility(driver, input2);
        input2.clear();
        input2.sendKeys(text);
    }

    /** Clicks the Section 2 Submit button. */
    public void clickSection2Submit() {
        WaitUtils.waitForVisibility(driver, btn2);
        btn2.click();
    }

    /** @return current value of the Section 2 input field */
    public String getSection2Value() {
        return input2.getAttribute("value");
    }


    // =========================================================================
    // METHODS – FORM SECTION 3
    // =========================================================================

    public void enterSection3Text(String text) {
        WaitUtils.waitForVisibility(driver, input3);
        input3.clear();
        input3.sendKeys(text);
    }

    /** Clicks the Section 3 Submit button. */
    public void clickSection3Submit() {
        WaitUtils.waitForVisibility(driver, btn3);
        btn3.click();
    }

    /** @return current value of the Section 3 input field */
    public String getSection3Value() {
        return input3.getAttribute("value");
    }
 // =========================================================================
 // METHODS – DOWNLOAD FILES
 // =========================================================================

 public void enterDownloadText(String text) {

     WaitUtils.waitForVisibility(driver, downloadTextArea);

     downloadTextArea.clear();

     downloadTextArea.sendKeys(text);
 }

 
  // Generate Text File.
  
 public void generateTextFile() {

     WaitUtils.waitForVisibility(driver, generateTxtBtn);

     generateTxtBtn.click();
 }

 // Generate PDF File.
  
 public void generatePdfFile() {

     WaitUtils.waitForVisibility(driver, generatePdfBtn);

     generatePdfBtn.click();
 }

 //Verify PDF download link visibility.
  
 public boolean isPdfLinkDisplayed() {

     WaitUtils.waitForVisibility(driver, pdfDownloadLink);

     return pdfDownloadLink.isDisplayed();
 }

 //Click PDF Download Link.
  
 public void clickPdfLink() {

     WaitUtils.waitForVisibility(driver, pdfDownloadLink);

     pdfDownloadLink.click();
 }

 public void openPdfInBrowser() {

     WaitUtils.waitForVisibility(driver, browserPdfBtn);

     ((JavascriptExecutor) driver)
             .executeScript(
                     "arguments[0].click();",
                     browserPdfBtn);
 }
//=========================================================================
//METHODS – DYNAMIC BUTTON
//=========================================================================

public String getDynamicButtonText() {

  WaitUtils.waitForVisibility(
          driver,
          toggleButton);

  return toggleButton
          .getText()
          .trim();
}

public void clickAndWaitForStateChange() {

  WebElement button = WaitUtils.waitForClickable(driver, toggleButton);

  String oldState = button.getText().trim();

  button.click();

  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

  wait.until(driver ->

          !toggleButton
           .getText()
           .trim()
           .equals(oldState));

  String newState = toggleButton.getText().trim();

  System.out.println( oldState+ " -> "+ newState);
}

public boolean isDynamicButtonDisplayed() {

  WaitUtils.waitForVisibility(
          driver,
          toggleButton);

  return toggleButton.isDisplayed();
}
}