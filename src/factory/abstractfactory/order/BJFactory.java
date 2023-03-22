package factory.abstractfactory.order;

import factory.abstractfactory.pizza.BJCheesePizza;
import factory.abstractfactory.pizza.BJPepperPizza;
import factory.abstractfactory.pizza.Pizza;

/**
 * @author plumcheng
 * @create 2023-02-05 23:46
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        // TODO Auto-generated method stub
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
