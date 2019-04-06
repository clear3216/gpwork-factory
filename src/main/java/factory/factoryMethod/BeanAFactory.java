package factory.factoryMethod;

import bean.BeanA;
import bean.IBean;

public class BeanAFactory implements IBeanFactory {
    public IBean create() {
        return new BeanA();
    }
}
