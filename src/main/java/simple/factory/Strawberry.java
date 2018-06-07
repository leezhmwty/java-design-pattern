package simple.factory;

/**
 * @author: lizhm
 * @date: 2018/6/7 22:25
 */
public class Strawberry implements Fruit {
    @Override
    public void grow() {
        log("strawberry growing!");
    }

    @Override
    public void plant() {
        log("strawberry growing!");
    }

    @Override
    public void harvest() {
        log("harvesting strawberry");
    }
}
