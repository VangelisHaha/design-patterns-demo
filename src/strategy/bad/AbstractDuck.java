package strategy.bad;

/**
 * 鸭子超类
 * 共性的部分：呱呱叫 游泳
 *  不同的部分：游泳
 *
 * @author Vangelis
 * @date 2019-06-15 11:20
 */
public abstract class AbstractDuck {

    public AbstractDuck() {
    }

    /**
     *  所有的鸭子都会呱呱叫
     */
    public void quack(){
        System.out.println("我会呱呱叫~");
    }

    /**
     * 所有的鸭子游泳
     */
    public void swimming(){
        System.out.println("我会游泳~");
    }

    /**
     * 鸭子的外表
     */
    public abstract void appearance();

    /**
     *  添加鸭子会飞的方法
     */
    public void fly(){
        System.out.println("我会飞啦~");
    }

}
