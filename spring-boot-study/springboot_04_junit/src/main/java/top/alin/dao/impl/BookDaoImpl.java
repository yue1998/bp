package top.alin.dao.impl;

import org.springframework.stereotype.Repository;
import top.alin.dao.BookDao;

/**
 * @Author CandyWall
 * @Date 2022/1/19--22:26
 * @Description
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDao is running...");
    }
}
