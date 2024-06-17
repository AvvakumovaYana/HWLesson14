import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AstondevsRuTest extends TestBase {

    @Tag("main")
    @DisplayName("Проверка разделов меню на главной странице")
    @Test
    void menuOnMainPageTest() {
        step("Открываем главную страницу сайта", () -> {
            open("/");
        });
        step("Проверяем наличие раздела 'О нас' в меню сайта", () -> {
            $("[href=\"\\/about-us\"]").shouldBe(visible).shouldHave(text("О нас"));
        });
        step("Проверяем наличие раздела 'Услуги' с выпадающим списком в меню сайта", () -> {
            $("#menu-button-\\:Rl799bqH1\\:").shouldBe(visible).shouldHave(text("Услуги"));
            $("#menu-button-\\:Rl799bqH1\\:").click();
            $("[href=\"\\/1C\"]").shouldBe(visible).shouldHave(text("1С-разработка"));
            $("[href=\"\\/services/managed-delivery\"]").shouldBe(visible).shouldHave(text("Проектная разработка"));
            $("[href=\"\\/services/software-team-staff-augmentation\"]").shouldBe(visible).shouldHave(text("Расширение команды"));
            $("[href=\"\\/services/financial-services\"]").shouldBe(visible).shouldHave(text("ФинТех"));
        });
        step("Проверяем наличие раздела 'Проекты' в меню сайта", () -> {
            $("[href=\"\\/our-projects\"]").shouldBe(visible).shouldHave(text("Проекты"));
        });
        step("Проверяем наличие раздела 'Работа в ASTON' с выпадающим списком в меню сайта", () -> {
            $("#menu-button-\\:Rp799bqH1\\:").shouldBe(visible).shouldHave(text("Работа в ASTON"));
            $("#menu-button-\\:Rp799bqH1\\:").click();
            $("[href=\"\\https://career.astondevs.ru/\"]").shouldBe(visible).shouldHave(text("Карьера"));
            $("[href=\"\\https://career.astondevs.ru/vacancy\"]").shouldBe(visible).shouldHave(text("Вакансии"));
            $("[href=\"\\https://career.astondevs.ru/trainee\"]").shouldBe(visible).shouldHave(text("Стажировка"));
        });
    }

    @Tag("main")
    @DisplayName("Проверка перехода по разделам меню с главной страницы (кроме 'Работа в ASTON')")
    @Test
    void menuLinksOnMainPageTest() {
        step("Открываем главную страницу сайта", () -> {
            open("/");
        });
        step("Проверяем переход в раздел 'О нас'", () -> {
            $("[href=\"\\/about-us\"]").click();
            $(".css-xi606m").shouldHave(text("Высокие стандарты, изящные решения"));
            Selenide.back();
        });
        step("Проверяем переход в раздел 'Услуги > 1С-разработка'", () -> {
            $("#menu-button-\\:Rl799bqH1\\:").click();
            $("[href=\"\\/1C\"]").click();
            $(".css-1rqn5if").shouldHave(text("1С-решения для автоматизации бизнеса"));
            Selenide.back();
        });
        step("Проверяем переход в раздел 'Услуги > Проектная разработка'", () -> {
            $("#menu-button-\\:Rl799bqH1\\:").click();
            $("[href=\"\\/services/managed-delivery\"]").click();
            $(".css-v01be4").shouldHave(text("Проектная разработка под ключ"));
            Selenide.back();
        });
        step("Проверяем переход в раздел 'Услуги > Расширение команды'", () -> {
            $("#menu-button-\\:Rl799bqH1\\:").click();
            $("[href=\"\\/services/software-team-staff-augmentation\"]").click();
            $(".css-18el68v").shouldHave(text("Талантливые ИТ-специалисты для вашего проекта"));
            Selenide.back();
        });
        step("Проверяем переход в раздел 'Услуги > ФинТех'", () -> {
            $("#menu-button-\\:Rl799bqH1\\:").click();
            $("[href=\"\\/services/financial-services\"]").click();
            $(".css-xudeyq").shouldHave(text("Разработка финансового ПО"));
            Selenide.back();
        });
        step("Проверяем переход в раздел 'Проекты'", () -> {
            $("[href=\"\\/our-projects\"]").click();
            $(".css-1cj14b4").shouldHave(text("Разработки и отраслевые решения"));
            Selenide.back();
        });
    }

    @Tag("main")
    @DisplayName("Проверка перехода по подразделам 'Работа в ASTON' с главной страницы")
    @Test
    void workInAstonLinksOnMainPageTest() {
        step("Открываем главную страницу сайта", () -> {
            open("/");
        });
        step("Проверяем переход в раздел 'Работа в ASTON > Карьера'", () -> {
            $("#menu-button-\\:Rp799bqH1\\:").click();
            $("[href=\"\\https://career.astondevs.ru/\"]").click();
        });
        step("Проверяем переход в раздел 'Работа в ASTON > Вакансии'", () -> {
            Selenide.switchTo().window(0);
            Thread.sleep(1000);
            $("#menu-button-\\:Rp799bqH1\\:").click();
            $("[href=\"\\https://career.astondevs.ru/vacancy\"]").click();
        });
        step("Проверяем переход в раздел 'Работа в ASTON > Стажировка'", () -> {
            Selenide.switchTo().window(0);
            Thread.sleep(1000);
            $("#menu-button-\\:Rp799bqH1\\:").click();
            $("[href=\"\\https://career.astondevs.ru/trainee\"]").click();
        });
    }

    @Tag("main")
    @DisplayName("Проверка содержания формы заявки на главной странице")
    @Test
    void applicationFormOnMainPageTest() {
        step("Открываем главную страницу сайта", () -> {
            open("/");
        });
        step("Нажимаем кнопку 'Оставить заявку' ", () -> {
            $(".css-1pqo36s").click();
        });
        step("Провреяем содрежание формы заявки", () -> {
            $(".css-10hujt4")
                    .shouldBe(visible)
                    .shouldHave(text("Заполните заявку"));
            $(".css-cfnfrs")
                    .shouldBe(visible)
                    .shouldHave(text("* - поля, обязательные для заполнения"));
            $("#contact-form > div > form > div:nth-child(3) > div > input")
                    .shouldBe(visible)
                    .shouldHave(attribute("placeholder", "Имя*"));
            $("#contact-form > div > form > div:nth-child(4) > div > input")
                    .shouldBe(visible)
                    .shouldHave(attribute("placeholder", "Компания*"));
            $("#contact-form > div > form > div:nth-child(5) > div > input")
                    .shouldBe(visible)
                    .shouldHave(attribute("placeholder", "Номер телефoнa*"));
            $("#contact-form > div > form > div:nth-child(7) > div > textarea")
                    .shouldBe(visible)
                    .shouldHave(attribute("placeholder", "Опишите ваш ИТ-проект*"));
            $(".css-1obsyrc")
                    .shouldBe(visible)
                    .shouldHave(text("Нажимая на кнопку, вы соглашаетесь на обработку персональных " +
                    "данных и c правилами пользования"));
            $("#contact-form > div > form > button").shouldBe(visible).shouldHave(text("Отправить"));
        });
    }

    @Tag("main")
    @DisplayName("Негативная проверка отправки формы заявки без заполнения обязательного поля 'E-mail'")
    @Test
    void sendFormWithoutEmailTest() {
        step("Открываем главную страницу сайта", () -> {
            open("/");
            $(".css-5jylfw").click();
        });
        step("Нажимаем кнопку 'Оставить заявку' ", () -> {
            $(".css-1pqo36s").click();
        });
        step("Заполняем обязательные поля формы, кроме поля 'E-mail'", () -> {
            $("#contact-form > div > form > div:nth-child(3) > div > input")
                    .setValue("Яна");
            $("#contact-form > div > form > div:nth-child(4) > div > input")
                    .setValue("Тестовая компания");
            $("#contact-form > div > form > div:nth-child(5) > div > input")
                    .setValue("+79998887766");
            $("#contact-form > div > form > div:nth-child(7) > div > textarea")
                    .setValue("Описание тестового проекта");
        });
        step("Отправляем форму", () -> {
            $("#contact-form > div > form > button").click();
        });
        step("Проверяем валидацию поля 'E-mail'", () -> {
            $(".css-1sdtoc1")
                    .shouldBe(visible)
                    .shouldHave(text("Укажите E-mail"));
        });
        step("Проверяем, что кнопка 'Отправить' некликабельна ", () -> {
            $("#contact-form > div > form > button").shouldHave(attribute("disabled"));
        });
    }
}
