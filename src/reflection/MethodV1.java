package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Method;

public class MethodV1 {

    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        Method[] methods = helloClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("==================");

        Method[] declaredMethods = helloClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
    }

}
