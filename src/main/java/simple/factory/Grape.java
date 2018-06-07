package simple.factory;

/**
 * @author: lizhm
 * @date: 2018/6/7 22:23
 */
public class Grape implements Fruit{

    private boolean seedless;

    @Override
    public void grow() {
        log("grape growing!");
    }

    @Override
    public void plant() {
        log("planting grape!");
    }

    @Override
    public void harvest() {
        log("harvesting grape!");
    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}
