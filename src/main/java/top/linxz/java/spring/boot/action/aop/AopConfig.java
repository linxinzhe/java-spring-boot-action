package top.linxz.java.spring.boot.action.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("top.linxz.java.spring.boot.action.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
