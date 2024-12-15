package annotation.basic;

@AnnoData
public class MetaData {

    // @AnnoData
    private String id;

    @AnnoData
    public void call() {

    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnoData typeAnno = MetaData.class.getAnnotation(AnnoData.class);
        System.out.println(typeAnno);

        AnnoData methodAnno = MetaData.class.getMethod("call").getAnnotation(AnnoData.class);
        System.out.println(methodAnno);
    }
}
