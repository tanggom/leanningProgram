package FactoryMethod;

/**
 * @Description
 * @auther tang
 * @create 2020-04-19 20:27
 */
public class ShipFactory implements ProductFactory {
    public Product newProduct() {
        return new Ship();
    }
}
