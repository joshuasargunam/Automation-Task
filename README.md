# Automation-Task

This project automates a trading account creation in ii website. The script opens https://www.ii.co.uk/account-opening/trading-account in chrome browser and enters the basic details of a client.

Have used the concept of inheritance , classes, object and methods , variables in creation of this script.

The main class shows the flow of journey. In TradingAccountPage.class the elements in the page are identified using the selenium locators and all the possible actions in the page are capture in methods. Commonly used actions like opening a webdriver or wait are captured as methods in Helper.class. The TradingAccountPage is linked to Main.class by creating an object of TradingAccountPage. The TradingAccountPage inherits the Helper class. 

Along with java, selenium webdriver 4.1.0 is used to replicate the browser behaviour. The script was created using Intellij IDE

The elements of the page was located using Id and CSS locators.

Improvements:

1. test script can be made to run in different browsers
2. test data for account creation can be sent through seperate file
3. scripts can be written in plain text using BDD cucumber

Steps to run the test

1.clone this repository
2.Right click main class and select Run 'Main'
