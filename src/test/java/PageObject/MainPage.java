package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {
    //конструктор класса
    public MainPage(WebDriver driver) {
        super(driver);
    }

    //локатор кнопки "Заказать" в шапке сайта
    private By orderButtonHead = By.xpath(".//div[@class = 'Header_Nav__AGCXC']/button[text() = 'Заказать']");
    //локатор кнопки "Заказать" в теле сайта
    private By orderButtonBody = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button");
    //локатор всплывающего окна с куками
    private By cookiePopUpButton = By.xpath(".//button[text() = 'да все привыкли']");
    //локатор кнопки первого вопроса в списке "Вопросы о важном"
    private By firstQuestionButton = By.xpath(".//div[text() = 'Сколько это стоит? И как оплатить?']");
    //локатор текста первого вопроса в списке "Вопросы о важном"
    private By firstQuestionText = By.xpath("//p[contains(text(),'Сутки — 400 рублей. Оплата курьеру — наличными')]");
    //локатор кнопки второго вопроса в списке "Вопросы о важном"
    private By secondQuestionButton = By.xpath(".//div[text() = 'Хочу сразу несколько самокатов! Так можно?']");
    //локатор текста второго вопроса в списке "Вопросы о важном"
    private By secondQuestionText = By.xpath("//p[contains(text(),'Пока что у нас так: один заказ — один самокат.')]");
    //локатор кнопки третьего вопроса в списке "Вопросы о важном"
    private By thirdQuestionButton = By.xpath(".//div[text() = 'Как рассчитывается время аренды?']");
    //локатор текста третьего вопроса в списке "Вопросы о важном"
    private By thirdQuestionText = By.xpath("//p[contains(text(),'Допустим, вы оформляете заказ на 8 мая.')]");
    //локатор кнопки четвертого вопроса в списке "Вопросы о важном"
    private By fourthQuestionButton = By.xpath(".//div[text() = 'Можно ли заказать самокат прямо на сегодня?']");
    //локатор текста четвертого вопроса в списке "Вопросы о важном"
    private By fourthQuestionText = By.xpath("//p[contains(text(),'Только начиная с завтрашнего дня.')]");
    //локатор кнопки пятого вопроса в списке "Вопросы о важном"
    private By fifthQuestionButton = By.xpath(".//div[text() = 'Можно ли продлить заказ или вернуть самокат раньше?']");
    //локатор текста пятого вопроса в списке "Вопросы о важном"
    private By fifthQuestionText = By.xpath("//p[contains(text(),'Пока что нет! Но если что-то срочное — всегда')]");
    //локатор кнопки шестого вопроса в списке "Вопросы о важном"
    private By sixthQuestionButton = By.xpath(".//div[text() = 'Вы привозите зарядку вместе с самокатом?']");
    //локатор текста шестого вопроса в списке "Вопросы о важном"
    private By sixthQuestionText = By.xpath("//p[contains(text(),'Самокат приезжает к вам с полной зарядкой.')]");
    //локатор кнопки седьмого вопроса в списке "Вопросы о важном"
    private By seventhQuestionButton = By.xpath(".//div[text() = 'Можно ли отменить заказ?']");
    //локатор текста седьмого вопроса в списке "Вопросы о важном"
    private By seventhQuestionText = By.xpath("//p[contains(text(),'Да, пока самокат не привезли. Штрафа не будет')]");
    //локатор кнопки восьмого вопроса в списке "Вопросы о важном"
    private By eighthQuestionButton = By.xpath(".//div[text() = 'Я жизу за МКАДом, привезёте?']");
    //локатор текста восьмого вопроса в списке "Вопросы о важном"
    private By eighthQuestionText = By.xpath("//p[contains(text(),'Да, обязательно. Всем самокатов! И Москве')]");

    //метод кликает по кнопке "Заказать" в шапке сайта
    public void clickOrderButtonHead() {
        driver.findElement(orderButtonHead).click();
    }
    //метод кликает по кнопке "Заказать" в теле сайта
    public void clickOrderButtonBody() {
        driver.findElement(orderButtonBody).click();
    }
    //метод кликает по кнопке "да все привыкли" в плашке с куками
    public void clickCookiePopupButton() {
        driver.findElement(cookiePopUpButton).click();
        waitForCookiePopupNotVisible();
    }
    //метод кликает по первому вопросу в списке "Вопросы о важном" и получает текст
    public String getTextOfFirstQuestion() {
        driver.findElement(firstQuestionButton).click();
        waitForLoadTextOfFirstQuestion();
        return driver.findElement(firstQuestionText).getText();
    }
    //метод кликает по второму вопросу в списке "Вопросы о важном" и получает текст
    public String getTextOfSecondQuestion() {
        driver.findElement(secondQuestionButton).click();
        waitForLoadTextOfSecondQuestion();
        return driver.findElement(secondQuestionText).getText();
    }
    //метод кликает по третьему вопросу в списке "Вопросы о важном" и получает текст
    public String getTextOfThirdQuestion() {
        driver.findElement(thirdQuestionButton).click();
        waitForLoadTextOfThirdQuestion();
        return driver.findElement(thirdQuestionText).getText();
    }
    //метод кликает по четвертому вопросу в списке "Вопросы о важном" и получает текст
    public String getTextOfFourthQuestion() {
        driver.findElement(fourthQuestionButton).click();
        waitForLoadTextOfFourthQuestion();
        return driver.findElement(fourthQuestionText).getText();
    }
    //метод кликает по пятому вопросу в списке "Вопросы о важном" и получает текст
    public String getTextOfFifthQuestion() {
        driver.findElement(fifthQuestionButton).click();
        waitForLoadTextOfFifthQuestion();
        return driver.findElement(fifthQuestionText).getText();

    }
    //метод кликает по шестому вопросу в списке "Вопросы о важном" и получает текст
    public String getTextOfSixthQuestion() {
        driver.findElement(sixthQuestionButton).click();
        waitForLoadTextOfSixthQuestion();
        return driver.findElement(sixthQuestionText).getText();
    }
    //метод кликает по седьмому вопросу в списке "Вопросы о важном" и получает текст
    public String getTextOfSeventhQuestion() {
        driver.findElement(seventhQuestionButton).click();
        waitForLoadTextOfSeventhQuestion();
        return driver.findElement(seventhQuestionText).getText();
    }
    //метод кликает по восьмому вопросу в списке "Вопросы о важном" и получает текст
    public String getTextOfEighthQuestion() {
        driver.findElement(eighthQuestionButton).click();
        waitForLoadTextOfEighthQuestion();
        return driver.findElement(eighthQuestionText).getText();
    }

    //метод ожидания пока исчезнет плашка с куками
    public void waitForCookiePopupNotVisible() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.invisibilityOfElementLocated(cookiePopUpButton));
    }
    //метод ожидания загрузки текста первого вопроса
    public void waitForLoadTextOfFirstQuestion() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(firstQuestionText));
    }
    //метод ожидания загрузки текста второго вопроса
    public void waitForLoadTextOfSecondQuestion() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(secondQuestionText));
    }
    //метод ожидания загрузки текста третьего вопроса
    public void waitForLoadTextOfThirdQuestion() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(thirdQuestionText));
    }
    //метод ожидания загрузки текста четвёртого вопроса
    public void waitForLoadTextOfFourthQuestion() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(fourthQuestionText));
    }
    //метод ожидания загрузки текста пятого вопроса
    public void waitForLoadTextOfFifthQuestion() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(fifthQuestionText));
    }
    //метод ожидания загрузки текста шестого вопроса
    public void waitForLoadTextOfSixthQuestion() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(sixthQuestionText));
    }
    //метод ожидания загрузки текста седьмого вопроса
    public void waitForLoadTextOfSeventhQuestion() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(seventhQuestionText));
    }
    //метод ожидания загрузки текста восьмого вопроса
    public void waitForLoadTextOfEighthQuestion() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(eighthQuestionText));
    }
}
