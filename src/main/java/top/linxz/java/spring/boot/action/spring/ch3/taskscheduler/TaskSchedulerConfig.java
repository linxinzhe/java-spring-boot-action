package top.linxz.java.spring.boot.action.spring.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("top.linxz.java.spring.boot.action.spring.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
