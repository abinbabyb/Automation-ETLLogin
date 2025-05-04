# Web Test Automation - Login Functionality
This project automates the login functionality of the dummy login site Practice Test Automation using Selenium WebDriver with Java, TestNG, and the Page Object Model (POM) design pattern.

Technologies Used
Java (JDK 11 or above)

Selenium WebDriver

TestNG

Maven

Page Object Model (POM)

ChromeDriver

Project Structure
LoginAutomation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/              
│   │
│   ├── test/
│   │   └── java/
│   │       └── tests/              
│   │       └── base/               
├── testng.xml                     
├── pom.xml                        
└── README.md          

Setup Instructions
Clone the repository
git clone https://github.com/your-username/LoginAutomation.git
cd LoginAutomation
Open the project in your preferred IDE (like IntelliJ or Eclipse).

Install dependencies
Maven will handle dependencies automatically from the pom.xml.

Update WebDriver path (if needed)
ChromeDriver path is managed in BaseTest.java. Ensure the path is correct for your system.

How to Run Tests
You can run tests in one of the following ways:

Option 1: From Terminal
mvn clean test
Option 2: From IDE
Open testng.xml

Right-click and select Run 'testng.xml'

Test Coverage
Valid login (success scenario)
Invalid login (incorrect username/password)
Blank username/password validations
