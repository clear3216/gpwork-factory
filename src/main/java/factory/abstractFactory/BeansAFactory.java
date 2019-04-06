package factory.abstractFactory;

import bean.BeanA;
import bean.IBean;
import bean.IBean2;
import bean.IBean2A;

public class BeansAFactory implements IBeansFactory {
    public IBean createIBean() {
        return new BeanA();
    }

    public IBean2 createIBean2() {
        return new IBean2A();
    }
}
