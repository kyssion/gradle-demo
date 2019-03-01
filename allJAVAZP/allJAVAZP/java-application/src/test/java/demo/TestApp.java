package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestApp {
    @Test
    public void testAppHasAGreeting(){
        App classItem = new App();
        assertNotNull("app should have a greeting" , classItem.getGreeting());
    }
}
