# Simple Automated Web Testing

<div align="center" >
<img src="https://github.com/user-attachments/assets/14ce3024-03e2-4a9d-abcb-09162f6991d7" alt="Postman" width="450">
</div>

## Description
TestSwagLabs is a test automation project for the Swag Labs website using Selenium WebDriver, JUnit, and Allure for reporting.

 ### 🛠️ Tech Stack:

![java](https://img.shields.io/badge/-Java-red?style=for-the-badge&logo=data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/PjwhRE9DVFlQRSBzdmcgIFBVQkxJQyAnLS8vVzNDLy9EVEQgU1ZHIDEuMS8vRU4nICAnaHR0cDovL3d3dy53My5vcmcvR3JhcGhpY3MvU1ZHLzEuMS9EVEQvc3ZnMTEuZHRkJz48c3ZnIGhlaWdodD0iNTEycHgiIHN0eWxlPSJlbmFibGUtYmFja2dyb3VuZDpuZXcgMCAwIDUxMiA1MTI7IiB2ZXJzaW9uPSIxLjEiIHZpZXdCb3g9IjAgMCA1MTIgNTEyIiB3aWR0aD0iNTEycHgiIHhtbDpzcGFjZT0icHJlc2VydmUiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgeG1sbnM6eGxpbms9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkveGxpbmsiPjxnIGlkPSJfeDMxXzgxLWphdmEiPjxnPjxwYXRoIGQ9Ik0zMzMuMjgzLDMwNy4xMTdjOC44MDctNi4wMiwyMS4wMjMtMTEuMjMsMjEuMDIzLTExLjIzcy0zNC43NjgsNi4yOS02OS4zNTcsOS4xNjUgICAgYy00Mi4zMTUsMy41MDMtODcuNzc1LDQuMjIxLTExMC41OTUsMS4xNjdjLTUzLjk5Ni03LjE4NywyOS42NDctMjcuMDQ0LDI5LjY0Ny0yNy4wNDRzLTMyLjQzMy0yLjE1NC03Mi40MTMsMTcuMDcgICAgQzg0LjQyMiwzMTkuMDY2LDI0OC4zODMsMzI5LjQ4NywzMzMuMjgzLDMwNy4xMTd6IiBzdHlsZT0iZmlsbDojNTM4MkExOyIvPjxwYXRoIGQ9Ik0yNTYuNTYsMjc4LjI3N2MtMTcuMDctMzguMzYyLTc0LjY1OS03Mi4wNTQsMC0xMzAuOTlDMzQ5LjcyNyw3My43OTcsMzAxLjkzLDI2LDMwMS45MywyNiAgICBjMTkuMzE2LDc1LjkxNy02Ny45Miw5OC45MTctOTkuNDU2LDE0Ni4wODRDMTgxLjAwMSwyMDQuMzM3LDIxMi45ODYsMjM4LjkyNywyNTYuNTYsMjc4LjI3N3oiIHN0eWxlPSJmaWxsOiNGODk4MUQ7Ii8+PHBhdGggZD0iTTM1OS41MTgsMTE5Ljk3NWMwLjA5LDAtMTU3LjQwMywzOS4zNTEtODIuMjA1LDEyNS45NThjMjIuMTkxLDI1LjUxNi01Ljg0LDQ4LjUxNi01Ljg0LDQ4LjUxNiAgICBzNTYuMzMyLTI5LjEwOCwzMC40NTctNjUuNDk1QzI3Ny43NjIsMTk0Ljk5MywyNTkuMjU0LDE3OC4xMDMsMzU5LjUxOCwxMTkuOTc1eiIgc3R5bGU9ImZpbGw6I0Y4OTgxRDsiLz48cGF0aCBkPSJNMzU0LjAzOSwzNjIuOTk5Yy0wLjQ0OSwxLjA3OC0xLjc5NywyLjI0Ny0xLjc5NywyLjMzNiAgICBjMTE1LjI2Ni0zMC4yNzcsNzIuODYxLTEwNi44MjQsMTcuNzg3LTg3LjQxNmMtNC44NTIsMS43MDctNy4zNjUsNS42Ni03LjM2NSw1LjY2czMuMDUzLTEuMjU5LDkuODgzLTIuNjk2ICAgIEM0MDAuMzk2LDI3NS4wNDQsNDQwLjM3NywzMTguMTY4LDM1NC4wMzksMzYyLjk5OUwzNTQuMDM5LDM2Mi45OTl6IiBzdHlsZT0iZmlsbDojNTM4MkExOyIvPjxwYXRoIGQ9Ik0zOTYuNDQzLDQxOC45NzFjMCwwLDEzLjAyNywxMC42OTItMTQuMjg1LDE5LjA0N2MtNTIuMDE4LDE1LjcyMi0yMTYuMzM5LDIwLjQ4My0yNjEuOTc5LDAuNjMgICAgYy0xNi40NDEtNy4wOTksMTQuMzc0LTE3LjA3MiwyNC4wNzgtMTkuMTM3YzEwLjA2MS0yLjE1NywxNS45MDEtMS43OTksMTUuOTAxLTEuNzk5Yy0xOC4yMzgtMTIuODQ3LTExNy45NjMsMjUuMjQ3LTUwLjY3MSwzNi4xMTkgICAgQzI5Mi45NDUsNDgzLjY1Nyw0NDQuMDYxLDQ0MC40NDMsMzk2LjQ0Myw0MTguOTcxTDM5Ni40NDMsNDE4Ljk3MXoiIHN0eWxlPSJmaWxsOiM1MzgyQTE7Ii8+PHBhdGggZD0iTTE5NS41NTcsMzgxLjc3NmMtNzAuNzA2LDE5Ljc2Niw0My4wMzUsNjAuNTU1LDEzMy4wNTUsMjIuMDExICAgIGMtMTQuNzMyLTUuNzQ4LTI1LjMzNC0xMi4zOTctMjUuMzM0LTEyLjM5N2MtNDAuMTYsNy42MzctNTguNzU2LDguMTc1LTk1LjIzMyw0LjA0MyAgICBDMTc3Ljk0OCwzOTIuMDE5LDE5NS41NTcsMzgxLjc3NiwxOTUuNTU3LDM4MS43NzZMMTk1LjU1NywzODEuNzc2eiIgc3R5bGU9ImZpbGw6IzUzODJBMTsiLz48cGF0aCBkPSJNMzU3LjA5Miw0NjkuMTAzYy03MC43MDUsMTMuMjk2LTE1Ny45NDEsMTEuNzcxLTIwOS42MDIsMy4yMzNjMC0wLjA4OCwxMC42MDIsOC43MTYsNjUuMDQ2LDEyLjIyICAgIGM4Mi44MzQsNS4zMDIsMjEwLjA1MS0yLjk2NiwyMTMuMDE2LTQyLjEzNkM0MjUuNTUzLDQ0Mi40Miw0MTkuODAzLDQ1Ny4yNDUsMzU3LjA5Miw0NjkuMTAzTDM1Ny4wOTIsNDY5LjEwM3oiIHN0eWxlPSJmaWxsOiM1MzgyQTE7Ii8+PHBhdGggZD0iTTMxNy45MjIsMzQzLjE0NGMtNTMuMTg4LDEwLjI0My04NC4wMDMsOS45NzMtMTIyLjkwNCw1LjkzICAgIGMtMzAuMDk4LTMuMTQ1LTEwLjQyMi0xNy42OTgtMTAuNDIyLTE3LjY5OGMtNzcuOTgyLDI1Ljg3NCw0My4zMDQsNTUuMTY0LDE1Mi4yODEsMjMuMjY5ICAgIEMzMjUuMjg5LDM1MC42MDEsMzE3LjkyMiwzNDMuMTQ0LDMxNy45MjIsMzQzLjE0NHoiIHN0eWxlPSJmaWxsOiM1MzgyQTE7Ii8+PC9nPjwvZz48ZyBpZD0iTGF5ZXJfMSIvPjwvc3ZnPg==&style=flat&labelColor=FFFFFF)
![Selenium](https://img.shields.io/badge/-selenium-43B02A?style=flat&logo=selenium&labelColor=FFFFFF)
![vscode](https://img.shields.io/badge/-VSCode-545454?style=for-the-badge&logo=data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/PjxzdmcgaGVpZ2h0PSIyNCIgdmlld0JveD0iMCAwIDI0IDI0IiB3aWR0aD0iMjQiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PHBhdGggZD0ibTIxLjI5IDQuMS00LjEyLTJhMS4zNiAxLjM2IDAgMCAwLS40OC0uMWgtLjA4YTEuMTggMS4xOCAwIDAgMC0uNzIuMjRsLS4xNC4xMi03Ljg4IDcuMTlMNC40NCA3YS44My44MyAwIDAgMC0uNTQtLjE3Ljg4Ljg4IDAgMCAwLS41My4xN2wtMS4xIDFhLjguOCAwIDAgMC0uMjcuNjEuODQuODQgMCAwIDAgLjI3LjYybDMgMi43MS0zIDIuNzJhLjg0Ljg0IDAgMCAwIDAgMS4yM2wxLjEgMWEuODkuODkgMCAwIDAgLjYuMjIuOTMuOTMgMCAwIDAgLjQ3LS4xN2wzLjQzLTIuNjEgNy44OCA3LjE5YTEuMiAxLjIgMCAwIDAgLjc2LjM2aC4xN2ExIDEgMCAwIDAgLjQ5LS4xMmw0LjEyLTJhMS4yNSAxLjI1IDAgMCAwIC43MS0xLjFWNS4yM2ExLjI2IDEuMjYgMCAwIDAtLjcxLTEuMTN6TTE3IDE2LjQ3bC02LTQuNTMgNi00LjUzeiIvPjwvc3ZnPg==&style=flat&labelColor=FFFFFF)
![GitHub](https://img.shields.io/badge/-GitHub-545454?style=flat&logo=github)
![Linux](https://img.shields.io/badge/-Linux-545454?style=flat&logo=linux)



## Prerequisites

Ensure you have the following software installed on your system:

- [Java Development Kit (JDK) 8 or later](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Google Chrome](https://www.google.com/chrome/)
- [Allure Commandline](https://docs.qameta.io/allure/)

## Project Structure

TestSwagLabs/<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── .vscode/<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── launch.json<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── settings.json<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── tasks.json<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── lib/<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── allure-commons-2.13.9.jar<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── allure-junit4-2.13.9.jar<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── byte-buddy-1.10.19.jar<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── hamcrest-core-1.3.jar<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── junit-4.13.2.jar<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── selenium-server-4.23.0.jar<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── webdrivermanager-5.9.2-fat.jar<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── out/<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── src/<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── main/<br>
│ &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── java/<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── com/<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── example/<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── test/<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── TestSwagLabs.java<br>
│ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|── allure-results/<br>


## Setup Instructions

### Clone the Repository

Clone the project repository from GitHub:

```sh
git clone https://github.com/your-username/TestSwagLabs.git
cd TestSwagLabs
```
### Compile and Run Tests
Create a script called run-tests.sh in the project directory with the following content to compile and run the tests:
```sh
#!/bin/bash

# Ensure the output directory exists
mkdir -p out

# Compile the tests
javac -cp "lib/*" -d out src/main/java/com/example/test/TestSwagLabs.java

# Run the tests
java -cp "out:lib/*" org.junit.runner.JUnitCore com.example.test.TestSwagLabs
```
### Make the script executable:
```sh
chmod +x run-tests.sh
```
### To compile and run the tests, execute:
```sh
./run-tests.sh
```

### Generate Allure Report
After running the tests, you can generate the Allure report:
```sh
allure serve allure-results
```
This command will start a local server and open the Allure report in your default browser.

## Test Details
The test script TestSwagLabs.java includes the following steps:<br>

1. Open Swag Labs login page <br>
2. Validate login page title <br>
3. Enter username and password, then login <br>
4. Validate main page title after login <br>
5. Validate Products section title <br>

The test script also captures a screenshot if an error occurs during execution and attaches it to the Allure report.<br>

Ensure these JAR files are present in the lib/ directory to compile and run the tests successfully. <br>

## Contribution
Feel free to contribute to the project by opening issues and pull requests. Make sure to follow best development practices and document your changes thoroughly.

```go
This `README.md` provides detailed instructions for setting up, compiling, running tests,
and generating reports without using Maven or Gradle.
It also includes project structure, dependencies, and contribution guidelines.
Feel free to adjust any specific details or add additional information as needed.
```
