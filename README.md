
# Проект по автоматизации тестирования для компании [ASTON](https://astondevs.ru/)  
<div style="text-align: center">
  <div style="display: inline-block">
    <a href="https://astondevs.ru/">
      <img src="media/Logo/AstonLogo.svg" width="150" height="150" alt="IDEA"/>
    </a>
  </div>
</div>

**ASTON** — российская аккредитованная ИТ-компания, четырехкратный обладатель премии «Работодатель года» по версии Habr (2019, 2020, 2021, 2022 гг.). C 2007 года разрабатываем цифровые решения для b2b-клиентов.

## **Содержание:**

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Отчет в Allure</a>

* <a href="#telegram">Уведомление в Telegram</a>

* <a href="#video">Выполнение тестов на Selenoid</a>

<a id="tools"></a>
## **Технологии и инструменты:**

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="media/Logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="media/Logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="media/Logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="media/Logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="media/Logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="media/Logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="media/Logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="media/Logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/Logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>   
</p>

<a id="cases"></a>
## **Примеры автоматизированных тест-кейсов:**

- *Проверка разделов меню на главной странице*
- *Проверка перехода по разделам меню с главной страницы*
- *Проверка перехода по подразделам 'Работа в ASTON' с главной страницы*
- *Проверка содержания формы заявки на главной странице*
- *Негативная проверка отправки формы заявки без заполнения обязательного поля 'E-mail'*

<a id="jenkins"></a>
## **Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Tests%20for%20ASTON/)**
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Tests%20for%20ASTON/"><img src="media/Jenkins.png" alt="Jenkins" width="950"/></a>  
</p>

### Параметры сборки в Jenkins:

- *BROWSER (браузер, по умолчанию chrome)*
- *BROWSER_VERSION (версия браузера, по умолчанию 122.0)*
- *BROWSER_SIZE (размер окна браузера, по умолчанию 1920x1080)*
- *WDHOST (логин, пароль и адрес удаленного сервера Selenoid)*

<a id="console"></a>
### Команды для запуска из терминала
***Локальный запуск:***
```bash  
clean zentist_test
```

***Удалённый запуск через Jenkins:***
```bash  
clean zentist_test
"-DWdhost=${WDHOST}" 
"-DBrowser=${BROWSER}" 
"-DBrowserVersion=${BROWSER_VERSION}" 
"-DBrowserSize=${BROWSER_SIZE}"
```

<a id="allure"></a>
## Отчет в [Allure](https://jenkins.autotests.cloud/job/Tests%20for%20ASTON/5/allure/)
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Tests%20for%20ASTON/5/allure/"><img src="media/Allure2Tests.png" alt="Allure" width="950"/></a>  
</p>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Tests%20for%20ASTON/5/allure/"><img src="media/AllureTests.png" alt="Allure" width="950"/></a>  
</p>

<a id="telegram"></a>
## Уведомление в Telegram
<p align="center">  
<img src="media/TelegramTests.png" alt="Telegram" width="550"/>  
</p>

<a id="video"></a>
## Выполнение тестов на Selenoid
<p align="center">  
<img src="media/AstonTests.mp4" alt="Video" width="550" height="350"/>  
</p>
