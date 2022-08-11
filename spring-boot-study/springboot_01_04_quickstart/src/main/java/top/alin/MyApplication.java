package top.alin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import top.alin.controller.BookController;
import top.alin.controller.User;

/**
 * @Author CandyWall
 * @Date 2022/1/18--0:48
 * @Description
 */
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(MyApplication.class);
        System.out.println("ctx.getBean(BookController.class) = " + ctx.getBean(BookController.class));
        System.out.println("ctx.getBean(User.class) = " + ctx.getBean(User.class));
    }
}
