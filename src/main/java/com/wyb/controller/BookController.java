package com.wyb.controller;

import com.wyb.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
