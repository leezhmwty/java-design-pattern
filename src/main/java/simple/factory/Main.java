package simple.factory;

/**
 * @author: lizhm
 * @date: 2018/6/7 22:32
 */
public class Main {

    public static void main(String[] args) {

        try {
            Apple apple = (Apple) FruitGardener.factory("apple");
            apple.plant();
            apple.grow();
            apple.harvest();
            apple.setTreeAge(3);
            apple.log(String.valueOf(apple.getTreeAge()));
        } catch (BadFruitException e) {
            e.printStackTrace();
        }
    }
}
