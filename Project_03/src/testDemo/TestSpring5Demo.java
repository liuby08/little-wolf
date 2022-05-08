package testDemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.config.Spring5Config;
import spring5.service.UserService;

/**
 * @Author liuwei
 * @CreateDate 2022-04-11 18:33
 */
public class TestSpring5Demo {

    @Test
    public void testservice(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService =
                applicationContext.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testservice2(){
        //加载配置类
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Spring5Config.class);

        UserService userService =
                applicationContext.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
    }
}
