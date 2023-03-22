package factory.abstractfactory.order;

import factory.abstractfactory.pizza.LDCheesePizza;
import factory.abstractfactory.pizza.LDPepperPizza;
import factory.abstractfactory.pizza.Pizza;

/**
 * @author plumcheng
 * @create 2023-02-05 23:47
 */
public class LDFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
