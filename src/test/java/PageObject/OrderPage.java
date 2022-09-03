package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class OrderPage extends BasePage {
    //конструктор класса
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    //локатор поля "Имя"
    private By firstNameField = By.xpath(".//input[@placeholder = '* Имя']");
    //локатор поля "Фамилия"
    private By secondNameField = By.xpath(".//input[@placeholder = '* Фамилия']");
    //локатор поля "Адрес: куда привезти заказ"
    private By adressField = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    //локатор поля "Станция метро"
    private By subwayField = By.xpath(".//input[@placeholder = '* Станция метро']");
    //локатор поля "Телефон: на него позвонит курьер"
    private By phoneNumberField = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    //локатор кнопки "Далее"
    private By nextButton = By.xpath(".//button[text() = 'Далее']");
    //локатор поля "Когда привезти самокат"
    private By calendarField= By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    //локатор поля "Срок аренды"
    private By rentDurationField = By.xpath(".//div[text() = '* Срок аренды']");
    //локатор для элемента "двое суток" в дроп дауне срока аренды
    private By twoDays = By.xpath(".//div[text() = 'двое суток']");
    //локатор для чек-бокса выбора цвета "чёрный жемчуг"
    private By blackColorCheckBox = By.xpath(".//input[@id = 'black']");
    //локтаор для поля "Комментарий для курьера"
    private By commentField = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    //локатор кнопки "Заказать" под формой оформления заказа на втором шаге
    private By orderButtonUnderForm = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[text() = 'Заказать']");
    //локатор кнопки "Да" в форме "Хотите оформить заказ?"
    private By yesButton = By.xpath(".//button[text() = 'Да']");
    //локатор модального окна "Заказ оформлен"
    private By orderCreatedForm = By.xpath(".//div[text() = 'Заказ оформлен']");

    //метод заполняет поле "Имя" в форме заказа
    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    //метод заполняет поле "Фамилия" в форме заказа
    public void setSecondNameField(String secondName) {
        driver.findElement(secondNameField).sendKeys(secondName);
    }
    //метод заполняет поле "Адрес" в форме заказа
    public void setAddressField(String adress) {
        driver.findElement(adressField).sendKeys(adress);
    }
    //метод кликает поле "Станция метро" в форме заказа и выбирает станцию
    public void setSubwayField(String subway) {
        driver.findElement(subwayField).click();
        driver.findElement(subwayField).sendKeys(subway + " ");
        new Actions(driver)
                .moveToElement(driver.findElement(subwayField), 100, 48)
                .click()
                .perform();
    }
    //метод заполняет поле "Телефон: на него позвонит курьер"
    public void setPhoneNumberField(String number) {
        driver.findElement(phoneNumberField).sendKeys(number);
    }
    //метод кликает по кнопке "Далее" в форме "Для кого самокат"
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }
    //метод заполняет поле "Когда привезти самокат"
    public void setCalendarField(String date) {
        driver.findElement(calendarField).sendKeys(date);
        //клик вне поля, чтобы скрыть виджет календаря
        new Actions(driver)
                .moveToElement(driver.findElement(calendarField), 0, -48)
                .click()
                .perform();
    }
    //метод заполняет поле "Срок аренды" значением "двое суток"
    public void setRentDurationField() {
        driver.findElement(rentDurationField).click();
        driver.findElement(twoDays).click();
    }
    //метод выбирает цвет самоката "черный жемчуг"
    public void setBlackColorCheckBox() {
        driver.findElement(blackColorCheckBox).click();
    }
    //метод заполняет поле "Комментарий для курьера"
    public void setCommentField(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }
    //метод нажимает на кнопку "Заказать"
    public void clickOrderButtonUnderForm() {
        driver.findElement(orderButtonUnderForm).click();
    }
    //Метод нажимает на кнопку "Да" в форме "Хотите оформить заказ?"
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    //метод заполняет все поля формы заказа самоката и оформляет заказ
    public void setOrderForm(String firstName,
                             String secondName,
                             String address,
                             String subway,
                             String number,
                             String date,
                             String comment) {
        setFirstNameField(firstName);
        setSecondNameField(secondName);
        setAddressField(address);
        setSubwayField(subway);
        setPhoneNumberField(number);
        clickNextButton();
        setCalendarField(date);
        setRentDurationField();
        setBlackColorCheckBox();
        setCommentField(comment);
        clickOrderButtonUnderForm();
        clickYesButton();
    }

    //метод проверяет появилась ли форма "Заказ оформлен"
    public boolean assertOrderCreated() {
        return driver.findElement(orderCreatedForm).isDisplayed();
    }
}
