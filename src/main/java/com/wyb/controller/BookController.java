package com.wyb.controller;

import com.wyb.pojo.Book;
import com.wyb.pojo.Book1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    /**
     * Spring Boot 默认使用Jackson框架解析JSON
     * @param book
     * @return
     */
    @RequestMapping("/findBook")
    @ResponseBody
    public Book findBook(@RequestBody Book book){
        //观察页面闯入的json数据是否封装到Book对象
        System.out.println(book);
        //设置book的其他信息
        book.setAuthor("王泳波");
        book.setImage("SpringMybatis.jpg");
        book.setPrice(168.0);
        book.setRemark("完美的ssh组合的轻量级Java EE应用开发方式");
        return book;
    }

    @RequestMapping("/findBooks")
    @ResponseBody
    public List<Book1> findBooks(){
        // 创建集合
        List<Book1> books = new ArrayList<Book1>();
        // 添加图书对象
        books.add(new Book1(1,"疯狂Java讲义","李刚","java.jpg",109.0));
        books.add(new Book1(2,"轻量级JavaEE企业应用实战","李刚","ee.jpg",108.0));
        books.add(new Book1(3,"Spring MVC企业应用实战","肖文吉","SpringMyBatis.jpg",58.0));
        books.add(new Book1(4,"疯狂Android讲义","李刚","android.jpg",108.0));
        books.add(new Book1(5,"疯狂Ajax开发","李刚","ajax.jpg",79.0));
        // 返回集合
        return books;

    }
}
