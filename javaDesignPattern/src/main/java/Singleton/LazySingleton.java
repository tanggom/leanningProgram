package Singleton;

import java.util.logging.Logger;

/**
 * @Description
 * 懒汉式单例:
 * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
 * @auther tang
 * @create 2020-04-19 17:00
 */
public class LazySingleton {
    private static Logger logger =  Logger.getLogger("LazySingleton");
    private static volatile LazySingleton instance =null;
    private LazySingleton(){
        logger.info("实例化LazySingleton");
        //私有化构造器
    }
    public static LazySingleton getInstance(){
        if (instance==null){
            logger.info("未实例化");
            instance =  new LazySingleton();
        }else{
            logger.info("已实例化");
        }
        return instance;
    }
}
