package simple.factory;

/**
 * @author: lizhm
 * @date: 2018/6/7 22:16
 */
public interface Fruit {


    void grow();

    void plant();

    void harvest();

    default void log(String log){
        System.out.println(log);
    }
}
