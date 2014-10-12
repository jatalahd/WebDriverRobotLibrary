import org.robotframework.javalib.library.AnnotationLibrary;

public class WebDriverRobotLibrary extends AnnotationLibrary {
    public static final String ROBOT_LIBRARY_SCOPE = "TEST SUITE";
    public static final String ROBOT_LIBRARY_VERSION = "1.0";
    
    public WebDriverRobotLibrary() {
        super("org/robotframework/webdriverrobotlibrary/WebDriverKeywords.class");
    }
}
