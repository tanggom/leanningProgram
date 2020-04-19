package Singleton;

import java.util.logging.Logger;

/**
 * @Description 饿汉式单例
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 * @auther tang
 * @create 2020-04-19 17:48
 */
public class HungrySingleton {
    private static Logger logger = Logger.getLogger("HungrySingleton");
    private HungrySingleton(){
        logger.info("实例化HungrySingleton");
    }
    private static HungrySingleton instance = new HungrySingleton();
    public static HungrySingleton getInstance(){
        logger.info("已实例化");
        return instance;
    }

}
