package kc.mybatisplus;

import kc.mybatisplus.component.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author pc
 * @date Create in  2023/3/21
 */

@SpringBootApplication
@ComponentScan("kc.mybatisplus")
@EnableTransactionManagement
public class MybatisPlusApplication {
    public static void main(String[] args) {
        ApplicationContext application= SpringApplication.run(MybatisPlusApplication.class, args);

    }
}
