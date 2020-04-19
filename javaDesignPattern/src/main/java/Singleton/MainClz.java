package Singleton;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @Description
 * 单例模式:
 * 1.单例类只有一个实例对象
 * 2.该单例对象必须要由单例类自行创建
 * 3.单例类对外提供一个访问改单例的全局访问点
 * @auther tang
 * @create 2020-04-19 16:55
 */
public class MainClz extends TestCase {
    @Test
    public void testLazySingleton(){
       LazySingleton.getInstance();
       LazySingleton.getInstance();
       LazySingleton.getInstance();

       HungrySingleton.getInstance();
       HungrySingleton.getInstance();
       HungrySingleton.getInstance();
    }

}
