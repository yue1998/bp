package top.alin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.alin.mapper.BookMapper;

@SpringBootTest
class Springboot07DruidApplicationTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
        System.out.println(bookMapper.getById(1));
    }

}
