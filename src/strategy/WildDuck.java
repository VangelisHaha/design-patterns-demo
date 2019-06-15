package strategy;

import strategy.behavior.impl.GaGaQuackBehavior;
import strategy.behavior.impl.GoodFlyBehavior;

/**
 * 野鸭
 *
 * @author Vangelis
 * @date 2019-06-15 11:27
 */

public class WildDuck extends AbstractDuck{
    public WildDuck(){
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior= new GaGaQuackBehavior();
    }
    /**
     * 鸭子的外表
     */
    @Override
    public void appearance() {
        System.out.println("我体态优美呀~");
    }
}
