package strategy.bad;

/**
 * 野鸭
 *
 * @author Vangelis
 * @date 2019-06-15 11:27
 */

public class WildDuck extends AbstractDuck{
    /**
     * 鸭子的外表
     */
    @Override
    public void appearance() {
        System.out.println("我是野鸭，我外表苗条");
    }
}
