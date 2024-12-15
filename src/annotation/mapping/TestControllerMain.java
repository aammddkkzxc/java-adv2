package annotation.mapping;

import java.lang.reflect.Method;

public class TestControllerMain {

    public static void main(String[] args) {
        TestController testController = new TestController();

        Class<? extends TestController> aClass = testController.getClass();
        for (Method m : aClass.getDeclaredMethods()) {
            SimpleMapping annotation = m.getAnnotation(SimpleMapping.class);
            if (annotation != null) {
                System.out.println("["+annotation.value() + "] -> " + m);
            }
        }
    }

}
