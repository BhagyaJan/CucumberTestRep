$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FEATURES423423/LoginPage.feature");
formatter.feature({
  "name": "verifying adactin Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifiying Login details with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Bhagyaraj",
        "1982bagya"
      ]
    },
    {
      "cells": [
        "dfgfd",
        "ggdgfg"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.users_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verfy the message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_verfy_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verifying the search hotel page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user select the \"\u003clocation\u003e\", \"\u003chotel\u003e\", \"\u003croomType\u003e\", \"\u003cnoofRooms\u003e\", \"\u003ccinDate\u003e\", \"\u003ccoutDate\u003e\", \"\u003cadultRoom\u003e\", \"\u003cchildRoom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click search button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location",
        "hotel",
        "roomType",
        "noofRooms",
        "cinDate",
        "coutDate",
        "adultRoom",
        "childRoom"
      ]
    },
    {
      "cells": [
        "London",
        "Hotel Cornice",
        "Standard",
        "1 - One",
        "13/03/2020",
        "15/03/2020",
        "2 - Two",
        "2 - Two"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying the search hotel page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user select the \"London\", \"Hotel Cornice\", \"Standard\", \"1 - One\", \"13/03/2020\", \"15/03/2020\", \"2 - Two\", \"2 - Two\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_select_the(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying the select hotel page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should click checkbox",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_should_click_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verifying the Book a hotel page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter the \"\u003cfirstname\u003e\", \"\u003clastname\u003e\", \"\u003caddress\u003e\", \"\u003ccreditCardno\u003e\", \"\u003ccardType\u003e\", \"\u003cexpiryMonth\u003e\", \"\u003cexpiryYear\u003e\", \"\u003ccvv\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click book now button",
  "keyword": "And "
});
formatter.step({
  "name": "user should verfy the orderid",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "address",
        "creditCardno",
        "cardType",
        "expiryMonth",
        "expiryYear",
        "cvv"
      ]
    },
    {
      "cells": [
        "Suresh",
        "Kumar",
        "Trichy",
        "4210021007006120",
        "MAST",
        "3",
        "2022",
        "683"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying the Book a hotel page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter the \"Suresh\", \"Kumar\", \"Trichy\", \"4210021007006120\", \"MAST\", \"3\", \"2022\", \"683\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_enter_the(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click book now button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_should_click_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verfy the orderid",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_verfy_the_orderid()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#order_no\"}\n  (Session info: chrome\u003d80.0.3987.106)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BAGYA-HP\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.106, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\Bagya\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51218}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3a83a24672a32d1864e9d0dbc71d9ef0\n*** Element info: {Using\u003did, value\u003dorder_no}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getAttribute(Unknown Source)\r\n\tat com.stepdefinition.LoginPage.user_should_verfy_the_orderid(LoginPage.java:172)\r\n\tat ✽.user should verfy the orderid(file:src/test/resources/FEATURES423423/LoginPage.feature:44)\r\n",
  "status": "failed"
});
});