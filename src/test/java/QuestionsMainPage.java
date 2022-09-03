import PageObject.MainPage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuestionsMainPage extends BaseTest {
    @Test
    public void assertTextOfFirstQuestion() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        //ожидаемый результат для текста первого вопроса
        String expectedFirstQuestion = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        //сравнение\ ожидаемого и фактического результата
        assertEquals(expectedFirstQuestion, mainPage.getTextOfFirstQuestion());
    }

    @Test
    public void assertTextOfSecondQuestion() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        //ожидаемый результат для текста второго вопроса
        String expectedSecondQuestion = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        //сравнение ожидаемого и фактического результата
        assertEquals(expectedSecondQuestion, mainPage.getTextOfSecondQuestion());
    }

    @Test
    public void assertTextOfThirdQuestion() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        //ожидаемый результат для текста третьего вопроса
        String expectedThirdQuestion = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        //сравнение ожидаемого и фактического результата
        assertEquals(expectedThirdQuestion, mainPage.getTextOfThirdQuestion());
    }

    @Test
    public void assertTextOfFourthQuestion() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        //ожидаемый результат для текста четвёртого вопроса
        String expectedFourthQuestion = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        //сравнение ожидаемого и фактического результата
        assertEquals(expectedFourthQuestion, mainPage.getTextOfFourthQuestion());
    }

    @Test
    public void assertTextOfFifthQuestion() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        //ожидаемый результат для текста пятого вопроса
        String expectedFifthQuestion = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        //сравнение ожидаемого и фактического результата
        assertEquals(expectedFifthQuestion, mainPage.getTextOfFifthQuestion());
    }

    @Test
    public void assertTextOfSixthQuestion() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        //ожидаемый результат для текста шестого вопроса
        String expectedSixthQuestion = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        //сравнение ожидаемого и фактического результата
        assertEquals(expectedSixthQuestion, mainPage.getTextOfSixthQuestion());
    }

    @Test
    public void assertTextOfSeventhQuestion() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        //ожидаемый результат для текста седьмого вопроса
        String expectedSeventhQuestion = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        //сравнение ожидаемого и фактического результата
        assertEquals(expectedSeventhQuestion, mainPage.getTextOfSeventhQuestion());
    }

    @Test
    public void assertTextOfEighthQuestion() {
        //создаём объект класса главной страницы
        MainPage mainPage = new MainPage(driver);
        //ожидаемый результат для текста восьмого вопроса
        String expectedEighthQuestion = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        //сравнение ожидаемого и фактического результата
        assertEquals(expectedEighthQuestion, mainPage.getTextOfEighthQuestion());
    }
}
