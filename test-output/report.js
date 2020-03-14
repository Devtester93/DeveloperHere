$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("link.feature");
formatter.feature({
  "line": 1,
  "name": "Validate all Links Present in Documents is Working",
  "description": "",
  "id": "validate-all-links-present-in-documents-is-working",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#With Example"
    }
  ],
  "line": 4,
  "name": "Validate Document Links",
  "description": "",
  "id": "validate-all-links-present-in-documents-is-working;validate-document-links",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Developer Here",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \"\u003csearch_Item\u003e\" Link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user Validate all the Links \"\u003csearch_Item\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "validate-all-links-present-in-documents-is-working;validate-document-links;",
  "rows": [
    {
      "cells": [
        "search_Item"
      ],
      "line": 13,
      "id": "validate-all-links-present-in-documents-is-working;validate-document-links;;1"
    },
    {
      "cells": [
        "Documentation"
      ],
      "line": 14,
      "id": "validate-all-links-present-in-documents-is-working;validate-document-links;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Validate Document Links",
  "description": "",
  "id": "validate-all-links-present-in-documents-is-working;validate-document-links;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Developer Here",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \"Documentation\" Link",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user Validate all the Links \"Documentation\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.User_OnLogin()"
});
formatter.result({
  "duration": 20392539600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_Developer_Here()"
});
formatter.result({
  "duration": 234666700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Documentation",
      "offset": 16
    }
  ],
  "location": "LoginStepDefination.user_clicks_on_search_Item_Link(String)"
});
formatter.result({
  "duration": 11928426899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Documentation",
      "offset": 29
    }
  ],
  "location": "LoginStepDefination.user_Validate_all_the_Links(String)"
});
formatter.result({
  "duration": 20236332299,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d80.0.3987.132)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DEBENDRA\u0027, ip: \u0027192.168.29.189\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d80.0.3987.106 (f68069574609230cf9b635cd784cfb1bf81bb53a-refs/branch-heads/3987@{#882}), userDataDir\u003dC:\\Users\\debub\\AppData\\Local\\Temp\\scoped_dir2052_472194653}, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:59620}, acceptInsecureCerts\u003dfalse, browserVersion\u003d80.0.3987.132, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue}]\nSession ID: b9a180989a042d4fd69f086f81115551\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.getText(RemoteWebElement.java:156)\r\n\tat StepDefination.LoginStepDefination.user_Validate_all_the_Links(LoginStepDefination.java:66)\r\n\tat ✽.Then user Validate all the Links \"Documentation\"(link.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});