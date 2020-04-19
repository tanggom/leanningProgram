package FactoryMethod;

/**
 * @Description
 * @auther tang
 * @create 2020-04-19 20:26
 */
public class Car implements Product {
    public int getLength() {
        return 4000;
    }

    public int getWidth() {
        return 1700;
    }
}
