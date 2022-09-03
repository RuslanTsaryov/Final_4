import PageObject.MainPage;
import PageObject.OrderPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderScooter extends BaseTest {
    @Test
    public void orderScooterInHeader() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        //вызов метода для нажатия кнопки "Заказать" в хедере
        mainPage.clickOrderButtonHead();
        //создаём объект класса страницы order
        OrderPage orderPage = new OrderPage(driver);
        //метод заполняет форму оформления заказа
        orderPage.setOrderForm("Александр",
                "Агафонов",
                "Пушкинская, д. 4",
                "Сокольники",
                "89001234567",
                "24.09.2022",
                "Как же я люблю самокаты");
        //проверим: после оформления заказа появляется форма "Заказ оформлен"
        assertEquals(true, orderPage.assertOrderCreated());
    }

    @Test
    public void orderScooterInBody() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //вызов метода для нажатия кнопки "Заказать" в теле
        mainPage.clickOrderButtonBody();
        //создаём объект класса страницы order
        OrderPage orderPage = new OrderPage(driver);
        orderPage.setOrderForm("Борис",
                "Бананов",
                "Трубочистов, д. 84",
                "Динамо",
                "87771112233",
                "29.09.2022",
                "Привет от Бориса");
        //проверим: после оформления заказа появляется форма "Заказ оформлен"
        assertEquals(true, orderPage.assertOrderCreated());
    }
}
