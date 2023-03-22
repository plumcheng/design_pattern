package factory.abstractfactory.pizza;

/**
 * @author plumcheng
 * @create 2023-02-05 23:50
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
