package factory.factoryMethod;

import bean.BeanB;
import bean.IBean;

public class BeanBFactory implements IBeanFactory {
    public IBean create() {
        return new BeanB();
    }
}
