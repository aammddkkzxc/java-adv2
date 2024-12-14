package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class BasicV2 {

    public static void main(String[] args) {
        Class<BasicData> basicData = BasicData.class;

        System.out.println(basicData.getName());
        System.out.println(basicData.getSimpleName());
        System.out.println(basicData.getPackage());
        System.out.println(basicData.getSuperclass());
        System.out.println(Arrays.toString(basicData.getInterfaces()));
        System.out.println(basicData.isEnum());
        System.out.println(basicData.isAnnotation());

        int modifiers = basicData.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.toString(modifiers));
    }

}
