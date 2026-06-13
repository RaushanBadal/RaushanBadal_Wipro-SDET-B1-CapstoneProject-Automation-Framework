# GUI Automation Framework

## Project Overview

This project is a Selenium Test Automation Framework developed using Java, TestNG, Maven, and the Page Object Model (POM) design pattern.

The framework automates various GUI components available on the Test Automation Practice website and demonstrates industry-standard automation practices including reporting, logging, screenshots, data-driven testing, and CI/CD support.

## Application Under Test

Website:

https://testautomationpractice.blogspot.com

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Apache POI
- Log4j2
- Extent Reports
- WebDriverManager
- Jenkins (CI/CD)
- Git & GitHub

## Framework Design Pattern

- Page Object Model (POM)
- Utility-Based Architecture
- Listener Implementation
- Data-Driven Testing
- Configuration-Based Execution

## Framework Features

### Test Execution
- TestNG XML Execution
- Maven Build Support
- Jenkins Pipeline Support

### Reporting & Logging
- Extent HTML Reports
- Log4j2 Logging
- Screenshots on Failure

### Test Data Management
- External Configuration using Properties File
- Excel Data-Driven Testing using Apache POI
- Constants-Based Test Data Support

### Synchronization
- Explicit Wait Utilities
- Implicit Wait Configuration

---

## Test Scenarios Covered

### TC01 – Text Fields
- Enter and verify Name
- Enter and verify Email
- Enter and verify Phone Number
- Enter and verify Address

### TC02 – Radio Button
- Verify Male Radio Button Selection

### TC03 – Check Boxes
- Verify Multiple Checkbox Selection

### TC04 – Dropdowns
- Verify Country Selection
- Verify Color Selection
- Verify Animal Selection

### TC05 – Date Pickers
- Verify Multiple Date Picker Inputs

### TC06 – File Upload
- Verify Single File Upload

### TC07 – Slider
- Verify Slider Functionality

### TC08 – Alerts
- Simple Alert
- Confirmation Alert
- Prompt Alert

### TC09 – Mouse Hover
- Verify Mouse Hover Operation

### TC10 – Double Click
- Verify Text Copy Functionality

### TC11 – Drag and Drop
- Verify Drag and Drop Operation

### TC12 – Form Sections
- Verify Multiple Form Submissions

### TC13 – Excel Data-Driven Testing
- Execute Multiple Test Iterations using Excel Data

### TC14 – Download Files
- Generate and Download Text/PDF Files

### TC15 – Dynamic Button
- Verify START → STOP → START State Transition

---

## Framework Structure

```
GUIAutomationFramework
│
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── base
│   │   │   ├── constants
│   │   │   ├── listeners
│   │   │   ├── pages
│   │   │   ├── testcases
│   │   │   └── utilities
│   │   │
│   │   └── resources
│   │       ├── config.properties
│   │       ├── log4j2.xml
│   │       ├── TextFieldsData.xlsx
│   │       └── testdata.txt
│
├── reports
├── screenshots
├── logs
├── pom.xml
├── testng.xml
├── Jenkinsfile
└── README.md
```

---

## Reports Generated

### Extent Report

Generated at:
<img width="1918" height="1036" alt="image" src="https://github.com/user-attachments/assets/a12d2aaf-6a17-47ab-aed0-c0ed81c23ea3" />


## Jenkins Integration

The framework supports Jenkins Pipeline execution using the provided Jenkinsfile.
<img width="1918" height="1078" alt="Screenshot 2026-06-13 131123" src="https://github.com/user-attachments/assets/96b77992-1853-4cfb-b0bf-d0507b0111f4" />

<img width="1912" height="1078" alt="Screenshot 2026-06-13 131147" src="https://github.com/user-attachments/assets/937c3064-f280-4546-aa4a-9cdc9806f5b6" />


## Test Execution Summary

```
Total Test Classes : 15
Total Test Executions : 17

Passes : 17
Failures : 0
Skips : 0
```
<img width="932" height="332" alt="image" src="https://github.com/user-attachments/assets/765870cd-1947-466a-9e54-020eeecbfdd7" />

---

## Author

**Raushan Badal**

SDET Automation Framework Project

Built using Selenium WebDriver, Java, TestNG, Maven, and Jenkins.
