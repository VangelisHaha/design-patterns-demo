package strategy;

import strategy.behavior.impl.GuaGuaQuackBehavior;
import strategy.behavior.impl.NoFlyBehavior;

/**
 * 绿头鸭
 *
 * @author Vangelis
 * @date 2019-06-15 13:51
 */
public class RedHeadDuck extends AbstractDuck{
    public RedHeadDuck(){
        mFlyBehavior = new NoFlyBehavior();
        mQuackBehavior= new GuaGuaQuackBehavior();
    }
    /**
     * 鸭子的外表
     */
    @Override
    public void appearance() {
        System.out.println("我是红色的呀");
    }
}
