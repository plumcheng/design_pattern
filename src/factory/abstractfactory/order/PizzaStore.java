package factory.abstractfactory.order;

import java.util.Calendar;

/**
 * @author plumcheng
 * @create 2023-02-05 23:48
 */
public class PizzaStore {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
        Calendar cal = Calendar.getInstance();
//注意月份下标从 0 开始，所以取月份要 +1
        System.out.println(" 年 :" + cal.get(Calendar.YEAR));
        System.out.println(" 月 :" + (cal.get(Calendar.MONTH) + 1));
        System.out.println(" 日 :" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(" 时 :" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(" 分 :" + cal.get(Calendar.MINUTE));
        System.out.println(" 秒 :" + cal.get(Calendar.SECOND));
    }
}
