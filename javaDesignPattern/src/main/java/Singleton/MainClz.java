package Singleton;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @Description
 * 单例模式:
 * 1.单例类只有一个实例对象
 * 2.该单例对象必须要由单例类自行创建
 * 3.单例类对外提供一个访问改单例的全局访问点
 *
 * 通常适用的场景的特点:
 * 1在应用场景中，某类只要求生成一个对象的时候，如一个班中的班长、每个人的身份证号等。
 * 2当对象需要被共享的场合。由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如 Web 中的配置对象、数据库的连接池等。
 * 3当某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等。
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
