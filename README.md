Rest Assured Project with Java, TestNG, Eclipse IDE, and Maven

*Introduction*
This project demonstrates how to automate API testing using Rest Assured with Java, integrate with TestNG for test execution, and generate Allure reports for test results visualization.

*Setup Instructions*
Clone the repository using Git:
git clone

*Import Project into Eclipse IDE*
1. Open Eclipse IDE.
2. Click on File > Import.
3. Select Existing Maven Projects and click Next.
4. Browse to the directory where you cloned the repository and select the project.
5. Click Finish to import the project into Eclipse.


*Run the Project*
1. Navigate to testng.xml file
2. Right-click on testng.xml and select Run As > TestNG Suite to execute the test scenarios defined in testng.xml.
3. After running the project, refresh the project in Eclipse IDE to ensure Allure report files are generated.
4. Open a terminal or command prompt.
5. Run the following command to serve the Allure report:  allure serve path/to/allure-results     Replace path/to/allure-results with the actual path where Allure results are located.


*Project Structure*
1. src/test/java: Contains test classes where Rest Assured tests are implemented.
2. pom.xml: Maven project configuration file.
3. testng.xml file for defining test suites and configurations.

