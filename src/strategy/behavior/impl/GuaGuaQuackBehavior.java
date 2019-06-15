package strategy.behavior.impl;

import strategy.behavior.QuackBehavior;

/**
 * 呱呱的叫声
 *
 * @author Vangelis
 * @date 2019-06-15 13:41
 */

public class GuaGuaQuackBehavior implements QuackBehavior {
    /**
     * 叫声方法
     */
    @Override
    public void quack() {
        System.out.println("呱呱呱");
    }
}
