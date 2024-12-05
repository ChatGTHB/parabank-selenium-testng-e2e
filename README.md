
# ParabankTestAutomation

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF9E2C?style=for-the-badge&logo=testng&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit&logoColor=white)
![Allure](https://img.shields.io/badge/Allure-E94D5F?style=for-the-badge&logo=allure&logoColor=white)
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)

## 💡 Bootcamp Overview
This repository is created as part of the **Techcareer.net E2E Test Automation Workshop**. In this 10-hour workshop, participants learn the essentials of end-to-end (E2E) test automation. This hands-on workshop focuses on:
- Understanding E2E testing concepts.
- Speeding up automation processes and integrating them into real-world projects.
- Utilizing testing tools in practical scenarios to enhance efficiency and accuracy in software development.

Start your journey in E2E test automation and develop critical automation skills to improve software quality! 🎓💻

## 📁 Project Structure
Below is the project structure used in this repository:

```
src
├── main
│   ├── java
│   │   ├── base
│   │   │   ├── BaseLibrary.java
│   │   │   ├── BaseTest.java
│   │   │   └── Data.java
│   │   └── pages
│   │       ├── HomePage.java
│   │       ├── LoginPage.java
│   │       ├── MainPage.java
│   │       └── RegisterPage.java
├── test
│   └── java
│       ├── LoginTests.java
│       └── RegisterTests.java
└── pom.xml
```

## 📥 Installation
### Cloning the Repository
Clone the repository to your local machine:
```bash
git clone https://github.com/ChatGTHB/ParabankTestAutomation.git
```

### Importing into IntelliJ IDEA from VCS
1. Open IntelliJ IDEA.
2. Go to `File > New > Project from Version Control`.
3. Select `Git` and enter the repository URL: `https://github.com/ChatGTHB/ParabankTestAutomation.git`.
4. Click `Clone`.

### Dependencies
The project dependencies are managed through Maven, which automatically handles downloading and configuration. Key dependencies include:
- **Selenium WebDriver** for browser automation.
- **TestNG** and **JUnit** for testing framework support.
- **Allure TestNG** for reporting.
- **AspectJ Weaver** for AOP (Aspect-Oriented Programming) support.

For the complete list of dependencies, please refer to the [`pom.xml`](https://github.com/ChatGTHB/ParabankTestAutomation/blob/main/pom.xml) file.

## ⚙️ Usage
### Running Tests
You can run the tests either from the terminal or directly in IntelliJ IDEA.

#### Terminal
To run all test classes with Maven, use:
```bash
mvn test
```

#### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Navigate to the test class you want to run.
3. Right-click on the test class or method and select **Run**.

## ✨ Features
- **Page Object Model (POM)**: Clean and maintainable code structure.
- **TestNG & JUnit Integration**: Comprehensive test coverage using TestNG and JUnit.
- **Allure Reporting**: Generate in-depth and user-friendly test reports.
- **AspectJ for AOP**: Support for cross-cutting concerns such as logging.

For additional details on each feature and to explore the code, please refer to the relevant sections in the project.

## 📊 Allure Reports and Jenkins Integration
This project utilizes **Allure** for creating detailed test execution reports. Allure reports provide insights into test results, including passed, failed, and skipped test cases. Reports can be generated and viewed locally using:

```bash
# Generate Allure report
allure serve
```

For CI/CD, the project is compatible with **Jenkins**. Jenkins can automate test runs, generate Allure reports after each build, and provide a historical view of test stability, which is essential for maintaining high software quality standards.

## 🔧 Configuration
- **pom.xml**: Manage dependencies and plugins.

## 📚 Documentation
Detailed documentation is available in each class and method. Key documentation tools include:
- **JavaDocs** in code for inline documentation.
- **README.md** for setup and usage instructions.
- [**Selenium Documentation**](https://www.selenium.dev/documentation/)
- [**TestNG Documentation**](https://testng.org/doc/)
- [**Jenkins Documentation**](https://www.jenkins.io/doc/)
- [**Allure Documentation**](https://docs.qameta.io/allure/)

## 🛠️ Troubleshooting
If you encounter issues:
1. Verify Maven dependencies are correctly configured.
2. Check configurations in `pom.xml`.
3. For CI/CD issues, verify Jenkins configurations and Allure plugins.

## 👥 Contributors
- [ChatGTHB](https://github.com/ChatGTHB)

## 🤝 Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a Pull Request.

## 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

For more information on how to get started, visit the [ParabankTestAutomation GitHub repository](https://github.com/ChatGTHB/ParabankTestAutomation).
