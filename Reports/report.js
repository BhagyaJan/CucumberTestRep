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
  "status": "passed"
});
});