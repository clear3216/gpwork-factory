package factory.abstractFactory;

import bean.IBean;
import bean.IBean2;

public interface IBeansFactory {

    IBean createIBean();

    IBean2 createIBean2();

}
