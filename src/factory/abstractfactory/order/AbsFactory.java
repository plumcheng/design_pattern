package factory.abstractfactory.order;

import factory.abstractfactory.pizza.Pizza;

/**
 * @author plumcheng
 * @create 2023-02-05 23:44
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);
}
