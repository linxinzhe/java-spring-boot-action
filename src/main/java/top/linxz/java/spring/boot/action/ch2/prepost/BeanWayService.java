package top.linxz.java.spring.boot.action.ch2.prepost;

public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造方法-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destory-method");
    }
}
