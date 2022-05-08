package spring5.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liuwei
 * @CreateDate 2022-04-12 19:39
 */

@Configuration      //将此类作为配置类，替代 xml配置文件
@ComponentScan(basePackages = {"spring5"})
public class Spring5Config {
}
