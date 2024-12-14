package reflection;

import reflection.data.Calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodV3 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        String methodName = sc.nextLine();

        System.out.println("숫자1 : ");
        int num1 = sc.nextInt();
        System.out.println("숫자2 : ");
        int num2 = sc.nextInt();

        Calculator calculator = new Calculator();
        Class<? extends Calculator> aClass = calculator.getClass();
        Method method = aClass.getDeclaredMethod(methodName, int.class, int.class);
        Object invoke = method.invoke(calculator, num1, num2);
        System.out.println(invoke);
    }

}
