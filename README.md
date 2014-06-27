WebDriverRobotLibrary
=====================

Another Exploratory WebDriver Java library for Robot Framework, built upon the AnnotationLibrary provided by the Robot's javalib-core distribution.

This is a basic Maven project. To create a standalone jar package with dependencies, just type: mvn clean package

The ideology for this keyword library is to give maximum support for testing dynamic web pages. Almost all functional keywords by default use the WebDriver ExpectedConditions in connection with a WebDriverWait(). The default wait time can be adjusted with a specific keyword. As mentioned, this is an exploratory project and not even fully tested one. If the code seems interesting, just take it and have fun with it (= do your own mods).

To test the current implementation, please take the testpage.html as the web page to be tested and run the test.txt with jybot or the robotframework.jar. Please modify the path of testpage.html to test.txt before running the actual test. When using the jar distribution of robot framework, for running the test.txt one can use the commands:

set CLASSPATH=robotframework-2.x.x.jar;WebDriverRobotLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar;
java org.robotframework.RobotFramework run test.txt

Please also take a look at the WebDriverRobotLibrary.html for keyword documentation.

Happy testing!
