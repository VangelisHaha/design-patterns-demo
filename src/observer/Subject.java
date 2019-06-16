package observer;

/**
 * Subject
 *
 * @author Vangelis
 * @date 2019-06-16 21:27
 */

public interface Subject {
    /**
     *  注册
     */
    void registerObserver(Observer observer);
    /**
     *  删除
     */
    void removeObserver(Observer observer);
    /**
     *  通知
     */
    void notifyObserver(Observer observer);
}
