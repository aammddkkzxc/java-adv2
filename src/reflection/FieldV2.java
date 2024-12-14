package reflection;

import reflection.data.User;

import java.lang.reflect.Field;

public class FieldV2 {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        User user = new User("id1", "userA", 20);
        System.out.println(user.getName());

        Class<? extends User> aClass = user.getClass();
        Field nameField = aClass.getDeclaredField("name");

        nameField.setAccessible(true);
        nameField.set(user, "userB");
        System.out.println(user.getName());
    }

}
