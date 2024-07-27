# TestSwagLabs

TestSwagLabs is a test automation project for the Swag Labs website using Selenium WebDriver, JUnit, and Allure for reporting.

## Prerequisites

Ensure you have the following software installed on your system:

- [Java Development Kit (JDK) 8 or later](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Google Chrome](https://www.google.com/chrome/)
- [Allure Commandline](https://docs.qameta.io/allure/)

## Project Structure

TestSwagLabs/
├── lib/
│ ├── allure-commons-2.13.9.jar
│ ├── allure-junit4-2.13.9.jar
│ ├── byte-buddy-1.10.19.jar
│ ├── hamcrest-core-1.3.jar
│ ├── junit-4.13.2.jar
│ ├── selenium-server-4.23.0.jar
│ └── webdrivermanager-5.9.2-fat.jar
├── out/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/
│ │ └── example/
│ │ └── test/
│ │ └── TestSwagLabs.java
├── allure-results/
├── README.md
└── run-tests.sh


## Setup Instructions

### Clone the Repository

Clone the project repository from GitHub:

```sh
git clone https://github.com/your-username/TestSwagLabs.git
cd TestSwagLabs
```
Compile and Run Tests
Create a script called run-tests.sh in the project directory with the following content to compile and run the tests:

#!/bin/bash

# Ensure the output directory exists
mkdir -p out

# Compile the tests
javac -cp "lib/*" -d out src/main/java/com/example/test/TestSwagLabs.java

# Run the tests
java -cp "out:lib/*" org.junit.runner.JUnitCore com.example.test.TestSwagLabs

Make the script executable:

chmod +x run-tests.sh

To compile and run the tests, execute:

./run-tests.sh

Generate Allure Report
After running the tests, you can generate the Allure report:

allure serve allure-results

This command will start a local server and open the Allure report in your default browser.

Test Details
The test script TestSwagLabs.java includes the following steps:

Open Swag Labs login page
Validate login page title
Enter username and password, then login
Validate main page title after login
Validate Products section title
The test script also captures a screenshot if an error occurs during execution and attaches it to the Allure report.

Dependencies
The following JAR files are included in the lib/ directory:

allure-commons-2.13.9.jar
allure-junit4-2.13.9.jar
byte-buddy-1.10.19.jar
hamcrest-core-1.3.jar
junit-4.13.2.jar
selenium-server-4.23.0.jar
webdrivermanager-5.9.2-fat.jar
Ensure these JAR files are present in the lib/ directory to compile and run the tests successfully.

Contribution
Feel free to contribute to the project by opening issues and pull requests. Make sure to follow best development practices and document your changes thoroughly.

```go
This `README.md` provides detailed instructions for setting up, compiling, running tests,
and generating reports without using Maven or Gradle.
It also includes project structure, dependencies, and contribution guidelines.
Feel free to adjust any specific details or add additional information as needed.
```
