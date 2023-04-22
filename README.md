
# Automation on Whatsapp Web

The test was to check the functionality of Whatsapp Web. Logging in, Searching for Contact, Getting Contact, Messaging them and then putting information on Excel is the process of this Test.

What was used:

-> Java

-> Selenium

-> TestNG

-> IDE : Intellij Idea

## Acknowledgements

 - [Selenium](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.0.0)
 - [TestNG](https://mvnrepository.com/artifact/org.testng/testng/7.4.0)
 - [apache POI](https://mvnrepository.com/artifact/org.apache.poi/poi/4.1.2)
 - [apache POI- ooxml](https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/4.1.2)
 - [Allure - TestNG](https://mvnrepository.com/artifact/io.qameta.allure/allure-testng/2.13.0)
## Installation

selenium dependency in pom.xml

```bash
<dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.0.0</version>
</dependency>
```

TestNG dependency in pom.xml

```bash
<dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version>
            <scope>test</scope>
</dependency>
```


    
## Running Tests

To run tests, run the TestNG_runner.xml

```bash
  <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Suite1" verbose="1" >

    <test name="WhatsApp WEB Test" >
        <classes>
            <class name="Whatsapp_test"/>
        </classes>
    </test>

</suite>

```

