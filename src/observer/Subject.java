package observer;

/**
 * Subject
 *
 * @author Vangelis
 * @date 2019-06-16 21:27
 */

public interface Subject {
    /**
     *  注册Observer
     * @param observer  observer
     */
    void registerObserver(Observer observer);
    /**
     * 删除
     * @param observer  observer
     */
    void removeObserver(Observer observer);

    /**
     *  通知
     * @param observer observer
     */
    void notifyObserver(Observer observer);
}
