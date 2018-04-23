package top.linxz.java.spring.boot.action.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

}
