package strategy.behavior.impl;

import strategy.behavior.FlyBehavior;

/**
 * 非常棒的飞行
 *
 * @author Vangelis
 * @date 2019-06-15 13:18
 */
public class GoodFlyBehavior implements FlyBehavior {
    /**
     * 飞行方法
     */
    @Override
    public void fly() {
        System.out.println("优秀的飞行技巧");
    }
}
