Now, lets Integrate TestNG Listenrs and log4j API for detailed logging.

For this, we will first add 2 dependencies in our pom.xml for log4j-core and log4j-api

then Create a package under the main directory named listeners and create a Testlogger Class inside that.

Where we will implement ITestListener interface and provide the definitions for abstract methods present in that interface.

We will also create lof4j2.xml file where we will define how and where logs will be logged.

and Finally we will use Logger class reference in our BasePage etc.

See these changes reflected in DemoQACompleteProject_2 named Repository.

Thank you !
