package annotation.basic;

import java.util.Arrays;

public class ElementData1Main {

    public static void main(String[] args) {
        Class<ElementData1> annoClass = ElementData1.class;
        AnnotationElement annotation = annoClass.getAnnotation(AnnotationElement.class);

        String value = annotation.value();
        System.out.println(value);

        int count = annotation.count();
        System.out.println(count);

        String[] tags = annotation.tags();
        System.out.println(Arrays.toString(tags));
    }

}
