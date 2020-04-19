package FactoryMethod;

/**
 * @Description
 * @auther tang
 * @create 2020-04-19 20:26
 */
public class Ship implements Product {
    public int getLength() {
        return 100000;
    }

    public int getWidth() {
        return 30000;
    }
}
