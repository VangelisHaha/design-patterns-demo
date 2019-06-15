package strategy;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

/**
 * 鸭子超类
 *  添加不同的行为
 *
 * @author Vangelis
 * @date 2019-06-15 11:20
 */
public abstract class AbstractDuck {
    public AbstractDuck() {
    }
    /**
     * 鸭子飞的行为
     */
     FlyBehavior mFlyBehavior;
    /**
     *  鸭子叫的行为
     */
     QuackBehavior mQuackBehavior;
    /**
     * 鸭子飞的方法
     */
    public void fly(){
        this.mFlyBehavior.fly();
    }
    /**
     *  鸭子飞的方法
     */
    public void quack(){
        this.mQuackBehavior.quack();
    }

    /**
     * 鸭子的外表
     */
    public abstract void appearance();
}
