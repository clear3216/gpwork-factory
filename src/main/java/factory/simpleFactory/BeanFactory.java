package factory.simpleFactory;

import bean.BeanA;
import bean.BeanB;
import bean.IBean;

public class BeanFactory {

    public static IBean create(String name) {
        if ("a".equals(name))
            return new BeanA();
        if ("b".equalsIgnoreCase(name))
            return new BeanB();
        return null;
    }

    public static Object createByClassName(String className) {
        try {
            return Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T createByClass(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
