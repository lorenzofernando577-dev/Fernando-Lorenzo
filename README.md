# QA Automation Challenge – SauceDemo

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- RestAssured
- Maven

## What is included

✔ Login automated tests  
✔ Cart automated tests  
✔ API test (MercadoLibre departments endpoint)  
✔ One failing test (for reporting validation)  
✔ Cross-browser execution (Chrome + Firefox)

## Project structure

src/main/java/utils → Driver utilities  
src/test/java/tests → Automated tests  

## How to run

1. Clone repository

git clone https://github.com/YOUR_USER/qa-automation-challenge.git

2. Install dependencies

mvn clean install

3. Run tests

mvn test

## Browsers

Configured in **testng.xml**

Chrome  
Firefox

## Notes

One test intentionally fails to demonstrate reporting behavior.