package simple.factory;

/**
 * @author: lizhm
 * @date: 2018/6/7 22:20
 */
public class Apple implements Fruit {


    private int treeAge;

    @Override
    public void grow() {
        log("apple growing!");
    }

    @Override
    public void plant() {
        log("planting apple!");
    }

    @Override
    public void harvest() {
        log("harvesting apple!");
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
