package Prototype;

import java.util.logging.Logger;

/**
 * @Description
 * @auther tang
 * @create 2020-04-19 18:14
 */
public class PrototypeObj implements Cloneable{
    private static Logger logger = Logger.getLogger("PrototypeObj");
    private int i ;
    private Object obj;
    public PrototypeObj(int i,Object obj) {
        this.i=i;
        this.obj=obj;
        logger.info("构造器构造对象");
    }

    @Override
    protected PrototypeObj clone() throws CloneNotSupportedException {
        logger.info("浅克隆自身");
        return (PrototypeObj)super.clone();
    }

    @Override
    public String toString() {
        return "PrototypeObj{" +
                "i=" + i +
                ", obj=" + obj +
                '}';
    }
}
