package simple.factory;

/**
 * @author: lizhm
 * @date: 2018/6/7 22:28
 */
public class FruitGardener {

    public static Fruit factory(String type) throws BadFruitException {
        if (FruitTypeEnum.APPLE.getType().equals(type)) {
            return new Apple();
        } else if (FruitTypeEnum.GRAPE.getType().equals(type)) {
            return new Grape();
        } else if (FruitTypeEnum.STRAWBERRY.getType().equals(type)) {
            return new Strawberry();
        } else {
            throw new BadFruitException("Bad Fruit Request!");
        }
    }
}
