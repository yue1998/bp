package top.alin.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.alin.mapper.BookMapper;
import top.alin.pojo.Book;

/**
 * @Author CandyWall
 * @Date 2022/1/24--1:04
 * @Description
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {
}
