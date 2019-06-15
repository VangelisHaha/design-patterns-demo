import strategy.AbstractDuck;
import strategy.GreenHeadDuck;
import strategy.RedHeadDuck;
import strategy.WildDuck;

/**
 * 测试类
 *
 * @author Vangelis
 * @date 2019-06-15 11:20
 */
public class Main {

    public static void main(String[] args) {
//        // 创建绿头鸭
//        AbstractDuck greenHeadDuck = new GreenHeadDuck();
//        //游泳
//        greenHeadDuck.swimming();
//        //外表
//        greenHeadDuck.appearance();
//        // 叫声
//        greenHeadDuck.quack();
//        System.out.println("``````````````````````````````````华丽的分割线`````````````````````````````````````````");
//        // 创建红头鸭
//        AbstractDuck redHeadDuck = new RedHeadDuck();
//        //游泳
//        redHeadDuck.swimming();
//        //外表
//        redHeadDuck.appearance();
//        // 叫声
//        redHeadDuck.quack();
        AbstractDuck greenHeadDuck = new GreenHeadDuck();
        System.out.println("绿鸭子");
        //飞
        greenHeadDuck.fly();
        //叫
        greenHeadDuck.quack();
        //外表
        greenHeadDuck.appearance();
        System.out.println("------------------------------------------------------------");
        System.out.println("红鸭子");
        AbstractDuck redHeadDuck = new RedHeadDuck();
        //飞
        redHeadDuck.fly();
        //叫
        redHeadDuck.quack();
        //外表
        redHeadDuck.appearance();
        System.out.println("------------------------------------------------------------");
        AbstractDuck wildDuck = new WildDuck();
        System.out.println("野鸭子");
        //飞
        wildDuck.fly();
        //叫
        wildDuck.quack();
        //外表
        wildDuck.appearance();
    }
}
