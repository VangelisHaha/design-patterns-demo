package strategy.bad;

/**
 * 绿头鸭,绿头鸭有不同的外观
 *
 * @author Vangelis
 * @date 2019-06-15 11:27
 */

public class GreenHeadDuck extends AbstractDuck{
    /**
     * 鸭子的外表
     */
    @Override
    public void appearance() {
        System.out.println("我的头是绿色的哦");
    }

    /**
     * 添加鸭子会飞的方法
     */
    @Override
    public void fly() {
        System.out.println("我不会飞~~~");
    }
}
