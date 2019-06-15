package strategy.behavior.impl;

import strategy.behavior.FlyBehavior;

/**
 * 不会飞行
 *
 * @author Vangelis
 * @date 2019-06-15 13:18
 */
public class NoFlyBehavior implements FlyBehavior {
    /**
     * 飞行方法
     */
    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
