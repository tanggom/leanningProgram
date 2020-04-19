package Prototype;

import org.junit.Test;

/**
 * @Description 原型模式
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 * 在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。
 * 原型模式的克隆分为浅克隆和深克隆，Java 中的 Object 类提供了浅克隆的 clone() 方法，具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆，这里的 Cloneable 接口就是抽象原型类。
 * 浅克隆(ShallowClone):指拷贝对象时仅仅拷贝对象本身（包括对象中的基本变量），而不拷贝对象包含的引用指向的对象。
 * 深克隆(DeepClone):不仅拷贝对象本身，而且拷贝对象包含的引用指向的所有对象。
 * 原型模式通常适用于以下场景。
 * 1对象之间相同或相似，即只是个别的几个属性不同的时候。
 * 2对象的创建过程比较麻烦，但复制比较简单的时候。
 * @auther tang
 * @create 2020-04-19 18:07
 */
public class MainClz {
    @Test
    public void testClone() throws CloneNotSupportedException {
        PrototypeObj prototypeObj = new PrototypeObj(2,new Object());
        PrototypeObj clone = prototypeObj.clone();
        System.out.println("对比结果:"+(prototypeObj==clone));
        System.out.println(prototypeObj);
        System.out.println(clone);
    }
}
