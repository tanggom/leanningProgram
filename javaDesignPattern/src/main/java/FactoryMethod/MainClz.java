package FactoryMethod;

import org.junit.Test;

/**
 * @Description 工厂方法模式
 * 定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。
 * @auther tang
 * @create 2020-04-19 18:33
 */
public class MainClz {
    @Test
    public void createProduct(){
        Product product = new CarFactory().newProduct();
        Product product1 = new ShipFactory().newProduct();
        System.out.println(product);
        System.out.println(product1);
    }
}
