package factory.abstractFactory;

import bean.*;

public class BeansBFactory implements IBeansFactory {
    public IBean createIBean() {
        return new BeanB();
    }

    public IBean2 createIBean2() {
        return new IBean2B();
    }
}
